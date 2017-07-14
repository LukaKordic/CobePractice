package com.example.cobeosijek.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        this.setUpUI();
        this.setUpPagerAndTabs();

    }

    private void setUpPagerAndTabs() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setUpUI() {
        TextView tvUserInfo = (TextView) findViewById(R.id.tv_user_info);
        Intent receivingIntent = this.getIntent();
        String username = receivingIntent.getStringExtra(MainActivity.EMAIL_KEY);
        tvUserInfo.setText(username);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsPageAdapter tabsPageAdapter = new TabsPageAdapter(getSupportFragmentManager());
        tabsPageAdapter.addFragment(new Tab1Fragment(), "All");
        tabsPageAdapter.addFragment(new Tab2Fragment(), "Popular");
        viewPager.setAdapter(tabsPageAdapter);
    }
}
