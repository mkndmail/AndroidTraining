package com.example.layoutdesigns.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.activities.ViewDB;
import com.example.layoutdesigns.model.Car;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    Context context;
    List<Car> carList;
    RecyclerView rvDB;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View carView = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(carView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.carName.setText("Car Name :"+car.getCar_name());
        holder.carModel.setText("Car Model :"+car.getCar_model());
        holder.regNo.setText("Car Registration Number :"+car.getReg_no());
    }



    @Override
    public int getItemCount() {
        return carList.size();
    }

//    public CarAdapter(List<Car> allCars, ViewDB viewDB) {
//        this.carList=
//    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView carName;
        TextView carModel;
        TextView regNo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carName = itemView.findViewById(R.id.car_name);
            carModel = itemView.findViewById(R.id.car_model);
            regNo = itemView.findViewById(R.id.car_reg_no);
        }
    }

    public CarAdapter(List<Car> carList){

        this.carList=carList;

    }

}
