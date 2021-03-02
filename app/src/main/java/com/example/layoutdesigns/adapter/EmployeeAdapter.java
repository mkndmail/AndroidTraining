package com.example.layoutdesigns.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.model.Employee;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private List<Employee> employeeList;

    public EmployeeAdapter(List<Employee> employees) {
        employeeList = employees;
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = employeeList.get(position);
        holder.txtEmpName.setText("Name :" + employee.name);
        holder.txtAge.setText("Age: " + employee.age);
        holder.txtDepartment.setText("Department: " + employee.department);
        holder.txtTechnology.setText("Technology: " + employee.technology);
        if (employee.isPresent) {
            holder.imgIsPresent.setImageResource(R.drawable.ic_present);
        } else {
            holder.imgIsPresent.setImageResource(R.drawable.ic_absent);
        }
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View employeeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_employee_list, parent, false);
        return new EmployeeViewHolder(employeeView);
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView txtEmpName;
        TextView txtDepartment;
        TextView txtAge;
        TextView txtTechnology;
        ImageView imgIsPresent;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.img_profile);
            txtEmpName = itemView.findViewById(R.id.txt_emp_name);
            txtDepartment = itemView.findViewById(R.id.txt_department);
            txtTechnology = itemView.findViewById(R.id.txt_technology);
            txtAge = itemView.findViewById(R.id.txt_age);
            imgIsPresent = itemView.findViewById(R.id.img_is_present);
        }
    }
}
