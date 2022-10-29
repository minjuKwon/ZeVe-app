package com.example.zeve;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MissionDesc extends AppCompatActivity {

        private Intent intent;
        private View v;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_mission_desc);

            TextView title=findViewById(R.id.missionDescName);
            TextView content=findViewById(R.id.missionDescTxt);
            ImageView img=findViewById(R.id.missionDescBadge);

            intent = getIntent();
            int position = intent.getIntExtra("number", -1);

            switch (position){
                case 0:
                    img.setImageResource(R.drawable.ic_setting);
                    title.setText("미션1");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;
                case 1:
                    img.setImageResource(R.drawable.ic_forest);
                    title.setText("미션2");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;
                case 2:
                    img.setImageResource(R.drawable.ic_launcher_foreground);
                    title.setText("미션3");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;
                case 3:
                    img.setImageResource(R.drawable.ic_launcher_background);
                    title.setText("미션4");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;
                case 4:
                    img.setImageResource(R.drawable.ic_camera);
                    title.setText("미션5");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;
                case 5:
                    img.setImageResource(R.drawable.ic_setting);
                    title.setText("미션6");
                    content.setText("미션설명어쩌구어자아안미아렁ㅁ 아어란이르아이알아아러아ㅓㄹ다 ㅇ아러아호아민야야ㅑ양로양화아 아롱햐도해쟈오햐됴매캬야아유하");
                    break;

            }


        }


}
