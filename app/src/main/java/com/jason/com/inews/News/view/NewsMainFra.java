package com.jason.com.inews.News.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jason.com.inews.News.adapters.PagerAdapter;
import com.jason.com.inews.R;

/**
 * Created by 16276 on 2017/1/25.
 */
 public class NewsMainFra extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mPager;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab_and_pager,container,false);
        mTabLayout= (TabLayout) view.findViewById(R.id.tabLayout);
        mPager= (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(new PagerAdapter(getChildFragmentManager(),getResources()));
        mTabLayout.setupWithViewPager(mPager);
        return view;
    }
}