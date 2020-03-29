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


/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<CategoryModel> lstCategory;
    private static final String PRODUCT_URL = "http://192.168.1.11/shubhamNav/stationery.php";
    CategoryRecyclerViewAdapter categoryRecyclerViewAdapter;

    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.home_recyclerview);
        categoryRecyclerViewAdapter = new CategoryRecyclerViewAdapter(getContext(),lstCategory);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCategory = new ArrayList<>();

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
                        String description=productObject.getString("description");
                        String image=productObject.getString("image");
                        //  Toast.makeText(getContext(),image+" received",Toast.LENGTH_LONG).show();
                        lstCategory.add(new CategoryModel(name,description,image));
                    }
                    recyclerView.setAdapter(categoryRecyclerViewAdapter);
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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

}
