package com.apps.hitungpengeluaran.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.apps.hitungpengeluaran.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fabAccount;
    TabLayout tabLayout;
    ViewPager viewPager;
    int[] tabIcons = {R.drawable.ic_pengeluaran, R.drawable.ic_pemasukan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setIdLayout();
        setInitLayout();
    }

    public void newsScreen(View view) {
        Intent i = new Intent(getApplicationContext(), AccountActivity.class);
        startActivity(i);
    }

    private void setIdLayout() {
        tabLayout = findViewById(R.id.tabsLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setInitLayout() {
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

}