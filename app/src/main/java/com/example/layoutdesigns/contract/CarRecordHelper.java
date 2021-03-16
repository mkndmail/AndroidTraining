package com.example.layoutdesigns.contract;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CarRecordHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "car_test_db";
    public static final int VERSION = 2;

    public CarRecordHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CarContract.CarEntry.SQL_CREATE_ENTRIES_CAR_DB);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CarContract.CarEntry.SQL_DELETE_ENTRIES_CAR_DB);
        db.execSQL(CarContract.CarEntry.SQL_CREATE_ENTRIES_CAR_DB);
    }
}
