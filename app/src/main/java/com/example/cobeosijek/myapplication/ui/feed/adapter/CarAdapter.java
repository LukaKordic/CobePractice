package com.example.cobeosijek.myapplication.ui.feed.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CarAdapter extends BaseAdapter {

    private final List<Car> itemList = new ArrayList<>();

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
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Car getItem(int position) {

        if (position < getCount()) {
            Car car = itemList.get(position);
            return car != null ? car : new Car();
        }

        return new Car();
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

        Car car = getItem(position); //nikad nece biti null

        carViewHolder.tvCarName.setText(car.getCarName());
        carViewHolder.tvCarAge.setText(String.valueOf(car.getCarAge()));

        Picasso.with(parent.getContext()).load(car.getCarImage()).into(carViewHolder.ivCarImage);
        return convertView;
    }

    private static class ViewHolder {

        private TextView tvCarName;
        private TextView tvCarAge;
        private ImageView ivCarImage;

        ViewHolder(View carView) {
            tvCarName = carView.findViewById(R.id.tv_car_name);
            tvCarAge = carView.findViewById(R.id.tv_car_age);
            ivCarImage = carView.findViewById(R.id.iv_car_img);
        }
    }
}
