package com.example.layoutdesigns.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutdesigns.activities.RecyclerDatabaseActivity;
import com.example.layoutdesigns.contract.CarRecordHelper;
import com.example.layoutdesigns.model.Car;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter {


    private Context context;
    private ArrayList<Car> listContacts;
    private ArrayList<Car> mArrayList;
    private CarRecordHelper mDatabase;
    CarAdapter(Context context, ArrayList<Car> listContacts) {
        this.context = context;
        this.listContacts = listContacts;
        this.mArrayList = listContacts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
