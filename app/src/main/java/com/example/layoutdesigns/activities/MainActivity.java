package com.example.layoutdesigns.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.layoutdesigns.R;

public class MainActivity extends AppCompatActivity {
    private TextView textHelloWorld;
    private TextView textFirstLayout;
    EditText edtPersonName;
    EditText edtLastName;
    EditText edtAge;
    static String PERSON_NAME = "name";
    static String PERSON_LAST_NAME = "last_name";
    static String PERSON_AGE = "age";
    public static final int REQUEST_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFirstLayout = findViewById(R.id.text_first_layout);
        textHelloWorld = findViewById(R.id.text_hello_world);
        Button btnChangeValues = findViewById(R.id.btn_change_values);
        Button btnReset = findViewById(R.id.btn_reset);
        Button btnActivity = findViewById(R.id.btn_activity_second);
        Button btnScoreCard = findViewById(R.id.btn_scorecard_activity);
        edtPersonName = findViewById(R.id.edt_person_name);
        edtLastName = findViewById(R.id.edt_last_name);
        edtAge = findViewById(R.id.edt_age);

        btnChangeValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textHelloWorld.setText("Welcome to Android! Karan");
                textFirstLayout.setText("This is your first Android project");
            }
        });
        btnReset.setOnClickListener(v -> {
            textHelloWorld.setText(R.string.hello_world);
            textFirstLayout.setText(R.string.this_is_our_first_layout);
        });

        btnScoreCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScoreCardActivity.class));
            }
        });
    }

    public void startActivityB(View view) {
       /* String personName = edtPersonName.getText().toString();
        String lastName = edtLastName.getText().toString();
        String age = edtAge.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(PERSON_NAME, personName);
        intent.putExtra(PERSON_LAST_NAME, lastName);
        intent.putExtra(PERSON_AGE, age);
        startActivityForResult(intent, REQUEST_CODE);*/
        Intent intent = new Intent(this, EmployeeListActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
            String name = data.getStringExtra(PERSON_NAME);
            String lastName = data.getStringExtra(PERSON_LAST_NAME);
            String age = data.getStringExtra(PERSON_AGE);
            edtPersonName.setText(name);
            edtPersonName.setEnabled(false);
            edtLastName.setText(lastName);
            edtLastName.setEnabled(false);
            edtAge.setText(age);
            edtAge.setEnabled(false);
        } else {
            Toast.makeText(this, "No need to edit the fields", Toast.LENGTH_SHORT).show();
        }
    }
}