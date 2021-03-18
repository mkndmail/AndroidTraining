package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
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
import com.example.layoutdesigns.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RecyclerDatabaseActivity extends AppCompatActivity {

    EditText edtCarModel;
    EditText edtCarName;
    EditText edtCarRegNo;
    RecyclerView rvDB;
    TextView setData;
    LinearLayout carLayout;
    private CarRecordHelper carRecordHelper;
    private SQLiteDatabase sqLiteDatabase;
    List<Car> carList = new ArrayList<>();

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
        Button btnViewTable = findViewById(R.id.btn_view_table);
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
                try {
                    long newRowId = sqLiteDatabase.insert(CarContract.CarEntry.TABLE_NAME, null, values);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Exception" + e, Toast.LENGTH_SHORT).show();
                    Log.d("err",""+e);
                }
                edtCarModel.setText("");
                edtCarName.setText("");
                edtCarRegNo.setText("");
                try {
                    String columns[] = {CarContract.CarEntry.COLUMN_CAR_NAME, CarContract.CarEntry.COLUMN_CAR_MODEL, CarContract.CarEntry.COLUMN_CAR_REG_NO};
                    Cursor cursor = sqLiteDatabase.query(CarContract.CarEntry.TABLE_NAME, columns, null, null, null, null, null);
                    while (cursor.moveToNext()) {

                        int index1 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_NAME);
                        int index2 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_MODEL);
                        int index3 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_REG_NO);
                        String carName = cursor.getString(index1);
                        String carModel = cursor.getString(index2);
                        String regNumber = cursor.getString(index3);
                        //Car car = new Car(carName, carModel, regNumber);
                        //carList.add(carName,carModel,regNumber);
                        Toast.makeText(getApplicationContext(),""+carName+carModel+regNumber,Toast.LENGTH_SHORT).show();
                        Car car = new Car(carName,carModel,regNumber);
                        carList.add(car);
                    }
                    cursor.close();
                    // getValuesFromDatabase();

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();
                }


            }


        });

        btnViewTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RecyclerDatabaseActivity.this, ViewDB.class);
                startActivity(i);
            }
        });

        btnDropTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase.execSQL(CarContract.CarEntry.SQL_DELETE_ENTRIES_CAR_DB);
            }
        });
    }

//    private void clearFields() {
//
//
//    }
//
//    private void getValuesFromDatabase() {
//        String[] projection = {
//                BaseColumns._ID,
//                CarContract.CarEntry.COLUMN_CAR_NAME,
//                CarContract.CarEntry.COLUMN_CAR_MODEL
//        };
//        String selection = CarContract.CarEntry.COLUMN_CAR_REG_NO;
//        String sortOrder =
//                CarContract.CarEntry.COLUMN_CAR_NAME + " DESC";
//        Cursor cursor = sqLiteDatabase.query(
//                CarContract.CarEntry.TABLE_NAME,   // The table to query
//                null,             // The array of columns to return (pass null to get all)
//                null,              // The columns for the WHERE clause
//                null,          // The values for the WHERE clause
//                null,                   // don't group the rows
//                null,                   // don't filter by row groups
//                sortOrder               // The sort order
//        );
//        while (cursor.moveToNext()) {
////            TextView textView1 = new TextView(this);
//            String carname = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_NAME));
//            String model = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_MODEL));
//            String number = cursor.getString(cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_REG_NO));
//            setData.setText("Car Name : " + carname + " Car Model : " + model + " Reg. No : " + number);
//            //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
//            //carLayout.addView(textView1);
//        }
//        cursor.close();
//
//    }
}