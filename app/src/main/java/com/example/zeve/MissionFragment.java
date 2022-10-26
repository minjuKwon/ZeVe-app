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
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground
        );
        List<String> listTitle=Arrays.asList(
                "미션1","미션2","미션3","미션4","미션5","미션6"
        );
        List<String> listContent=Arrays.asList(
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라",
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라",
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라",
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라",
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라",
                "미션어ㅓ쩌구설명이렇게하면포인트를얻을수있다사람살려흐으흐흑졸작하기기시라"
        );
        List<String> listPoint=Arrays.asList(
                "10","10","10","10","10","10"
        );
        List<String> listSuccess=Arrays.asList(
                "(3","(3","(3","(3","(3","(3"
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