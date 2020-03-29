package com.example.shubham.shubham_nav;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ItemGridRecyclerAdapter extends RecyclerView.Adapter<ItemGridRecyclerAdapter.MyViewHolder> {
    private Context mContext;
    private List<ItemGridModel> mData;

    public ItemGridRecyclerAdapter(Context mContext, List<ItemGridModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.cart_itemdesign,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Glide.with(mContext)
                .load(mData.get(position).getImage())
                .into(holder.imageView);

        holder.name.setText(mData.get(position).getItemname());
        holder.rate.setText("Rs."+String.valueOf(mData.get(position).getRate()));
        holder.quantity.setText(String.valueOf(mData.get(position).getQuantity()));
        holder.amount.setText("Rs."+String.valueOf(mData.get(position).getAmount()));
 }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView name;
        private TextView rate;
        private EditText quantity;
        private TextView amount;


        public MyViewHolder(View itemView) {
            super(itemView);

            imageView=(ImageView)itemView.findViewById(R.id.cart_image);
            name=(TextView)itemView.findViewById(R.id.cart_itemname);
            rate=(TextView)itemView.findViewById(R.id.cart_rate);
            quantity=(EditText)itemView.findViewById(R.id.cart_quantity);
            amount=(TextView)itemView.findViewById(R.id.cart_amount);

        }
    }
}
