package com.example.android.movie_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    //MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
      //  adapter = new MyCustomAdapter(this, Data.getData());
      //  recyclerView.setAdapter(adapter);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(this, 3); // (Context context, int spanCount)
        recyclerView.setLayoutManager(mGridLayoutManager);
    }
}
