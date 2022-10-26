package com.example.zeve;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class Sns extends Fragment {
    private SnsAdapter adapter;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        v=inflater.inflate(R.layout.sns,container,false);
        init();
        getData();
        return v;
    }
    private void init(){
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.snsRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new SnsAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData(){
        List<Integer> listContentImg= Arrays.asList(
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground
        );
        List<String> listNickname=Arrays.asList(
                "닉네임1","닉네임2","닉네임3","닉네임4"
        );
        List<String> listDate=Arrays.asList(
                "2022.02.22","2022.02.22","2022.02.22","2022.02.22"
        );
        List<String> listContentTxt=Arrays.asList(
                "어쩌구저쩌구","어쩌구저쩌구","어쩌구저쩌구","어쩌구저쩌구"
        );
        for(int i=0;i<listContentImg.size();i++){
            SnsData data=new SnsData();
            data.setSnsContentImg(listContentImg.get(i));
            data.setSnsNickname(listNickname.get(i));
            data.setSnsDate((listDate.get(i)));
            data.setSnsContentTxt(listContentTxt.get(i));

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();

    }

}
