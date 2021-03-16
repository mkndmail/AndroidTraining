package com.example.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.layoutdesigns.contract.StudentContract;
import com.example.layoutdesigns.contract.StudentRecordHelper;

public class StudentRecordActivity extends AppCompatActivity {
    private EditText edtStudentName;
    private EditText edtStudentLastName;
    private EditText edtStudentAge;
    private Button btnSaveDetails;
    private StudentRecordHelper studentRecordHelper;
    private SQLiteDatabase sqLiteDatabase;
    private LinearLayout llStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_record);
        edtStudentName = findViewById(R.id.edt_student_name);
        edtStudentLastName = findViewById(R.id.edt_student_last_name);
        edtStudentAge = findViewById(R.id.edt_student_age);
        btnSaveDetails = findViewById(R.id.btn_save_details);
        llStudents = findViewById(R.id.ll_students);
        studentRecordHelper = new StudentRecordHelper(this);
        sqLiteDatabase = studentRecordHelper.getWritableDatabase();
        btnSaveDetails.setOnClickListener(v -> {
            ContentValues values = new ContentValues();
            values.put(StudentContract.StudentEntry.COLUMN_STUDENT_NAME, edtStudentName.getText().toString());
            values.put(StudentContract.StudentEntry.COLUMN_STUDENT_LAST_NAME, edtStudentLastName.getText().toString());
            values.put(StudentContract.StudentEntry.COLUMN_STUDENT_AGE, edtStudentAge.getText().toString());
            long newRowId = sqLiteDatabase.insert(StudentContract.StudentEntry.TABLE_NAME, null, values);
            clearFields();
            getValuesFromDatabase();
        });
    }

    private void clearFields() {
        edtStudentName.setText("");
        edtStudentLastName.setText("");
        edtStudentAge.setText("");
    }

    private void getValuesFromDatabase() {
        String[] projection = {
                BaseColumns._ID,
                StudentContract.StudentEntry.COLUMN_STUDENT_NAME,
                StudentContract.StudentEntry.COLUMN_STUDENT_LAST_NAME
        };
        String selection = StudentContract.StudentEntry.COLUMN_STUDENT_AGE + " = ?";
        String sortOrder =
                StudentContract.StudentEntry.COLUMN_STUDENT_NAME + " DESC";
        Cursor cursor = sqLiteDatabase.query(
                StudentContract.StudentEntry.TABLE_NAME,   // The table to query
                null,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );
        while (cursor.moveToNext()) {
            TextView textView = new TextView(this);
            String name = cursor.getString(cursor.getColumnIndex(StudentContract.StudentEntry.COLUMN_STUDENT_NAME));
            String lastName = cursor.getString(cursor.getColumnIndex(StudentContract.StudentEntry.COLUMN_STUDENT_LAST_NAME));
            String age = cursor.getString(cursor.getColumnIndex(StudentContract.StudentEntry.COLUMN_STUDENT_AGE));
            textView.setText("Name : " + name + " LastName : " + lastName + " Age: " + age);
            llStudents.addView(textView);
        }
        cursor.close();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sqLiteDatabase.close();
        studentRecordHelper.close();
    }
}