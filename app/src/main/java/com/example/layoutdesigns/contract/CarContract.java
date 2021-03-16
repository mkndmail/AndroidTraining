package com.example.layoutdesigns.contract;

import android.provider.BaseColumns;

public class CarContract {
    private CarContract() {

    }

    public static class CarEntry implements BaseColumns {
        public static final String TABLE_NAME = "car_record";
        public static final String COLUMN_CAR_NAME = "car_name";
        public static final String COLUMN_CAR_MODEL = "car_model";
        public static final String COLUMN_CAR_REG_NO = "reg_no";

        public static final String SQL_CREATE_ENTRIES_CAR_DB =
                "CREATE TABLE " + CarContract.CarEntry.TABLE_NAME + " (" +
                        CarContract.CarEntry._ID + " INTEGER PRIMARY KEY," +
                        CarEntry.COLUMN_CAR_NAME + " TEXT," +
                        CarEntry.COLUMN_CAR_MODEL + " TEXT," +
                        CarEntry.COLUMN_CAR_REG_NO + " TExT)";

        public static final String SQL_DELETE_ENTRIES_CAR_DB =
                "DROP TABLE IF EXISTS " + CarContract.CarEntry.TABLE_NAME;

    }
}
