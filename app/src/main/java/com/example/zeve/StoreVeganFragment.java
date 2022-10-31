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


public class StoreVeganFragment extends Fragment {
    private StoreAdapter adapter;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       v= inflater.inflate(R.layout.fragment_store_vegan, container, false);
       init();
       getData();
       return v;
    }
    private void init(){
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.veganRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new StoreAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData(){
        List<Integer> listContentImg= Arrays.asList(
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img,
                R.drawable.store_img
        );
        List<Integer> listHeart=Arrays.asList(
               12,21,16,13,8,15,18
        );
        List<String> listName=Arrays.asList(
                "엽전식당","황토방묵집","소문난 막국수","아차가","안동화련","어번샐러드","초밥일번지"
        );
        List<String> listTag=Arrays.asList(
                "비건","비건","비건","비건","페스코","락토","페스코"
        );
        for(int i=0;i<listContentImg.size();i++){
            StoreData data=new StoreData();
            data.setStoreImg(listContentImg.get(i));
            data.setHeart((listHeart.get(i)));
            data.setStoreName(listName.get(i));
            data.setStoreTag(listTag.get(i));

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();

    }
}