package com.example.layoutdesigns;

import android.os.Parcel;
import android.os.Parcelable;

public class Employee implements Parcelable {
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTechnology() {
        return technology;
    }

    public int getAge() {
        return age;
    }

    public boolean isPresent() {
        return isPresent;
    }

    String name;
    String department;
    String technology;
    int age;
    boolean isPresent;

    public Employee(String name, String department, String technology, int age, boolean isPresent) {
        this.name = name;
        this.department = department;
        this.technology = technology;
        this.age = age;
        this.isPresent = isPresent;
    }

    protected Employee(Parcel in) {
        name = in.readString();
        department = in.readString();
        technology = in.readString();
        age = in.readInt();
        isPresent = in.readByte() != 0;
    }

    public static final Creator<Employee> CREATOR = new Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(department);
        dest.writeString(technology);
        dest.writeInt(age);
        dest.writeByte((byte) (isPresent ? 1 : 0));
    }
}
