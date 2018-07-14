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
public class HomeFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<CategoryModel> lstCategory;


    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.home_recyclerview);
        CategoryRecyclerViewAdapter categoryRecyclerViewAdapter = new CategoryRecyclerViewAdapter(getContext(),lstCategory);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(categoryRecyclerViewAdapter);
        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCategory = new ArrayList<>();

        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Gifts","Description on click on the category Gifts",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Stationery","Description on click on the category Stationery",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Handicraft","Description on click on the category handicraft",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Toys","Description on click on the category toys",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Printing","Description on click on the category printing",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Playstore","Description on click on the category playstore",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Mpc","Description on click on the category mpc",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("General Store","Description on click on the category general store",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Bakery","Description on click on the category bakery",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Mobiles","Description on click on the category mobile",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Automobile","Description on click on the category automobile",R.drawable.gifts_34));



        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Gifts","Description on click on the category Gifts",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Stationery","Description on click on the category Stationery",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Handicraft","Description on click on the category handicraft",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Toys","Description on click on the category toys",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Printing","Description on click on the category printing",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Playstore","Description on click on the category playstore",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Mpc","Description on click on the category mpc",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("General Store","Description on click on the category general store",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Bakery","Description on click on the category bakery",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Mobiles","Description on click on the category mobile",R.drawable.gifts_34));
        lstCategory.add(new CategoryModel("Automobile","Description on click on the category automobile",R.drawable.gifts_34));



    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }


}
