package com.redemption.blog.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.redemption.blog.R;
import com.redemption.blog.adapters.BlogsListAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private BlogsListAdapter adapter;
    private ArrayList<String> data;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.RVBlogsList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        // Create the data to be displayed in the RecyclerView
        data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        // Create the adapter and set it to the RecyclerView
        adapter = new BlogsListAdapter(data);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }
}