package com.example.shubham.shubham_nav;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class InsideCategoryAdapter extends RecyclerView.Adapter<InsideCategoryAdapter.MyViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
//    private ArrayList<String> names = new ArrayList<>();
//    private ArrayList<String> images = new ArrayList<>();
//    private ArrayList<String> desc = new ArrayList<>();
//    private ArrayList<double> price = new ArrayList<>();
//    private ArrayList<int> quantity = new ArrayList<>();


    private Context mContext;
    private List<insideModel>mData;

    public InsideCategoryAdapter(Context mContext, List<insideModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.individual_item_layout,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Log.d(TAG,"OnBindViewHolder: CAlled");

        holder.tv_name.setText(mData.get(position).getName());
        holder.shortdesc.setText(mData.get(position).getShortdesc());
        holder.price.setText("Rs."+String.valueOf(mData.get(position).getPrice()));
        if(mData.get(position).getQuantity()>10) {
            holder.stock.setText("In Stock:" + String.valueOf(mData.get(position).getQuantity()));
        }else if(mData.get(position).getQuantity() <= 0){
            holder.stock.setText("Out of Stock");
        }else {
            holder.stock.setText("Only few left:"+String.valueOf(mData.get(position).getQuantity()));
        }
        Glide.with(mContext)
                .load(mData.get(position).getImage())
                .into(holder.img);

        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startAnim(v,position);

                String url="http://192.168.1.11/shubhamNav/temp_order.php?id="+mData.get(position).getId()+"&mobile="+Session.mobile+
                        "&quantity="+Session.quantity;
                StringRequest req=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                       // Toast.makeText(this,"added to cart",Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                     //   Toast.makeText(InsideCategoryAdapter.this,"",Toast.LENGTH_LONG).show();
                    }
                });
                Volley.newRequestQueue(mContext).add(req);
            }
        });

    }

    public void startAnim(View v,int position){
        Button button=(Button)v.findViewById(R.id.addtocart_individual_item);

        button.startAnimation(AnimationUtils.loadAnimation(mContext, R.anim.bounce));
        Toast.makeText(mContext,mData.get(position).getName()+" Added to Cart",Toast.LENGTH_LONG).show();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name,shortdesc,price,stock;

        ImageView img;
         CardView cardView;
         Button addToCart;
       // LinearLayout cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.name_individual_item);
            img = (ImageView)itemView.findViewById(R.id.circle_img);
            shortdesc=(TextView)itemView.findViewById(R.id.shortdesc);
            price=(TextView)itemView.findViewById(R.id.price);
            stock=(TextView)itemView.findViewById(R.id.stock_individual_item);
            cardView=(CardView) itemView.findViewById(R.id.individual_cardview);
            addToCart=(Button)itemView.findViewById(R.id.addtocart_individual_item);
        }
    }
}
