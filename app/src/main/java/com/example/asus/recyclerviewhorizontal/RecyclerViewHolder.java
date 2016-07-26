package com.example.asus.recyclerviewhorizontal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Asus on 7/25/2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageViewCategory;
    public TextView textViewTitle;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        imageViewCategory=(ImageView)itemView.findViewById(R.id.image_category);
        textViewTitle=(TextView)itemView.findViewById(R.id.title_category);
    }
}
