package com.example.healthmate;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {


    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new Day1_Fragment();
                break;
            case 1:
                fragment=new Day2_Fragment();
                break;
            case 2:
                fragment=new Day3_Fragment();
                break;
            case 3:
                fragment=new Day4_Fragment();
                break;
            case 4:
                fragment=new Day5_Fragment();
                break;
            case 5:
                fragment=new Day6_Fragment();
                break;
            case 6:
                fragment=new Day7_Fragment();
                break;
            case 7:
                fragment=new Day8_Fragment();
                break;
            case 8:
                fragment=new Day9_Fragment();
                break;
            case 9:
                fragment=new Day10_Fragment();
                break;
            case 10:
                fragment=new Day11_Fragment();
                break;
            case 11:
                fragment=new Day12_Fragment();
                break;
            case 12:
                fragment=new Day13_Fragment();
                break;
            case 13:
                fragment=new Day14_Fragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 14;
    }
}
