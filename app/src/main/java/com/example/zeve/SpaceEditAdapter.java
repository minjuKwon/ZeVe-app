package com.example.zeve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
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

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.myItemImg);

        }
        void onBind(SpaceEditData data){
            imageView.setImageResource(data.getMyItemImg());

        }
    }
}
