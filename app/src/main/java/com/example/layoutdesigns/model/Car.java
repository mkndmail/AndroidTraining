package com.example.layoutdesigns.model;

public class Car {
    private String car_name;
    private String car_model;
    private String reg_no;

    public Car(String car_name, String car_model, String reg_no) {
        this.car_name = car_name;
        this.car_model = car_model;
        this.reg_no = reg_no;
    }

    public String getCar_name() {
        return car_name;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getReg_no() {
        return reg_no;
    }



}
