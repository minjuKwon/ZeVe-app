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
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground
        );
        List<String> listHeart = Arrays.asList(
                "10","5","4","2"
        );
        List<String> listName = Arrays.asList(
                "가게1", "가게2", "가게3", "가게4"
        );
        List<String> listTag = Arrays.asList(
                "비건", "비건", "비건", "비건"
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