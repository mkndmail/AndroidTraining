package com.example.layoutdesigns.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.activities.RecyclerStudentSecondActivity;
import com.example.layoutdesigns.activities.StudentActivity;
import com.example.layoutdesigns.interfaces.IRecyclerClick;
import com.example.layoutdesigns.model.Employee;
import com.example.layoutdesigns.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<Student> studentList;
    private Context context;
    private IRecyclerClick iRecyclerClick;
    private final int studentView = 0;
    private final int secondStudentView = 1;

    public StudentAdapter(List<Student> student, Context context) {
        this.studentList = student;
        this.context = context;
        this.iRecyclerClick = iRecyclerClick;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View view;
//
//        if (viewType == 0) {
//            view = layoutInflater.inflate(R.layout.row_student_list, parent, false);
//            return new StudentViewHolder(view);
//        }else {
//
//            view = layoutInflater.inflate(R.layout.second_row_student, parent, false);
//            return new SecondStudentViewHolder(view);
//        }
        View modelView;
        //RecyclerView.ViewHolder viewHolder = null;
        if (viewType == studentView) {
            modelView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student_list, parent, false);
            return new StudentViewHolder(modelView);
        } else {
            modelView = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_row_student, parent, false);
            return new SecondStudentViewHolder(modelView);
        }
        //return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (holder instanceof StudentViewHolder) {
            StudentViewHolder studentViewHolder = (StudentViewHolder) holder;
     /*   }
        if (holder.getItemViewType() == studentView) {*/
           // Student student = studentList.get(position);
            //  StudentViewHolder studentViewHolder = (StudentViewHolder) holder;
            studentViewHolder.txtStuName.setText("Name :" + studentList.get(position).getName());
            studentViewHolder.txtAge.setText("Age: " + studentList.get(position).getAge());
            studentViewHolder.txtDepartment.setText("Department: " + studentList.get(position).getDepartment());
            studentViewHolder.txtAddress.setText("Address: " + studentList.get(position).getAddress());
//            if (studentList.get(position).isPresent()) {
//                studentViewHolder.imgIsPresent.setImageResource(R.drawable.ic_present);
//            } else {
//                studentViewHolder.imgIsPresent.setImageResource(R.drawable.ic_absent);
//            }
            studentViewHolder.imgIsPresent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // iRecyclerClick.onRecyclerItemClick(studentList.get(position));
                    studentList.remove(position);
                    notifyItemRemoved(position);
                    notifyItemChanged(position, studentList.size());
                }
            });
            studentViewHolder.firstLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), RecyclerStudentSecondActivity.class);
                    i.putExtra("txtStuName", "Name :" + studentList.get(position).getName());
                    i.putExtra("txtAge","Age: " + studentList.get(position).getAge());
                    i.putExtra("txtDepartment","Department: " + studentList.get(position).getDepartment());
                    i.putExtra("txtAddress","Address: " + studentList.get(position).getAddress());
                    v.getContext().startActivity(i);
                }
            });


        } else if (holder instanceof SecondStudentViewHolder) {
//            Student student1 = studentList.get(position);
            SecondStudentViewHolder secondStudentViewHolder = (SecondStudentViewHolder) holder;
            secondStudentViewHolder.secondTxtStuName.setText("Name :" + studentList.get(position).getName());
            secondStudentViewHolder.secondTxtAge.setText("Age: " + studentList.get(position).getAge());
            secondStudentViewHolder.secondTxtDepartment.setText("Department: " + studentList.get(position).getDepartment());
            secondStudentViewHolder.secondTxtAddress.setText("Address: " + studentList.get(position).getAddress());
//            if (studentList.get(position).isPresent()) {
//                secondStudentViewHolder.secondImgIsPresent.setImageResource(R.drawable.ic_present);
//            } else {
//                secondStudentViewHolder.secondImgIsPresent.setImageResource(R.drawable.ic_absent);
//            }
            secondStudentViewHolder.secondImgIsPresent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // iRecyclerClick.onRecyclerItemClick(studentList.get(position));
                    studentList.remove(position);
                    notifyItemRemoved(position);
                    notifyItemChanged(position, studentList.size());
                }
            });
            secondStudentViewHolder.secondLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), RecyclerStudentSecondActivity.class);
                    i.putExtra("txtStuName", "Name :" + studentList.get(position).getName());
                    i.putExtra("txtAge","Age: " + studentList.get(position).getAge());
                    i.putExtra("txtDepartment","Department: " + studentList.get(position).getDepartment());
                    i.putExtra("txtAddress","Address: " + studentList.get(position).getAddress());
                    v.getContext().startActivity(i);
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    @Override
    public int getItemViewType(int position) {
        //   for (int i = 0; i <= studentList.size(); i++) {
        if (position % 2 == 0) {
            Log.d("Check", "Even");
            // return studentView;
            // return secondStudentView;
            return secondStudentView;

        } else {
            Log.d("Check", "Odd");
            return studentView;
        }
    }


    class StudentViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile;
        TextView txtStuName;
        TextView txtDepartment;
        TextView txtAge;
        TextView txtAddress;
        ImageView imgIsPresent;
        LinearLayout firstLayout;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.img_profile);
            txtStuName = itemView.findViewById(R.id.txt_stu_name);
            txtDepartment = itemView.findViewById(R.id.txt_stu_dept);
            txtAddress = itemView.findViewById(R.id.txt_stu_address);
            txtAge = itemView.findViewById(R.id.txt_age);
            imgIsPresent = itemView.findViewById(R.id.img_is_present);
            firstLayout = itemView.findViewById(R.id.first_layout);

        }

    }

    class SecondStudentViewHolder extends RecyclerView.ViewHolder {

        ImageView secondImgProfile;
        TextView secondTxtStuName;
        TextView secondTxtDepartment;
        TextView secondTxtAge;
        TextView secondTxtAddress;
        ImageView secondImgIsPresent;
        LinearLayout secondLayout;


        public SecondStudentViewHolder(@NonNull View itemView) {
            super(itemView);
            secondImgProfile = itemView.findViewById(R.id.second_img_profile);
            secondTxtStuName = itemView.findViewById(R.id.second_txt_stu_name);
            secondTxtDepartment = itemView.findViewById(R.id.second_txt_stu_dept);
            secondTxtAddress = itemView.findViewById(R.id.second_txt_stu_address);
            secondTxtAge = itemView.findViewById(R.id.second_txt_age);
            secondImgIsPresent = itemView.findViewById(R.id.second_img_is_present);
            secondLayout=itemView.findViewById(R.id.second_layout);
        }
    }
}


