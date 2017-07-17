package com.example.cobeosijek.myapplication.ui.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.example.cobeosijek.myapplication.ui.feed.holder.CarHolder;
import com.example.cobeosijek.myapplication.ui.listener.ItemClickListener;

import java.util.ArrayList;
import java.util.List;


public class CarRecyclerAdapter extends RecyclerView.Adapter<CarHolder> {

    private final List<Car> itemList = new ArrayList<>();
    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setItems(List<Car> items) {// ocisti i postavi
        itemList.clear();
        itemList.addAll(items);
        notifyDataSetChanged();
    }

    public void addItems(List<Car> items) { // dodaje jos itema
        itemList.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public CarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_list_item, parent, false);
        return new CarHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(CarHolder holder, int position) {
        Car car = getItem(position);

        holder.setCar(car);
        holder.showCarDetails(car);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    private Car getItem(int position) {

        if (position < getItemCount()) {
            Car car = itemList.get(position);
            return car != null ? car : new Car();
        }

        return new Car();
    }
}
