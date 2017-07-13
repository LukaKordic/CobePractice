package com.example.cobeosijek.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CarList extends AppCompatActivity {

    Intent intent;
    TextView tvUserInfo;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        setUpUI();
    }

    private void setUpUI() {
        this.tvUserInfo = (TextView) findViewById(R.id.tv_user_info);
        intent = this.getIntent();
        String username = intent.getStringExtra(MainActivity.EMAIL_KEY);
        tvUserInfo.setText(username);
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsPageAdapter tabsPageAdapter = new TabsPageAdapter(getSupportFragmentManager());
        tabsPageAdapter.addFragment(new Tab1Fragment(), "All");
        tabsPageAdapter.addFragment(new Tab2Fragment(), "Popular");
        viewPager.setAdapter(tabsPageAdapter);
    }
}
