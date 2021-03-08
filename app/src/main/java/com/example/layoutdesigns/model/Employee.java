package com.example.layoutdesigns.model;

public class Employee {
    private String name;
    private String department;
    private String technology;
    private int age;

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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
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

    private boolean isPresent;

    public Employee(String name, String department, String technology, int age, boolean isPresent) {
        this.name = name;
        this.department = department;
        this.technology = technology;
        this.age = age;
        this.isPresent = isPresent;
    }
}
