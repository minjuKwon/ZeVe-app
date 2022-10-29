package com.example.zeve;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class SpaceFragment extends Fragment {
    private View v;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private SpaceEditPaintFragment paintF;
    private SpaceEditForestFragment forestF;
    private SpaceEditSeaFragment seaF;
    private SpaceEditMudFragment mudF;
    private int count=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_space, container, false);

        createFragment();
        createViewPager();
        settingTabLayout();

        ConstraintLayout editLay=(ConstraintLayout)v.findViewById(R.id.spaceEditLay);
        ImageView editImg=(ImageView)v.findViewById(R.id.spaceEdit);
        editImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count%2==1){
                    editLay.setVisibility(View.VISIBLE);
                }else{
                    editLay.setVisibility(View.GONE);
                }
                count++;

            }
        });
        ImageView shopImg=(ImageView)v.findViewById(R.id.spaceShop);
        shopImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),SpaceShop.class);
                startActivity(intent);
            }
        });
        return v;
    }
    private void createFragment(){
        paintF=new SpaceEditPaintFragment();
        forestF=new SpaceEditForestFragment();
        seaF=new SpaceEditSeaFragment();
        mudF=new SpaceEditMudFragment();
    }
    private void createViewPager(){
        viewPager = (ViewPager2)v.findViewById(R.id.spaceEditViewpager);
        SpaceEditViewPagerAdapter pagerAdapter=new SpaceEditViewPagerAdapter(getFragmentManager(),getLifecycle());
        pagerAdapter.addFragment(paintF);
        pagerAdapter.addFragment(forestF);
        pagerAdapter.addFragment(seaF);
        pagerAdapter.addFragment(mudF);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setUserInputEnabled(false);
    }
    private void settingTabLayout(){
        tabLayout=(TabLayout)v.findViewById(R.id.spaceEditTabLayout);
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
                    case 3:
                        viewPager.setCurrentItem(3);
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