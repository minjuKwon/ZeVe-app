package com.example.zeve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class StoreDetail extends AppCompatActivity {

    private StoreDetailMenuAdapter menuAdapter;
    private SnsAdapter snsAdapter;
    private Intent intent;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_store_detail);

        init();
        getData();

        intent=getIntent();
    }
    private void init(){
        RecyclerView recyclerView1=findViewById(R.id.menuRecyclerView);
        RecyclerView recyclerView2=findViewById(R.id.reviewRecyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        recyclerView1.setLayoutManager(linearLayoutManager);
        menuAdapter=new StoreDetailMenuAdapter();
        recyclerView1.setAdapter(menuAdapter);

        recyclerView2.setLayoutManager(linearLayoutManager);
        snsAdapter=new SnsAdapter();
        recyclerView2.setAdapter(snsAdapter);
    }
    private void getData(){
        List<Integer> listPrice= Arrays.asList(
                1000, 1000, 1000, 1000
        );
        List<String> listName=Arrays.asList(
                "메뉴1","메뉴2","메뉴","메뉴4"
        );
        List<String> listTag=Arrays.asList(
                "비건", "비건", "비건", "비건"
        );
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

        for(int i=0;i<listPrice.size();i++){
            StoreDetailMenuData data=new StoreDetailMenuData();

            data.setMenuPrice(listPrice.get(i));
            data.setMenuName(listName.get(i));
            data.setMenuTag(listTag.get(i));

            menuAdapter.addItem(data);
        }
        for(int i=0;i<listContentImg.size();i++){
            SnsData data=new SnsData();
            data.setSnsContentImg(listContentImg.get(i));
            data.setSnsNickname(listNickname.get(i));
            data.setSnsDate((listDate.get(i)));
            data.setSnsContentTxt(listContentTxt.get(i));

            snsAdapter.addItem(data);
        }

        menuAdapter.notifyDataSetChanged();
        snsAdapter.notifyDataSetChanged();

    }
}
