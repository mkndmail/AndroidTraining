package com.example.layoutdesigns.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{
    private List<Student> studentList;


    public StudentAdapter(List<Student> student) {
        studentList = student;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student_list, parent, false);
        return new StudentViewHolder(studentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.txtStuName.setText("Name :" + student.name);
        holder.txtAge.setText("Age: " + student.age);
        holder.txtDepartment.setText("Department: " + student.department);
        holder.txtAddress.setText("Technology: " + student.address);
        if (student.isPresent) {
            holder.imgIsPresent.setImageResource(R.drawable.ic_present);
        } else {
            holder.imgIsPresent.setImageResource(R.drawable.ic_absent);
        }
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile;
        TextView txtStuName;
        TextView txtDepartment;
        TextView txtAge;
        TextView txtAddress;
        ImageView imgIsPresent;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.img_profile);
            txtStuName = itemView.findViewById(R.id.txt_stu_name);
            txtDepartment = itemView.findViewById(R.id.txt_stu_dept);
            txtAddress = itemView.findViewById(R.id.txt_stu_address);
            txtAge = itemView.findViewById(R.id.txt_age);
            imgIsPresent = itemView.findViewById(R.id.img_is_present);


        }
    }
}