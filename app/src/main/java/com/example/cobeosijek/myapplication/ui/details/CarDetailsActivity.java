package com.example.cobeosijek.myapplication.ui.details;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.common.constants.Constants;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.example.cobeosijek.myapplication.ui.feed.CarListActivity;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

import static android.R.attr.name;

public class CarDetailsActivity extends AppCompatActivity implements Serializable{

    TextView carName;
    TextView carAge;
    TextView carSpeed;
    TextView carRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        setUpUI();
        displayInfo();
    }

    private void setUpUI() {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.DetailsActivityTitle);
        }

        carName = (TextView) findViewById(R.id.tv_car_details_name);
        carAge = (TextView) findViewById(R.id.tv_car_details_age);
        carSpeed = (TextView) findViewById(R.id.tv_car_details_speed);
        carRegistration = (TextView) findViewById(R.id.tv_car_details_registration);
        ViewPager carImagesPager = (ViewPager) findViewById(R.id.container_details);
    }

    private void displayInfo() {
        Intent intent = getIntent();
        Car car = (Car) intent.getSerializableExtra(Constants.KEY_CAR);
        carName.setText(car.getCarName());
        carAge.setText(String.valueOf(car.getCarAge()));
        carSpeed.setText(String.valueOf(car.getCarSpeed()));
        carRegistration.setText(car.getCarRegistration());


    }
}
