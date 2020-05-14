package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<pojo> pojoList;
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pojoList=new ArrayList<>();
        for(int i=1;i<=5;i++){
            pojo h=new pojo("A",String.valueOf(i),"B.tech");
            pojoList.add(h);
        }
        adapter=new Adapter(pojoList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
