package com.example.cobeosijek.myapplication.ui.details;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.common.constants.Constants;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.example.cobeosijek.myapplication.ui.feed.adapter.CarDetailsPagerAdapter;

import java.util.List;

public class CarDetailsActivity extends AppCompatActivity {

    private TextView carName;
    private TextView carAge;
    private TextView carSpeed;
    private TextView carRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        setUpUI();
        displayInfo();
    }

    private void setUpUI() {
        setupToolbar();
        setupViews();
    }

    private void setupToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.DetailsActivityTitle);
        }
    }

    private void setupViews() {
        carName = (TextView) findViewById(R.id.tv_car_details_name);
        carAge = (TextView) findViewById(R.id.tv_car_details_age);
        carSpeed = (TextView) findViewById(R.id.tv_car_details_speed);
        carRegistration = (TextView) findViewById(R.id.tv_car_details_registration);
    }

    private void displayInfo() {
        Intent intent = getIntent();

        Car car = (Car) intent.getSerializableExtra(Constants.KEY_CAR);

        if (car != null) {
            carName.setText(car.getCarName());
            carAge.setText(String.valueOf(car.getCarAge()));
            carSpeed.setText(String.valueOf(car.getCarSpeed()));
            carRegistration.setText(car.getCarRegistration());

            setupViewPager(car.getCarImageList());
        }
    }

    private void setupViewPager(List<String> carImageList) {
        CarDetailsPagerAdapter carDetailsPagerAdapter = new CarDetailsPagerAdapter(carImageList);

        ViewPager viewPager = (ViewPager) findViewById(R.id.container_details);
        viewPager.setAdapter(carDetailsPagerAdapter);
    }
}
