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
public class WishlistFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<WishlistModel> lstCategory;


    public WishlistFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.wishlist_fragement, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.wishlist_recyclerview);
        WishlistAdapter wishlistAdapter = new WishlistAdapter(getContext(),lstCategory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(wishlistAdapter);
        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCategory = new ArrayList<>();



        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
        lstCategory.add(new WishlistModel(R.drawable.gifts_34,"item name","25"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }


}
