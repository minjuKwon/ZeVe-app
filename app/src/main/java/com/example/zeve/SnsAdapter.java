package com.example.zeve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SnsAdapter extends RecyclerView.Adapter<SnsAdapter.ItemViewHolder>{

    private ArrayList<SnsData> snsData =new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sns_content,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position){
        holder.onBind(snsData.get(position));
    }
    @Override
    public int getItemCount(){
        return snsData.size();
    }
    public void addItem(SnsData data){
        snsData.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;

        ItemViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.snsContentImg);
            textView1=itemView.findViewById(R.id.snsContentName);
            textView2=itemView.findViewById(R.id.snsContentDate);
            textView3=itemView.findViewById(R.id.snsContentTxt);
        }
        void onBind(SnsData data){
            imageView.setImageResource(data.getSnsContentImg());
            textView1.setText(data.getSnsNickName());
            textView2.setText(data.getSnsDate());
            textView3.setText(data.getSnsContentTxt());
        }
    }

}
