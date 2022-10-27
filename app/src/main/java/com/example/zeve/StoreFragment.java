package com.example.zeve;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class StoreFragment extends Fragment {
    private View v;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private StoreVeganFragment veganF;
    private StoreZerowasteFragment zeroF;
    private StoreBookmarkFragment bookF;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_store, container, false);
        createFragment();
        createViewPager();
        settingTabLayout();
        return v;
    }
    private void createFragment(){
        veganF=new StoreVeganFragment();
        zeroF=new StoreZerowasteFragment();
        bookF=new StoreBookmarkFragment();
    }
    private void createViewPager(){
        viewPager = (ViewPager2)v.findViewById(R.id.storeViewpager);
        StoreViewpagerAdapter pagerAdapter=new StoreViewpagerAdapter(getFragmentManager(),getLifecycle());
        pagerAdapter.addFragment(veganF);
        pagerAdapter.addFragment(zeroF);
        pagerAdapter.addFragment(bookF);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setUserInputEnabled(false);
    }
    private void settingTabLayout(){
        tabLayout=(TabLayout)v.findViewById(R.id.storeTabLayout);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int pos = tab.getPosition();
                switch(pos){
                    case 0:
                        viewPager.setCurrentItem(0);
                        break;
                    case 1:
                        viewPager.setCurrentItem(1);
                        break;
                    case 2:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

}