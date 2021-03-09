package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.layoutdesigns.R;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        EditText name = findViewById(R.id.editTextName);
        EditText age = findViewById(R.id.editTextAge);
        EditText address = findViewById(R.id.editTextAddress);
        EditText department = findViewById(R.id.editTextDepartment);

        Button showText = findViewById(R.id.show_text);

        TextView textName = findViewById(R.id.txt_custom_name);
        TextView textAge = findViewById(R.id.txt_custom_age);
        TextView textAddress = findViewById(R.id.txt_custom_address);
        TextView textDepartment = findViewById(R.id.txt_custom_department);

        showText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = name.getText().toString();
                String getAge =  age.getText().toString();
                String getAddress = address.getText().toString();
                String getDepartment = department.getText().toString();
                textName.setText(getName);
                textAge.setText(getAge);
                textAddress.setText(getAddress);
                textDepartment.setText(getDepartment);
                Typeface font = Typeface.createFromAsset(getAssets(), "amatic.ttf");
                textName.setTypeface(font);
                textAge.setTypeface(font);
                textAddress.setTypeface(font);
                textDepartment.setTypeface(font);
            }
        });
    }
}