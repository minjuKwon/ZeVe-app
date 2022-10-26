package com.example.zeve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EcoNewsAdapter extends RecyclerView.Adapter<EcoNewsAdapter.ItemViewHolder> {

    private ArrayList<EcoNewsData> ecoData=new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_hom_recyl_item,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder,int position){
        holder.onBind(ecoData.get(position));
    }
    @Override
    public int getItemCount(){
        return ecoData.size();
    }
    public void addItem(EcoNewsData data){
        ecoData.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.ecoNewsImg);
        }

        void onBind(EcoNewsData data){
            imageView.setImageResource(data.getNewsImgId());
        }
    }



}
