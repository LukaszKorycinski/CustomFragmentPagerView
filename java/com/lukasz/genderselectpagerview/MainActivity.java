package com.lukasz.genderselectpagerview;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    TabPagerAdapter tabpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPagerAdapter();
    }

    private void initPagerAdapter() {
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//b'
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//c'
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//a
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//b
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//c
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//a'
        fragments.add(Fragment.instantiate(this, GenderMale.class.getName()));//b'

        tabpagerAdapter  = new TabPagerAdapter(super.getSupportFragmentManager(), fragments);

        PagerContainer mContainer = (PagerContainer) findViewById(R.id.pagecontainer);
        ViewPager pager = mContainer.getViewPager();//(ViewPager)super.findViewById(R.id.viewpager);

        pager.setAdapter(tabpagerAdapter);
        pager.setPageTransformer(false, new PagerAnimation());
        pager.setCurrentItem(3);

        pager.setOffscreenPageLimit(tabpagerAdapter.getCount());

        pager.setClipToPadding(true);
        pager.setPageMargin(-40);

        pager.setClipChildren(true);
    }


}
