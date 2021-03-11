package com.example.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddNameActivity extends AppCompatActivity {
    private EditText edt_name,
            edt_last_name,
            edt_mobile_number,
            edt_age;
    private Button btn_save_details;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("my_shared_preference", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setContentView(R.layout.activity_add_name);
        edt_name = findViewById(R.id.edt_name);
        edt_last_name = findViewById(R.id.edt_last_name);
        edt_mobile_number = findViewById(R.id.edt_mobile_number);
        edt_age = findViewById(R.id.edt_age);
        btn_save_details = findViewById(R.id.btn_save_details);

        btn_save_details.setOnClickListener(v -> {
            saveValuesInSharedPreference();
        });
        preFillUI();
    }

    private void abc(String userId) {
    }

    private void preFillUI() {
        if (sharedPreferences.getString("name", "") != null && !sharedPreferences.getString("name", "").isEmpty()) {
            edt_name.setText(sharedPreferences.getString("name", ""));
        }
        if (sharedPreferences.getString("last_name", "") != null && !sharedPreferences.getString("last_name", "").isEmpty()) {
            edt_last_name.setText(sharedPreferences.getString("last_name", ""));
        }
        if (sharedPreferences.getString("mobile_number", "") != null && !sharedPreferences.getString("mobile_number", "").isEmpty()) {
            edt_mobile_number.setText(sharedPreferences.getString("mobile_number", ""));
        }
        if (sharedPreferences.getString("age", "") != null && !sharedPreferences.getString("age", "").isEmpty()) {
            edt_age.setText(sharedPreferences.getString("age", ""));
        }
    }

    private void saveValuesInSharedPreference() {
        String name = getValueFromEditText(edt_name);
        String lastName = getValueFromEditText(edt_last_name);
        String mobileNumber = getValueFromEditText(edt_mobile_number);
        String age = getValueFromEditText(edt_age);
        saveValuesInSharedPreference("name", name);
        saveValuesInSharedPreference("last_name", lastName);
        saveValuesInSharedPreference("mobile_number", mobileNumber);
        saveValuesInSharedPreference("age", age);
        finish();
    }

    private void saveValuesInSharedPreference(String key, String value) {
        editor.putString(key, value).apply();
    }

    private String getValueFromEditText(EditText editText) {

        return editText.getText().toString();
    }
}