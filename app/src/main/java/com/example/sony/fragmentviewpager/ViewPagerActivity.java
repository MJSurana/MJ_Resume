package com.example.sony.fragmentviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.sony.mjresume.R;

    public class ViewPagerActivity extends AppCompatActivity {

        ViewPager pager;
        ViewPagerAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view_pager);

            pager = (ViewPager)findViewById(R.id.pager);
            adapter = new ViewPagerAdapter(getSupportFragmentManager());
            pager.setAdapter(adapter);




        }
}
