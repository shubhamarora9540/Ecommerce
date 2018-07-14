package com.example.shubham.shubham_nav;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<CategoryModel> lstCategory;


    public SettingsFragment() {
        // Required empty public constructor
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

        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));

        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
        lstCategory.add(new CategoryModel("Electronics","Description on click on the category electronics",R.drawable.about_us));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }


}
