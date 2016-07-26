package com.example.asus.recyclerviewhorizontal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String RECYCLERVIEW_TYPE="recyclerview_type";
    public static final String HORIZONTAL="horizontal";
    public static final String STAGGERED="staggered";
    public static final String GRID="grid";
    Button buttonHorizontal,buttonStaggered,buttonGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        registerEvent();
    }

    private void registerEvent() {
        buttonHorizontal.setOnClickListener(this);
        buttonStaggered.setOnClickListener(this);
        buttonGrid.setOnClickListener(this);
    }

    private void setupView() {
        buttonGrid=(Button)findViewById(R.id.button_grid_recycler_view);
        buttonHorizontal=(Button)findViewById(R.id.button_horizontal_recyclerview);
        buttonStaggered=(Button)findViewById(R.id.button_staggered_recyclerview);
    }


    @Override
    public void onClick(View view) {
        int id=view.getId();
        Intent intent=new Intent(MainActivity.this,DifferentRecyclerViewActivity.class);
        switch (id){
            case R.id.button_horizontal_recyclerview:
                intent.putExtra(RECYCLERVIEW_TYPE,HORIZONTAL);
                break;
            case R.id.button_staggered_recyclerview:
                intent.putExtra(RECYCLERVIEW_TYPE,STAGGERED);
                break;
            case R.id.button_grid_recycler_view:
                intent.putExtra(RECYCLERVIEW_TYPE,GRID);
                break;
        }
        startActivity(intent);
    }
}
