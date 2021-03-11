package com.example.layoutdesigns.model;

public class Student {
    private String name;
    private String department;
    private String address;
    private int age;
    private boolean isPresent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Student(String name, String department, String address, int age, boolean isPresent) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.age = age;
        this.isPresent = isPresent;
    }
}
