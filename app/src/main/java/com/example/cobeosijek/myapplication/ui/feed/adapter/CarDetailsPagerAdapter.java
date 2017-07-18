package com.example.cobeosijek.myapplication.ui.feed.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.cobeosijek.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by cobeosijek on 17/07/2017.
 */

public class CarDetailsPagerAdapter extends PagerAdapter {

    private final List<String> carImageList;

    public CarDetailsPagerAdapter(List<String> carImageList) {
        this.carImageList = carImageList;
    }

    @Override
    public int getCount() {
        return carImageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View itemView = inflater.inflate(R.layout.details_pager_item, container, false);

        ImageView carImage = itemView.findViewById(R.id.iv_pager_item);
        Picasso.with(itemView.getContext()).load(carImageList.get(position)).into(carImage);

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (object instanceof View) {
            container.removeView((View) object);
        }
    }
}
