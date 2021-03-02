package com.example.layoutdesigns.model;

public class Employee {
   public    String name;
    public String department;
    public String technology;
    public int age;
    public boolean isPresent;

    public Employee(String name, String department, String technology, int age, boolean isPresent) {
        this.name = name;
        this.department = department;
        this.technology = technology;
        this.age = age;
        this.isPresent = isPresent;
    }
}
