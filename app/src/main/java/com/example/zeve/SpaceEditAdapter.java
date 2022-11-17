package com.example.zeve;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpaceEditAdapter extends RecyclerView.Adapter<SpaceEditAdapter.ItemViewHolder> {
    private ArrayList<SpaceEditData> data =new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_space_edit_item,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position){
        holder.onBind(data.get(position));
        Context context=holder.itemView.getContext();
        ImageView imageByCode=new ImageView(context);
        imageByCode.setImageResource(data.get(position).getMyItemImg());
        ConstraintLayout.LayoutParams layoutLayoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        imageByCode.setLayoutParams(layoutLayoutParams);
        holder.imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

//                ConstraintLayout.LayoutParams imgParams = new ConstraintLayout.LayoutParams(
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT
//                );
               // holder.imageView.setLayoutParams(imgParams);
                holder.spaceLay.addView(imageByCode);


            }
        });
    }
    @Override
    public int getItemCount(){
        return data.size();
    }
    public void addItem(SpaceEditData d){
        data.add(d);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private ConstraintLayout spaceLay;
        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.myItemImg);
            spaceLay=itemView.findViewById(R.id.spaceLay);
        }
        void onBind(SpaceEditData data){
            imageView.setImageResource(data.getMyItemImg());

        }
    }

}
