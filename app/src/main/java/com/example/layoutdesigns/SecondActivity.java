package com.example.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText edtPersonName, edtLastName, edtAge;
    private Button btnGoBack, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String firstName = "";
        String lastName = "";
        String age = "";
        if (getIntent() != null) {
            firstName = getIntent().getExtras().getString(MainActivity.PERSON_NAME);
            lastName = getIntent().getStringExtra("last_name");
            age = getIntent().getStringExtra("age");

        }
        edtPersonName = findViewById(R.id.edt_person_name);
        edtLastName = findViewById(R.id.edt_last_name);
        edtAge = findViewById(R.id.edt_age);
        btnGoBack = findViewById(R.id.btn_go_back);
        btnClear = findViewById(R.id.btn_clear);
        edtPersonName.setText(firstName);
        edtLastName.setText(lastName);
        edtAge.setText(age);
        btnClear.setOnClickListener(e -> {
            edtPersonName.setText("");
        });
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataIntent = new Intent();
                dataIntent.putExtra(MainActivity.PERSON_AGE, edtAge.getText().toString());
                dataIntent.putExtra(MainActivity.PERSON_LAST_NAME, edtLastName.getText().toString());
                dataIntent.putExtra(MainActivity.PERSON_NAME, edtPersonName.getText().toString());
                setResult(RESULT_CANCELED, dataIntent);
                finish();
            }
        });
    }
}