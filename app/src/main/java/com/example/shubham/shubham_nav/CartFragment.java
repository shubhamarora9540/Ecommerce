package com.example.shubham.shubham_nav;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<ItemGridModel> lstCategory;


    public CartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_cart, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.cart_recyclerview);
        ItemGridRecyclerAdapter itemGridRecyclerAdapter = new ItemGridRecyclerAdapter(getContext(),lstCategory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(itemGridRecyclerAdapter);
        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCategory = new ArrayList<>();

        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));

        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
        lstCategory.add(new ItemGridModel(R.drawable.gifts_34,"item name","25","5","1"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }


}
