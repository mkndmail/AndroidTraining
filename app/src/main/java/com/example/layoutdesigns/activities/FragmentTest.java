package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.fragments.TestFrag;


public class FragmentTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);

        EditText edtName = (EditText)findViewById(R.id.edt_name);
        EditText edtAge = (EditText)findViewById(R.id.edt_age);
        EditText edtAddress = (EditText)findViewById(R.id.edt_address);
        EditText edtDept = (EditText)findViewById(R.id.edt_dept);
        Button submitDetails = (Button) findViewById(R.id.submit_details);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.frame_layout_fragment_test);
        LinearLayout test = (LinearLayout)findViewById(R.id.layout_fragment_test);


       FragmentManager fragmentManager = getSupportFragmentManager();
final        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

      final  TestFrag testFragment =  new TestFrag();
       // fragmentTransaction.add(R.id.frame_layout_fragment_test,testFragment);

        submitDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           test.setVisibility(v.GONE);
              frameLayout.setVisibility(v.VISIBLE);
                Bundle bundle = new Bundle();
                bundle.putString("Name","Name: "+edtName.getText().toString());
                bundle.putString("Age","Age: "+edtAge.getText().toString());
                bundle.putString("Address","Address: "+edtAddress.getText().toString());
                bundle.putString("Dept","Department: "+edtDept.getText().toString());
                testFragment.setArguments(bundle);


                getSupportFragmentManager().beginTransaction().replace
                (R.id.frame_layout_fragment_test,testFragment).commit();

            }
        });
    }
}