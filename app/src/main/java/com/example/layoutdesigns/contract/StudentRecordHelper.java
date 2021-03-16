package com.example.layoutdesigns.contract;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentRecordHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "student_db";
    public static final int VERSION = 1;

    public StudentRecordHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(StudentContract.StudentEntry.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(StudentContract.StudentEntry.SQL_DELETE_ENTRIES);
        db.execSQL(StudentContract.StudentEntry.SQL_CREATE_ENTRIES);
    }


}
