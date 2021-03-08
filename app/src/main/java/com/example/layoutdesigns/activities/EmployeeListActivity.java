package com.example.layoutdesigns.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutdesigns.fragments.EmployeeDetailFragment;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.model.Employee;
import com.example.layoutdesigns.adapter.EmployeeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EmployeeListActivity extends AppCompatActivity implements EmployeeAdapter.ItemClickListener {
    private RecyclerView rvEmployees;
    private EmployeeAdapter employeeAdapter;
    private LinearLayout llRv;
    private FrameLayout frame_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);
        rvEmployees = findViewById(R.id.rv_employees);
        frame_container = findViewById(R.id.frame_container);
        List<Employee> employeeList = getListOfEmployees();
        employeeAdapter = new EmployeeAdapter(employeeList, (EmployeeAdapter.ItemClickListener) this);
        rvEmployees.setAdapter(employeeAdapter);
    }

    List<Employee> getListOfEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
        return employeeList;
    }

    private int getAge() {
        return new Random().nextInt(60);
    }

    private boolean getIsPresent() {
        return new Random().nextInt(10) % 2 == 0;
    }

    @Override
    public void itemClick(Employee employee) {
        rvEmployees.setVisibility(View.GONE);
        frame_container.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().
                add(R.id.frame_container, EmployeeDetailFragment.newInstance(employee))
                .commit();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentById(R.id.frame_container) instanceof EmployeeDetailFragment) {
            setRecyclerViewAgain();
        } else super.onBackPressed();

    }

    private void setRecyclerViewAgain() {
        frame_container.setVisibility(View.GONE);
        rvEmployees.setVisibility(View.VISIBLE);
    }
}