package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Posts> posts;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public View itemView;
        public TextView username;
        public TextView text;
        public ImageView photo;
        public MyViewHolder(View v){
            super(v);
            itemView = v;
            username = itemView.findViewById(R.id.username);
            text = itemView.findViewById(R.id.text);
            photo = itemView.findViewById(R.id.photo);
        }

    }

    public MyAdapter(ArrayList<Posts> p) {
        posts = p;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_row, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        String un = posts.get(position).returnUsername();
        holder.username.setText(un);

        String t = posts.get(position).returnText();
        holder.text.setText(t);

        String p = posts.get(position).returnPhoto();
        Picasso.with(holder.photo.getContext()).load(p).into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

}
