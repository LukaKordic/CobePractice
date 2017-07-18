package com.example.cobeosijek.myapplication.ui.feed.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.common.constants.Constants;
import com.example.cobeosijek.myapplication.common.utils.DataUtils;
import com.example.cobeosijek.myapplication.data_object.Car;
import com.example.cobeosijek.myapplication.ui.details.CarDetailsActivity;
import com.example.cobeosijek.myapplication.ui.feed.adapter.CarRecyclerAdapter;
import com.example.cobeosijek.myapplication.ui.listener.ItemClickListener;


public class PopularCarsFragment extends Fragment implements ItemClickListener {

    private final CarRecyclerAdapter carRecyclerAdapter = new CarRecyclerAdapter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_car_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView carListView = view.findViewById(R.id.item_list);
        carListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        carListView.setItemAnimator(new DefaultItemAnimator());

        carRecyclerAdapter.setItemClickListener(this);
        carListView.setAdapter(carRecyclerAdapter);

        carRecyclerAdapter.setItems(DataUtils.loadFavouriteCars());
    }

    @Override
    public void onItemClick(Car car) {
        Intent intent = new Intent(getActivity(), CarDetailsActivity.class);
        intent.putExtra(Constants.KEY_CAR, car);
        startActivity(intent);
    }
}
