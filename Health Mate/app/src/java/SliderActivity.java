package com.example.healthmate;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SliderActivity extends AppCompatActivity {

    TextView day1,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,day14;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        day1=findViewById(R.id.idday1);
        day2=findViewById(R.id.idday2);
        day3=findViewById(R.id.idday3);
        day4=findViewById(R.id.idday4);
        day5=findViewById(R.id.idday5);
        day6=findViewById(R.id.idday6);
        day7=findViewById(R.id.idday7);
        day8=findViewById(R.id.idday8);
        day9=findViewById(R.id.idday9);
        day10=findViewById(R.id.idday10);
        day11=findViewById(R.id.idday11);
        day12=findViewById(R.id.idday12);
        day13=findViewById(R.id.idday13);
        day14=findViewById(R.id.idday14);

        viewPager=findViewById(R.id.idcontainer);

        pagerViewAdapter=new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });
        day6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(5);
            }
        });
        day7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(6);
            }
        });
        day8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(7);
            }
        });
        day9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(8);
            }
        });
        day10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(9);
            }
        });
        day11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(10);
            }
        });
        day12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(11);
            }
        });
        day13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(12);
            }
        });
        day14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(13);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {
        if (position==0){
            day1.setTextSize(25);
            day1.setTextColor(getColor(R.color.brightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==1){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(25);
            day2.setTextColor(getColor(R.color.brightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==2){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(25);
            day3.setTextColor(getColor(R.color.brightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==3){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(25);
            day4.setTextColor(getColor(R.color.brightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==4){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(25);
            day5.setTextColor(getColor(R.color.brightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==5){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(25);
            day6.setTextColor(getColor(R.color.brightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==6){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(25);
            day7.setTextColor(getColor(R.color.brightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==7){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(25);
            day8.setTextColor(getColor(R.color.brightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==8){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(25);
            day9.setTextColor(getColor(R.color.brightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==9){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(25);
            day10.setTextColor(getColor(R.color.brightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==10){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(25);
            day11.setTextColor(getColor(R.color.brightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==11){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(25);
            day12.setTextColor(getColor(R.color.brightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==12){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(25);
            day13.setTextColor(getColor(R.color.brightcolor));
            day14.setTextSize(20);
            day14.setTextColor(getColor(R.color.lightcolor));
        }
        if (position==13){
            day1.setTextSize(20);
            day1.setTextColor(getColor(R.color.lightcolor));
            day2.setTextSize(20);
            day2.setTextColor(getColor(R.color.lightcolor));
            day3.setTextSize(20);
            day3.setTextColor(getColor(R.color.lightcolor));
            day4.setTextSize(20);
            day4.setTextColor(getColor(R.color.lightcolor));
            day5.setTextSize(20);
            day5.setTextColor(getColor(R.color.lightcolor));
            day6.setTextSize(20);
            day6.setTextColor(getColor(R.color.lightcolor));
            day7.setTextSize(20);
            day7.setTextColor(getColor(R.color.lightcolor));
            day8.setTextSize(20);
            day8.setTextColor(getColor(R.color.lightcolor));
            day9.setTextSize(20);
            day9.setTextColor(getColor(R.color.lightcolor));
            day10.setTextSize(20);
            day10.setTextColor(getColor(R.color.lightcolor));
            day11.setTextSize(20);
            day11.setTextColor(getColor(R.color.lightcolor));
            day12.setTextSize(20);
            day12.setTextColor(getColor(R.color.lightcolor));
            day13.setTextSize(20);
            day13.setTextColor(getColor(R.color.lightcolor));
            day14.setTextSize(25);
            day14.setTextColor(getColor(R.color.brightcolor));
        }
    }
}
