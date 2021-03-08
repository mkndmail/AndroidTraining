package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.interfaces.IRecyclerClick;
import com.example.layoutdesigns.model.Employee;
import com.example.layoutdesigns.model.Student;
import com.example.layoutdesigns.adapter.StudentAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentActivity extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        RecyclerView rvStudents = findViewById(R.id.rv_student);
//        List<Student> studentList = getListOfStudent();
        // List<Employee> employeeList = getListOfEmployees();
        //   private RecyclerView rvStudents;
//        StudentAdapter studentAdapter = new StudentAdapter( getListOfStudent(), StudentActivity.this);
        rvStudents.setAdapter(new StudentAdapter(getListOfStudent(), StudentActivity.this));
        rvStudents.setLayoutManager(new LinearLayoutManager(StudentActivity.this));
//        rvStudents.setLayoutManager(new GridLayoutManager(StudentActivity.this, 2));
//        rvStudents.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

/*
        Button btnOne = findViewById(R.id.btn_one);
        btnOne.setOnClickListener(this);
        Button btnTwo = findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(this);*/

    }

    public void taskOnButtonClick() {
        Toast.makeText(StudentActivity.this, "Clicked!!", Toast.LENGTH_SHORT).show();
    }

//    List<Employee> getListOfEmployees() {
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        employeeList.add(new Employee("Mukund", "Technology", "Android", getAge(), getIsPresent()));
//        return employeeList;
//    }

    List<Student> getListOfStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Karan", "Engineering", "Jalandhar", getAge(), getIsPresent()));
        studentList.add(new Student("Arun", "Engineering", "Ludhiana", getAge(), getIsPresent()));
        studentList.add(new Student("Hanuman ", "Engineering", "Chandigarh", getAge(), getIsPresent()));
        studentList.add(new Student("Aman", "Engineering", "Ambala", getAge(), getIsPresent()));
        studentList.add(new Student("Kamal", "Engineering", "New Delhi", getAge(), getIsPresent()));
        studentList.add(new Student("Naman", "Engineering", "Gurgaon", getAge(), getIsPresent()));
        studentList.add(new Student("Sham", "Engineering", "Noida", getAge(), getIsPresent()));
        studentList.add(new Student("Ram", "Engineering", "Sonipat", getAge(), getIsPresent()));
        studentList.add(new Student("Jatin", "Engineering", "Panipat", getAge(), getIsPresent()));
        studentList.add(new Student("Parav", "Engineering", "Karnal", getAge(), getIsPresent()));
        studentList.add(new Student("Viaks", "Engineering", "Noida", getAge(), getIsPresent()));
        studentList.add(new Student("Ajay", "Engineering", "Lucknow", getAge(), getIsPresent()));
        studentList.add(new Student("Rohan", "Engineering", "Mumbai", getAge(), getIsPresent()));
        studentList.add(new Student("Lalit", "Engineering", "Goa", getAge(), getIsPresent()));
        studentList.add(new Student("Chirag", "Engineering", "Mirzoram", getAge(), getIsPresent()));
        studentList.add(new Student("Saurav", "Engineering", "Sikkim", getAge(), getIsPresent()));
        studentList.add(new Student("Gagan", "Engineering", "Kolkata", getAge(), getIsPresent()));
        studentList.add(new Student("Sharry", "Engineering", "Nagpur", getAge(), getIsPresent()));
        studentList.add(new Student("Lucky", "Engineering", "Pune", getAge(), getIsPresent()));
        studentList.add(new Student("Manoj", "Engineering", "Hyderabad", getAge(), getIsPresent()));
        studentList.add(new Student("Krishna", "Engineering", "Banglore", getAge(), getIsPresent()));
        studentList.add(new Student("Sunil", "Engineering", "Chennai", getAge(), getIsPresent()));
        studentList.add(new Student("Kapil", "Engineering", "Shimla", getAge(), getIsPresent()));

        return studentList;
    }

    private boolean getIsPresent() {
        return new Random().nextInt(10) % 2 == 0;
    }

    private int getAge() {
        return new Random().nextInt(60);
    }

//    @Override
//    public void onClick(View v) {
//      /*  switch (v.getId()) {
//            case R.id.btn_one:
//            case R.id.btn_two:
//            case R.id.btn_three:
//            case R.id.btn_four:
//            case R.id.btn_five:
//                taskOnButtonClick();
//                break;
//        }*/
//    }

//    @Override
//    public void onRecyclerItemClick(Student student) {
//
//    }

//    @Override
//    public void onRecyclerItemClick(Student student) {
//        Toast.makeText(StudentActivity.this, "Hahaha: " + student.getAddress(), Toast.LENGTH_SHORT).show();
//    }
}
