package com.example.zeve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpaceShopAdapter extends RecyclerView.Adapter<SpaceShopAdapter.ItemViewHolder> {

    private ArrayList<SpaceShopData> data =new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_space_shop_item,parent,false);
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
    public void addItem(SpaceShopData d){
        data.add(d);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.shopItemImg);
            textView1=itemView.findViewById(R.id.shopItemName);
            textView2=itemView.findViewById(R.id.shopItemPrice);
        }
        void onBind(SpaceShopData data){
            imageView.setImageResource(data.getShopItemImg());
            textView1.setText(data.getShopItemName());
            textView2.setText(String.valueOf(data.getShopItemCoin()));
        }
    }
}
