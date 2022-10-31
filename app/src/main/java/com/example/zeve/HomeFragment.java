package com.example.zeve;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {
    private EcoNewsAdapter adapter;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_home, container, false);
        init();
        getData();
        return v;
    }

    private void init(){
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.ecoNewsRecyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new EcoNewsAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData(){
        List<Integer> listResId= Arrays.asList(
                R.drawable.eco_news1,
                R.drawable.eco_news2,
                R.drawable.eco_news3
        );
        for(int i=0;i<listResId.size();i++){
            EcoNewsData data=new EcoNewsData();
            data.setNewsImgId(listResId.get(i));
            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();
    }
}