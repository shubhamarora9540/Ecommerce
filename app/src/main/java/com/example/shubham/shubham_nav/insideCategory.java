package com.example.shubham.shubham_nav;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class insideCategory extends AppCompatActivity {

    //PRODUCT_URL = "https://pocket-store.000webhostapp.com/sports_items.php"
    private static String PRODUCT_URL = "http://192.168.1.11/shubhamNav/sports_items.php";
    RecyclerView recyclerView;
    InsideCategoryAdapter insideCategoryAdapter;
    List<insideModel> productList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inside_category);


        // Receive data
        Intent intent = getIntent();

        String category = intent.getExtras().getString("category");
        String arr[] = category.split(" ",2);
        category = arr[0];

        PRODUCT_URL = "http://192.168.1.11/shubhamNav/sports_items.php?category=";
        PRODUCT_URL = PRODUCT_URL+category;
//         Toast.makeText(this,PRODUCT_URL+" "+Session.mobile,Toast.LENGTH_LONG).show();

        productList = new ArrayList<>();
        recyclerView =(RecyclerView)findViewById(R.id.inside_category_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadProducts();


        }

        private void loadProducts(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, PRODUCT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray products = new JSONArray(response);
                            for (int i=0;i<products.length();i++){
                                JSONObject productObject  = products.getJSONObject(i);
                                int id=productObject.getInt("id");
                                String name=productObject.getString("name");
                                String shortdesc=productObject.getString("shortdesc");
                                double price=productObject.getDouble("price");
                                int quantity=productObject.getInt("quantity");
                                String category=productObject.getString("category");
                                String image=productObject.getString("image");

                                insideModel model=new insideModel(id,name,shortdesc,price,quantity,category,image);
                                productList.add(model);
                            }
                            insideCategoryAdapter = new InsideCategoryAdapter(insideCategory.this,productList);
                            recyclerView.setAdapter(insideCategoryAdapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },

                new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(insideCategory.this,error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
        }
}



