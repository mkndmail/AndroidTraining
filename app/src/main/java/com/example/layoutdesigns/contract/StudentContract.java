package com.example.layoutdesigns.contract;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import com.example.layoutdesigns.Employee;
import com.example.layoutdesigns.model.Student;

public class StudentContract {

    private StudentContract() {
    }

    public static class StudentEntry implements BaseColumns {
        public static final String TABLE_NAME = "student_records";
        public static final String COLUMN_STUDENT_NAME = "name";
        public static final String COLUMN_STUDENT_LAST_NAME = "last_name";
        public static final String COLUMN_STUDENT_AGE = "age";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + StudentEntry.TABLE_NAME + " (" +
                        StudentEntry._ID + " INTEGER PRIMARY KEY," +
                        StudentEntry.COLUMN_STUDENT_NAME + " TEXT," +
                        StudentEntry.COLUMN_STUDENT_LAST_NAME + " TEXT," +
                        StudentEntry.COLUMN_STUDENT_AGE + " INTEGER)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + StudentEntry.TABLE_NAME;
    }

}
