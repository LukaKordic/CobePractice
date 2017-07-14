package com.example.cobeosijek.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {
    private ArrayList<Car> mCars;

    public CarAdapter(ArrayList<Car> books) {
        mCars = books;
    }

    @Override
    public int getCount() {
        return this.mCars.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mCars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder carViewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.car_list_item, parent, false);
            carViewHolder = new ViewHolder(convertView);
            convertView.setTag(carViewHolder);
        } else {
            carViewHolder = (ViewHolder) convertView.getTag();
        }
        Car car = this.mCars.get(position);
        carViewHolder.tvCarName.setText(car.getCarName());
        carViewHolder.tvCarAge.setText(String.valueOf(car.getCarAge()));
        return convertView;
    }

    private static class ViewHolder {
        TextView tvCarName, tvCarAge;

        ViewHolder(View carView) {
            tvCarName = carView.findViewById(R.id.tv_car_name);
            tvCarAge = carView.findViewById(R.id.tv_car_age);
        }
    }
}
