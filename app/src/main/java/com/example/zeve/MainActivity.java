package com.example.zeve;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    HomeFragment homeFragment;
    SpaceFragment spaceFragment;
    MissionFragment missionFragment;
    StoreFragment storeFragment;
    SettingFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment=new HomeFragment();
        spaceFragment=new SpaceFragment();
        missionFragment=new MissionFragment();
        storeFragment=new StoreFragment();
        settingFragment=new SettingFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,homeFragment).commit();

        NavigationBarView navigationBarView=findViewById(R.id.bottomMenuView);
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.homeMenu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,homeFragment).commit();
                        return true;
                    case R.id.spaceMenu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,spaceFragment).commit();
                        return true;
                    case R.id.missionMenu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,missionFragment).commit();
                        return true;
                    case R.id.storeMenu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,storeFragment).commit();
                        return true;
                    case R.id.settingMenu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLay,settingFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}