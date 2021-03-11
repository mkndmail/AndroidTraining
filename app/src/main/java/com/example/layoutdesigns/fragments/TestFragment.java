package com.example.layoutdesigns.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.layoutdesigns.R;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link TestFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class TestFragment extends Fragment {
    TextView txtName,txtAge,txtAddress,txtDept;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//

    public TestFragment() {
        // Required empty public constructor
    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     *
//     * @return A new instance of fragment TestFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static TestFragment newInstance(String param1, String param2) {
//        TestFragment fragment = new TestFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_test, container, false);
        txtName=(TextView)view.findViewById(R.id.txt_name);
        txtAge=(TextView)view.findViewById(R.id.txt_age);
        txtAddress=(TextView)view.findViewById(R.id.txt_address);
        txtDept=(TextView)view.findViewById(R.id.txt_dept);

       // Bundle b = getArguments();
        String name= this.getArguments().getString("Name");
        String age= this.getArguments().getString("Age");
        String address= this.getArguments().getString("Address");
        String dept= this.getArguments().getString("Dept");

        txtName.setText(name);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtDept.setText(dept);
        Log.d("check","check");
        Toast.makeText(getActivity(), "Click!", Toast.LENGTH_SHORT).show();

        return view;
    }
}