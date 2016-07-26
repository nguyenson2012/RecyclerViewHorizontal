package com.example.asus.recyclerviewhorizontal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Asus on 7/25/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private ArrayList<CategoryInfo> listCategory;
    private Context mContext;

    public RecyclerViewAdapter(Context context,ArrayList<CategoryInfo> categoryInfos){
        this.mContext=context;
        this.listCategory=categoryInfos;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_layout,parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        CategoryInfo categoryInfo=listCategory.get(position);
        holder.textViewTitle.setText(categoryInfo.getTitle());
        holder.imageViewCategory.setImageResource(categoryInfo.getImageResource());
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }
}
