package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //создаём элементы для отображения
    //куда заполняем
    private RecyclerView recyclerView;
    //заполнение
    private RecyclerView.Adapter adapter;
    //разметка
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //создаём лист из обьектов с параетрами класа ресайклервью
        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList();
        //добавляем в список с параметрами класса
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_child_care_24,"Happy", "Life is fan!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_face_24,"Neutral", "Life is Neutral!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_child_care_24,"Happy", "Life is fan!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_face_24,"Neutral", "Life is Neutral!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_child_care_24,"Happy", "Life is fan!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_face_24,"Neutral", "Life is Neutral!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_child_care_24,"Happy", "Life is fan!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_face_24,"Neutral", "Life is Neutral!"));



        //передаем в ресайклервью всё что описывали в классе
        recyclerView = findViewById(R.id.recyclerView);
        //если количество элементов не будет меняться то для производительности устанавливаем
        recyclerView.setHasFixedSize(true);

        adapter = new RecycleViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}