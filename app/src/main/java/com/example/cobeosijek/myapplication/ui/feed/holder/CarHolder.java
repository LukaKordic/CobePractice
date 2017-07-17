package com.example.cobeosijek.myapplication.ui.feed.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.example.cobeosijek.myapplication.ui.listener.ItemClickListener;
import com.squareup.picasso.Picasso;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class CarHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView tvCarName;
    private TextView tvCarAge;
    private ImageView ivCarImage;

    private final ItemClickListener itemClickListener;
    private Car car;

    public CarHolder(View itemView, final ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;

        tvCarName = itemView.findViewById(R.id.tv_car_name);
        tvCarAge = itemView.findViewById(R.id.tv_car_age);
        ivCarImage = itemView.findViewById(R.id.iv_car_img);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void showCarDetails(final Car car) {
        itemView.setOnClickListener(this);

        tvCarName.setText(car.getCarName());
        tvCarAge.setText(String.valueOf(car.getCarAge()));

        Picasso.with(itemView.getContext()).load(car.getCarImage()).into(ivCarImage);
    }


    @Override
    public void onClick(View view) {
        if (itemClickListener != null) {
            itemClickListener.onItemClick(car);
        }
    }
}