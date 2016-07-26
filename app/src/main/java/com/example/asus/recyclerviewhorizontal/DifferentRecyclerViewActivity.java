package com.example.asus.recyclerviewhorizontal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Asus on 7/25/2016.
 */
public class DifferentRecyclerViewActivity extends Activity {
    RecyclerView recyclerView;
    ArrayList<CategoryInfo> categoryInfoArrayList;
    RecyclerViewAdapter adapter;
    public static final String[] TITLE={"animal","furniture","occupation","fruit","food"};
    public static final int[] IMAGE={R.drawable.animal_cartoon,R.drawable.furniture_cartoon,R.drawable.occupation_cartoon,
    R.drawable.fruit_cartoon,R.drawable.food_cartoon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diferent_recyclerview_layout);
        setupView();
        setDefaultAdapter();
    }

    private void setDefaultAdapter() {
        categoryInfoArrayList=new ArrayList<CategoryInfo>();
        for(int i=0;i<TITLE.length;i++){
            CategoryInfo categoryInfo=new CategoryInfo(TITLE[i],IMAGE[i]);
            categoryInfoArrayList.add(categoryInfo);
        }
        adapter=new RecyclerViewAdapter(getApplicationContext(),categoryInfoArrayList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void setupView() {
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        String type_recyclerview=getIntent().getStringExtra(MainActivity.RECYCLERVIEW_TYPE);
        if(type_recyclerview.equals(MainActivity.HORIZONTAL)){
            LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
            recyclerView.setLayoutManager(layoutManager);
        }
        if(type_recyclerview.equals(MainActivity.STAGGERED)){
            StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        }
        if(type_recyclerview.equals(MainActivity.GRID)){
            GridLayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
            recyclerView.setLayoutManager(layoutManager);
        }
    }
}
