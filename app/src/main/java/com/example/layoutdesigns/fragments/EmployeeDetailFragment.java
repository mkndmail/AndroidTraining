package com.example.layoutdesigns.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.layoutdesigns.Employee;
import com.example.layoutdesigns.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EmployeeDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmployeeDetailFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "employee_data";

    // TODO: Rename and change types of parameters
    private Employee employee;
    private TextView txt_person_name,
            txt_department,
            txt_technology,
            txt_age;
    private ImageView img_is_present;

    public EmployeeDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param employee Parameter 2.
     * @return A new instance of fragment EmployeeDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EmployeeDetailFragment newInstance(Employee employee) {
        EmployeeDetailFragment fragment = new EmployeeDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, employee);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            employee = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    private void updateUI(Employee employee) {
        setTextInView(employee.getName(), txt_person_name);
        setTextInView(employee.getDepartment(), txt_department);
        setTextInView(employee.getTechnology(), txt_technology);
        setTextInView("" + employee.getAge(), txt_age);
        if (employee.isPresent()) {
            img_is_present.setBackgroundResource(R.drawable.ic_present);
        } else
            img_is_present.setBackgroundResource(R.drawable.ic_absent);
    }

    private void setTextInView(String textString, TextView textView) {
        textView.setText(textString);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employee_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt_person_name = view.findViewById(R.id.txt_person_name);
        txt_department = view.findViewById(R.id.txt_department);
        txt_technology = view.findViewById(R.id.txt_technology);
        txt_age = view.findViewById(R.id.txt_age);
        img_is_present = view.findViewById(R.id.img_is_present);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        updateUI(employee);
    }


}