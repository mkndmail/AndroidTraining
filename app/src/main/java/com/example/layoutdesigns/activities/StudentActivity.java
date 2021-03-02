package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.model.Student;
import com.example.layoutdesigns.adapter.StudentAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentActivity extends AppCompatActivity {
    private RecyclerView rvStudents;
    private StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        rvStudents = findViewById(R.id.rv_student);
        List<Student> studentList = getListOfStudent();
        studentAdapter = new StudentAdapter(studentList);
        rvStudents.setAdapter(studentAdapter);

    }
    List<Student> getListOfStudent(){
        List <Student> studentList = new ArrayList<>();
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

}
