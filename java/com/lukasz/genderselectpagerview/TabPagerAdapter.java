package com.lukasz.genderselectpagerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

/**
 * Created by Lukasz on 2017-01-14.
 */

public class TabPagerAdapter extends FragmentPagerAdapter  {

    List<Fragment> fragments;



    public TabPagerAdapter(FragmentManager fm, List<Fragment> f) {
        super(fm);
        fragments=f;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


//    @Override
//    public void transformPage(View page, float position) {
//        MyLinearLayout myLinearLayout = (MyLinearLayout) page.findViewById(R.id.root);
//        float scale = BIG_SCALE;
//        if (position > 0) {
//            scale = scale - position * DIFF_SCALE;
//        } else {
//            scale = scale + position * DIFF_SCALE;
//        }
//        if (scale < 0) scale = 0;
//        myLinearLayout.setScaleBoth(scale);
//    }
//    @Override
//    public float getPageWidth(int position) {
//        return 0.8f;
//    }

}