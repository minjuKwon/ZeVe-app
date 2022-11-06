package com.example.zeve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class SpaceShop extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private SpaceShopPaintFragment paintF;
    private SpaceShopForestFragment forestF;
    private SpaceShopSeaFragment seaF;
    private SpaceShopMudFragment mudF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_space_shop);

        createFragment();
        createViewPager();
        settingTabLayout();

//        ImageView backImg=findViewById(R.id.shopBack);
//        backImg.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    private void createFragment(){
        paintF=new SpaceShopPaintFragment();
        forestF=new SpaceShopForestFragment();
        seaF=new SpaceShopSeaFragment();
        mudF=new SpaceShopMudFragment();
    }
    private void createViewPager(){
        viewPager = (ViewPager2)findViewById(R.id.spaceShopViewpager);
        SpaceShopViewPagerAdapter pagerAdapter=new SpaceShopViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        pagerAdapter.addFragment(paintF);
        pagerAdapter.addFragment(forestF);
        pagerAdapter.addFragment(seaF);
        pagerAdapter.addFragment(mudF);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setUserInputEnabled(false);
    }
    private void settingTabLayout(){
        tabLayout=(TabLayout)findViewById(R.id.spaceShopTabLayout);
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
