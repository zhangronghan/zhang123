package com.example.administrator.ad0220;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyAdapter mMyAdapter;
    private List<Dog> dogList=new ArrayList<Dog>();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        initData();
    }

    private void initData() {
        dogList.add(new Dog(R.drawable.dog1, "小狗100000000000000000000"));
        dogList.add(new Dog(R.drawable.dog2, "小狗2"));
        dogList.add(new Dog(R.drawable.dog3, "小狗3"));
        dogList.add(new Dog(R.drawable.dog4, "小狗4"));
        dogList.add(new Dog(R.drawable.dog5, "小狗566666666666666666666"));
        dogList.add(new Dog(R.drawable.dog6, "小狗6"));
        dogList.add(new Dog(R.drawable.dog7, "小狗7"));
        dogList.add(new Dog(R.drawable.dog8, "小狗8"));
        dogList.add(new Dog(R.drawable.dog9, "小狗9"));
    }

    private void initViews() {
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerview);

/*        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);*/  //横向

        //瀑布
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(manager);
        mMyAdapter=new MyAdapter(dogList);
        mRecyclerView.setAdapter(mMyAdapter);
    }
}
