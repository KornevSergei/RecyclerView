package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//оздаем класс для заполения и наследуемся от адаптера
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecyclerViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;


    //класс который содержит в себе имейдж и текст 1 /2
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            //связываем с элементами разметки
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    //в конструтор передаем данный из аррейлист и извлекаем элементы
    public RecycleViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;

    }

    //создаем элемент с параметрами
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }


    //получаем информацию из арейлист
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = arrayList.get(position);

        //заполняем
        holder.imageView.setImageResource(recyclerViewItem.getImageResource());
        holder.textView1.setText(recyclerViewItem.getText1());
        holder.textView2.setText(recyclerViewItem.getText2());

    }


    //возвращаем элементы
    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
