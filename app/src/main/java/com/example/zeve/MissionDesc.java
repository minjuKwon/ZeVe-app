package com.example.zeve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
                    img.setImageResource(R.drawable.vegan_illust);
                    title.setText("채식하기");
                    content.setText("채식에도 여러 종류가 있답니다. 비건,락토,오보,페스코 등등. 무조건 채식이 아니라 지향하는 삶도 나쁘지 않을지 몰라요");
                    break;
                case 1:
                    img.setImageResource(R.drawable.ecobag_illust);
                    title.setText("봉투들기");
                    content.setText("원래 비닐봉투도 여러번 사용하기 위해 만들어졌답니다. 여러번 사용하는 것이 제일 중요하지요");
                    break;
                case 2:
                    img.setImageResource(R.drawable.mission_img);
                    title.setText("분리배출");
                    content.setText("분리배출을 잘하는 것만으로 큰 도움이 됩니다. 이번기회에 제대로 공부하고 실천해봐요");
                    break;
                case 3:
                    img.setImageResource(R.drawable.mission_img);
                    title.setText("줍깅");
                    content.setText("길거리에 쓰레기를 버러지 않는 것이 제일 중요하지만 벌써 버려진 쓰레기는 어쩔 수 없죠 착한 여러분이 주워보세요");
                    break;
                case 4:
                    img.setImageResource(R.drawable.mission_img);
                    title.setText("걷기");
                    content.setText("대중교통을 이용하거나 건강을 위해 걷는 것도 훌륭한 도움입니다. 벌써 환경운동을 하고 있을지도 몰라요!");
                    break;
                case 5:
                    img.setImageResource(R.drawable.mission_img);
                    title.setText("제로웨이스트");
                    content.setText("요즘 친환경 제품이 많이 나오고 있습니다. 쓰레기를 아예 줄일 수는 없으니 친환경 분해 제품 선택도 좋죠");
                    break;

            }


        }


}
