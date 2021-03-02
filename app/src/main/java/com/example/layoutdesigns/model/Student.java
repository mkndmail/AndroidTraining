package com.example.layoutdesigns.model;

public class Student {
   public String name;
   public String department;
   public String address;
   public int age;
   public boolean isPresent;

    public Student(String name, String department, String address, int age, boolean isPresent) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.age = age;
        this.isPresent = isPresent;
    }
}
