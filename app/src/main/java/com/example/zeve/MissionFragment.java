package com.example.zeve;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class MissionFragment extends Fragment {
    private MissionAdapter adapter;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_mission, container, false);
        init();
        getData();
        return v;
    }
    private void init(){
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.missionRecyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new MissionAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData(){
        List<Integer> listResId= Arrays.asList(
                R.drawable.vegan_illust,
                R.drawable.ecobag_illust,
                R.drawable.mission_img,
                R.drawable.mission_img,
                R.drawable.mission_img,
                R.drawable.mission_img
        );
        List<String> listTitle=Arrays.asList(
                "채식하기","봉투들기","분리배출","줍깅","걷기","제로웨이스트"
        );
        List<String> listContent=Arrays.asList(
                "육류를 생산은 많은 환경오염을 일으킵니다. 채식도 맛있어요 예로 감자튀김",
                "집에 비닐 봉투가 너무 많지는 않은가요 이제는 그만",
                "귀찮아도 다 일반쓰레기로 버리지 마요 쓰레기도 쓸모가 있다고요",
                "길거리에 쓰레기를 주워봐요. 쓰레기 버린 사람을 주울 수는 없잖아요",
                "많이 앉아 있는 현대인, 환경과 건강 모두를 위해 걸어봐요",
                "환경도 챙기고 감성도 챙기는 제로웨이스트 어떠하신가요"
        );
        List<String> listPoint=Arrays.asList(
                "30","15","10","20","15","20"
        );
        List<String> listSuccess=Arrays.asList(
                "(32","(20","(7","(5","(3","(2"
        );
        for(int i=0;i<listResId.size();i++){
            MissionData data=new MissionData();

            data.setMissionImgId(listResId.get(i));
            data.setMissionTitle(listTitle.get(i));
            data.setMissionContent(listContent.get(i));
            data.setMissionPoint(listPoint.get(i));
            data.setMissionSuccess(listSuccess.get(i));

            adapter.addItem(data);
        }

        adapter.notifyDataSetChanged();

    }
}