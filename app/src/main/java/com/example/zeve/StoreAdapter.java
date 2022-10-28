package com.example.zeve;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ItemViewHolder> {

    private ArrayList<StoreData> storeData =new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_store_item,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position){
        holder.onBind(storeData.get(position));
    }
    @Override
    public int getItemCount(){
        return storeData.size();
    }
    public void addItem(StoreData data){
        storeData.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.storeImg);
            textView1=itemView.findViewById(R.id.storeName);
            textView2=itemView.findViewById(R.id.storeBookmarkTxt);
            textView3=itemView.findViewById(R.id.storeTagTxt);
        }
        void onBind(StoreData data){
            imageView.setImageResource(data.getStoreImg());
            textView1.setText(data.getStoreName());
            textView2.setText(String.valueOf(data.getHeart()));
            textView3.setText(data.getStoreTag());
        }
    }
}
