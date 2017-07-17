package com.example.cobeosijek.myapplication.ui.feed.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.cobeosijek.myapplication.data_object.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class CarDetailsPagerAdapter extends PagerAdapter {

    private final List<Car> carList = new ArrayList<>();
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
