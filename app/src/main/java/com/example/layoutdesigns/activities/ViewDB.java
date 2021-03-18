package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.adapter.CarAdapter;
import com.example.layoutdesigns.contract.CarContract;
import com.example.layoutdesigns.contract.CarRecordHelper;
import com.example.layoutdesigns.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ViewDB extends AppCompatActivity {
    List<Car> carList = new ArrayList<>();
    CarRecordHelper carRecordHelper;
    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_d_b);
        RecyclerView rvStudents = findViewById(R.id.rv_car);
        rvStudents.setAdapter(new CarAdapter(getAllCars()));
        rvStudents.setLayoutManager(new LinearLayoutManager(ViewDB.this));
    }
    public List<Car> getAllCars(){
        carRecordHelper = new CarRecordHelper(this);
        sqLiteDatabase = carRecordHelper.getWritableDatabase();
        String columns[] = {CarContract.CarEntry.COLUMN_CAR_NAME, CarContract.CarEntry.COLUMN_CAR_MODEL, CarContract.CarEntry.COLUMN_CAR_REG_NO};
        Cursor cursor = sqLiteDatabase.query(CarContract.CarEntry.TABLE_NAME, columns, null, null, null, null, null);
        while (cursor.moveToNext()) {

            int index1 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_NAME);
            int index2 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_MODEL);
            int index3 = cursor.getColumnIndex(CarContract.CarEntry.COLUMN_CAR_REG_NO);
            String carName = cursor.getString(index1);
            String carModel = cursor.getString(index2);
            String regNumber = cursor.getString(index3);
            Car car = new Car(carName, carModel, regNumber);
            carList.add(car);

        }
        cursor.close();
        return carList;
    }
}
