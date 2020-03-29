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
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ElectronicFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<IndividualItemModel> lstIndividual;
    IndividualRecyclerViewAdapter individualRecyclerViewAdapter;
    private static final String PRODUCT_URL = "http://192.168.1.11/shubhamNav/notebooks.php";


    public ElectronicFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_electronic,container,false);
        recyclerView = (RecyclerView)v.findViewById(R.id.electronic_recyclerview);
        individualRecyclerViewAdapter = new IndividualRecyclerViewAdapter(getContext(),lstIndividual);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        lstIndividual = new ArrayList<>();

        loadProducts();
    }
    private void loadProducts(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, PRODUCT_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray products = new JSONArray(response);

                    for(int i=0;i<products.length();i++){
                        JSONObject productObject = products.getJSONObject(i);

                        int id=productObject.getInt("id");
                        String name=productObject.getString("name");
                        Double price=productObject.getDouble("price");
                        int quantity=productObject.getInt("quantity");
                        String shortdesc=productObject.getString("shortdesc");
                        String image=productObject.getString("image");
                        //   Toast.makeText(getContext(),image+" received",Toast.LENGTH_LONG).show();
                        lstIndividual.add(new IndividualItemModel(id,name,price,quantity,shortdesc,image));
                    }
                    recyclerView.setAdapter(individualRecyclerViewAdapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        Volley.newRequestQueue(getContext()).add(stringRequest);
    }

}
