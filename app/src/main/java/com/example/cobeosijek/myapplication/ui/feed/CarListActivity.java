package com.example.cobeosijek.myapplication.ui.feed;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cobeosijek.myapplication.R;
import com.example.cobeosijek.myapplication.common.constants.Constants;
import com.example.cobeosijek.myapplication.ui.feed.adapter.TabsPageAdapter;
import com.example.cobeosijek.myapplication.ui.feed.list.AllCarsFragment;
import com.example.cobeosijek.myapplication.ui.feed.list.PopularCarsFragment;

public class CarListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        setUpUI();
        setUpPagerAndTabs();
    }

    private void setUpUI() {
        TextView userInfo = (TextView) findViewById(R.id.user_info);
        Intent receivingIntent = getIntent();
        String userEmail = receivingIntent.getStringExtra(Constants.KEY_EMAIL);
        userInfo.setText(userEmail);
    }

    private void setUpPagerAndTabs() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.pager_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsPageAdapter tabsPageAdapter = new TabsPageAdapter(getSupportFragmentManager());

        tabsPageAdapter.addFragment(new AllCarsFragment(), getString(R.string.all_cars_title));
        tabsPageAdapter.addFragment(new PopularCarsFragment(), getString(R.string.popular_cars_title));

        viewPager.setAdapter(tabsPageAdapter);
    }
}
