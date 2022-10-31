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


public class StoreZerowasteFragment extends Fragment {
    private StoreAdapter adapter;
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_store_zerowaste, container, false);
        init();
        getData();
        return v;
    }

    private void init() {
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.zeroWasteRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new StoreAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        List<Integer> listContentImg = Arrays.asList(
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img
        );
        List<Integer> listHeart = Arrays.asList(
                10,21,14
        );
        List<String> listName = Arrays.asList(
                "초록별상점", "더쓸모협동조합", "협동조합농부장터"
        );
        List<String> listTag = Arrays.asList(
                "제로웨이스트샵", "제로웨이스트샵", "로컬푸드"
        );
        for (int i = 0; i < listContentImg.size(); i++) {
            StoreData data = new StoreData();
            data.setStoreImg(listContentImg.get(i));
            data.setHeart((listHeart.get(i)));
            data.setStoreName(listName.get(i));
            data.setStoreTag(listTag.get(i));

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();

    }
}