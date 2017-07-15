package com.example.cobeosijek.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Tab2Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);
        ListView carListView = view.findViewById(R.id.lv_popular_cars);

        CarAdapter carAdapter = new CarAdapter(this.loadCars());
        carListView.setAdapter(carAdapter);

        return view;
    }

    private ArrayList<Car> loadCars() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Audi A5", 2015, R.drawable.audi));
        carArrayList.add(new Car("Golf 6", 2014, R.drawable.golf));
        carArrayList.add(new Car("BMW i8", 2016, R.drawable.bmw));
        return carArrayList;
    }

}
