package com.example.shubham.shubham_nav;

import android.content.Context;
import android.content.Intent;
import android.icu.util.ULocale;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<CategoryModel> mData;

    public CategoryRecyclerViewAdapter(Context mContext, List<CategoryModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_desc,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);


        return vHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_category.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(mContext,CategoryDescription.class);

                //passing data to the description activity

                intent.putExtra("category",mData.get(position).getName());
                intent.putExtra("description",mData.get(position).getDesc());
                intent.putExtra("thumbnail",mData.get(position).getImage());

                //start the activity
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_category;
        private ImageView img;
       // CardView cardView;
        LinearLayout cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_category = (TextView)itemView.findViewById(R.id.category_name);
            img = (ImageView)itemView.findViewById(R.id.category_img);
            cardView=(LinearLayout) itemView.findViewById(R.id.cardview_id);
        }
    }


}
