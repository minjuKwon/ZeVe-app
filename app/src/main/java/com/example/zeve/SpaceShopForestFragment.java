package com.example.zeve;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class SpaceShopForestFragment extends Fragment {

    private SpaceShopAdapter adapter;
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_space_shop_forest, container, false);
        init();
        getData();
        return v;
    }
    private void init(){
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.shopForestRecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter=new SpaceShopAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData(){
        List<Integer> listContentImg= Arrays.asList(
                R.drawable.cloud,
                R.drawable.maple_tree,
                R.drawable.ginkgo_tree
        );
        List<Integer> listCoin= Arrays.asList(
             2,10,10
        );
        List<String> listName= Arrays.asList(
              "구름","단풍나무","은행나무"
        );

        for(int i=0;i<listContentImg.size();i++){
            SpaceShopData data=new SpaceShopData();
            data.setShopItemImg(listContentImg.get(i));
            data.setShopItemCoin(listCoin.get(i));
            data.setShopItemName(listName.get(i));

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();
    }
}