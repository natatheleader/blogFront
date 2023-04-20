package com.redemption.blog.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.redemption.blog.R;

import java.util.ArrayList;

public class BlogsListAdapter extends RecyclerView.Adapter<BlogsListAdapter.MyViewHolder> {

    private ArrayList<String> data;

    public BlogsListAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the layout for each row
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_list_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // Bind the data for each row
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        // Return the size of your data set
        return data.size();
    }

    // Define the views for each row item in the ViewHolder class
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.blogTitle);
        }
    }
}