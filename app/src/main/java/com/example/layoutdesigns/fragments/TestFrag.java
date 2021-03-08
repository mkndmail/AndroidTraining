package com.example.layoutdesigns.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.layoutdesigns.R;

public class TestFrag extends Fragment {
    TextView txtName,txtAge,txtAddress,txtDept;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);
        txtName=(TextView)view.findViewById(R.id.txt_name);
        txtAge=(TextView)view.findViewById(R.id.txt_age);
        txtAddress=(TextView)view.findViewById(R.id.txt_address);
        txtDept=(TextView)view.findViewById(R.id.txt_dept);

         Bundle b = getArguments();
        String name= b.getString("Name");
        String age= b.getString("Age");
        String address= b.getString("Address");
        String dept= b.getString("Dept");

        txtName.setText(name);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtDept.setText(dept);
        //Log.d("check","check");
        //Toast.makeText(getActivity(), "Click!", Toast.LENGTH_SHORT).show();
        return view;
    }
}
