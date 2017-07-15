package com.example.cobeosijek.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab1Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
        ListView carListView = view.findViewById(R.id.lv_all_cars);

        carListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(adapterView.getContext(), CarDetails.class);
                startActivity(intent);
            }
        });

        CarAdapter carAdapter = new CarAdapter(this.loadCars());
        carListView.setAdapter(carAdapter);

        return view;
    }

    private ArrayList<Car> loadCars() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Audi A5", 2015, R.drawable.audi));
        carArrayList.add(new Car("Golf 6", 2014, R.drawable.golf));
        carArrayList.add(new Car("BMW i8", 2016, R.drawable.bmw));
        carArrayList.add(new Car("Mercedes w201", 2015, R.drawable.mercedes));
        carArrayList.add(new Car("Audi A4", 2016, R.drawable.audi4));
        carArrayList.add(new Car("Skoda", 2013, R.drawable.skoda));
        carArrayList.add(new Car("Peugeot 206", 2000, R.drawable.pezo));
        return carArrayList;
    }


}
