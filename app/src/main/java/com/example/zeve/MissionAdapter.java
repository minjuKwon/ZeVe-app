package com.example.zeve;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MissionAdapter extends RecyclerView.Adapter<MissionAdapter.ItemViewHolder> {

    private ArrayList<MissionData> missionData=new ArrayList<>();
    private MissionDesc mission;
    private Intent intent;

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_mission_content,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder,int position){
        holder.onBind(missionData.get(position));
        mission=new MissionDesc();

        holder.cons.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                intent = new Intent(view.getContext(), MissionDesc.class);
                intent.putExtra("number", position);
                view.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount(){
        return missionData.size();
    }
    public void addItem(MissionData data){
        missionData.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ConstraintLayout cons;
        private ImageView imageView;
        private TextView textView1 ;
        private TextView textView2 ;
        private TextView textView3 ;
        private TextView textView4 ;

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.missionImg);
            textView1=itemView.findViewById(R.id.missionName);
            textView2=itemView.findViewById(R.id.missionContent);
            textView3=itemView.findViewById(R.id.pointTxt);
            textView4=itemView.findViewById(R.id.missionSuccessTxt);
            cons=itemView.findViewById(R.id.missionLay);
        }
        void onBind(MissionData data){
            imageView.setImageResource(data.getMissionImgId());
            textView1.setText(data.getMissionTitle());
            textView2.setText(data.getMissionContent());
            textView3.setText(data.getMissionPoint());
            textView4.setText(data.getMissionSuccess());
        }

    }
}
