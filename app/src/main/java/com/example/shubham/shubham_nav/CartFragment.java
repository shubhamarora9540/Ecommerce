package com.example.shubham.shubham_nav;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public class CartFragment extends Fragment implements View.OnClickListener{


    FragmentTransaction fragmentTransaction;
    View v;
    private RecyclerView recyclerView;
    private List<ItemGridModel> lstCategory;
    ItemGridRecyclerAdapter itemGridRecyclerAdapter;
    // PRODUCT_URL = "https://pocket-store.000webhostapp.com/get_temp.php?mobile="+Session.mobile;
    private static final String PRODUCT_URL = "http://192.168.1.11/shubhamNav/get_temp.php?mobile="+Session.mobile;
    Button cancel;

    public CartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_cart, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.cart_recyclerview);
        itemGridRecyclerAdapter = new ItemGridRecyclerAdapter(getContext(),lstCategory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cancel=(Button)v.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(),"Order cancelled",Toast.LENGTH_LONG).show();
//        String url="http://192.168.1.11/shubhamNav/get_temp.php?mobile="+Session.mobile;
        String url="http://192.168.1.11/shubhamNav/cancel_order.php?mobile="+Session.mobile;
        StringRequest req=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //  Toast.makeText(getContext(),"response",Toast.LENGTH_LONG).show();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container,new CartFragment());
                fragmentTransaction.commit();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        Volley.newRequestQueue(getContext()).add(req);

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

                        String name=productObject.getString("name");
                        double price=productObject.getDouble("price");
                        String image=productObject.getString("image");
                        int quantity=productObject.getInt("quantity");
                        double amount=price*quantity;
                        //  Toast.makeText(getContext(),image+" received",Toast.LENGTH_LONG).show();
                        lstCategory.add(new ItemGridModel(image,name,price,quantity,amount));
                    }
                    recyclerView.setAdapter(itemGridRecyclerAdapter);
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
