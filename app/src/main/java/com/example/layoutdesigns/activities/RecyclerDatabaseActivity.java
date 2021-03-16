package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.adapter.CarAdapter;
import com.example.layoutdesigns.adapter.StudentAdapter;
import com.example.layoutdesigns.contract.CarContract;
import com.example.layoutdesigns.contract.CarRecordHelper;
import com.example.layoutdesigns.contract.StudentContract;
import com.example.layoutdesigns.contract.StudentRecordHelper;

public class RecyclerDatabaseActivity extends AppCompatActivity {

    EditText edtCarModel;
    EditText edtCarName;
    EditText edtCarRegNo;
    RecyclerView rvDB;
    TextView setData;
    LinearLayout carLayout;
    private CarRecordHelper carRecordHelper;
    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_database);
        edtCarModel = findViewById(R.id.edt_car_model);
        edtCarName = findViewById(R.id.edt_car_name);
        edtCarRegNo = findViewById(R.id.edt_car_reg_no);
        setData = findViewById(R.id.textView);
        Button btnSaveDetails = findViewById(R.id.btn_save_details);
        Button btnDropTable = findViewById(R.id.btn_drop_table);
        LinearLayout carLayout = findViewById(R.id.ll_car);
//        RecyclerView rvDB = findViewById(R.id.rv_db);
//        rvDB.setAdapter(new CarAdapter(getValuesFromDatabase(), RecyclerDatabaseActivity.this));
//        rvDB.setLayoutManager(new LinearLayoutManager(RecyclerDatabaseActivity.this));
        carRecordHelper = new CarRecordHelper(this);
        sqLiteDatabase = carRecordHelper.getWritableDatabase();

        btnSaveDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put(CarContract.CarEntry.COLUMN_CAR_NAME, edtCarName.getText().toString());
                values.put(CarContract.CarEntry.COLUMN_CAR_MODEL, edtCarModel.getText().toString());
                values.put(CarContract.CarEntry.COLUMN_CAR_REG_NO, edtCarRegNo.getText().toString());
                long newRowId = sqLiteDatabase.insert(CarContract.CarEntry.TABLE_NAME, null, values);
                edtCarModel.setText(" ");
                edtCarName.setText(" ");
                edtCarRegNo.setText(" ");
                getValuesFromDatabase();
            }


        });


    }

    private void clearFields() {


    }

    private void getValuesFromDatabase() {
        String[] projection = {
                BaseColumns._ID,
                CarContract.CarEntry.COLUMN_CAR_NAME,
                CarContract.CarEntry.COLUMN_CAR_MODEL
        };
        String selection = CarContract.CarEntry.COLUMN_CAR_REG_NO;
        String sortOrder =
                CarContract.CarEntry.COLUMN_CAR_NAME + " DESC";
        Cursor cursor = sqLiteDatabase.query(
                CarContract.CarEntry.TABLE_NAME,   // The table to query
                null,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );
        while (cursor.moveToNext()) {
//            TextView textView1 = new TextView(this);
            String carname = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_NAME));
            String model = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_MODEL));
            String number = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_REG_NO));
            setData.setText("Car Name : " + carname + " Car Model : " + model + " Reg. No : " + number);
            //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
            //carLayout.addView(textView1);
        }
        cursor.close();

    }
}