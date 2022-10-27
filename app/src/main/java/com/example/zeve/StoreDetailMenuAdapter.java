package com.example.zeve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoreDetailMenuAdapter extends RecyclerView.Adapter<StoreDetailMenuAdapter.ItemViewHolder> {

    private ArrayList<StoreDetailMenuData> menuData=new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_store_detail_menu_item,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position){
        holder.onBind(menuData.get(position));
    }
    @Override
    public int getItemCount(){
        return menuData.size();
    }
    public void addItem(StoreDetailMenuData data){
        menuData.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1 ;
        private TextView textView2 ;
        private TextView textView3 ;

        ItemViewHolder(View itemView){
            super(itemView);
            textView1=itemView.findViewById(R.id.storeDetailMenuName);
            textView2=itemView.findViewById(R.id.storeDetailMenuTag);
            textView3=itemView.findViewById(R.id.storeDetailMenuPrice);
        }
        void onBind(StoreDetailMenuData data){
            textView1.setText(data.getMenuName());
            textView2.setText(data.getMenuTag());
            textView3.setText(data.getMenuPrice());
        }

    }


}
