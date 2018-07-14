package com.example.shubham.shubham_nav;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ElectronicFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<IndividualItemModel> lstIndividual;

    public ElectronicFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_electronic,container,false);
        recyclerView = (RecyclerView)v.findViewById(R.id.electronic_recyclerview);
        IndividualRecyclerViewAdapter individualRecyclerViewAdapter = new IndividualRecyclerViewAdapter(getContext(),lstIndividual);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(individualRecyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstIndividual = new ArrayList<>();

        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
        lstIndividual.add(new IndividualItemModel("mi redmi note 5","in stock",R.drawable.mobiles));
    }
}
