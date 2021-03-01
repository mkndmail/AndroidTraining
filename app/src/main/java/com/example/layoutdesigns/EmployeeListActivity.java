package com.example.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EmployeeListActivity extends AppCompatActivity {
    private RecyclerView rvEmployees;
    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);
        rvEmployees = findViewById(R.id.rv_employees);
        List<Employee> employeeList = getListOfEmployees();
        employeeAdapter = new EmployeeAdapter(employeeList);
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
}