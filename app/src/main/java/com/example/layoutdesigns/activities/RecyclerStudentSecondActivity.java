package com.example.layoutdesigns.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.layoutdesigns.R;

public class RecyclerStudentSecondActivity extends AppCompatActivity {
//    public static final int REQUEST_CODE = 1001;
//    static String TEXT_NAME = "";
////    static String TEXT_AGE = "";
////    static String TEXT_DEPT = "";
////    static String TEXT_ADDRESS = "";
//private Context context;
//    String name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_student_second);
        TextView textName = findViewById(R.id.text_name);
        TextView textAge = findViewById(R.id.text_age);
        TextView textDept = findViewById(R.id.text_dept);
        TextView textAdd = findViewById(R.id.text_address);

        Intent i = getIntent();
        String name = i.getStringExtra("txtStuName");
        String age = i.getStringExtra("txtAge");
        String dept = i.getStringExtra("txtDepartment");
        String address = i.getStringExtra("txtAddress");
        textName.setText(name);
        textAge.setText(age);
        textDept.setText(dept);
        textAdd.setText(address);

    }
}



