package com.example.shubham.shubham_nav;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IndividualRecyclerViewAdapter extends RecyclerView.Adapter<IndividualRecyclerViewAdapter.MViewHolder> {

    private Context mContext;
    private List<IndividualItemModel> mData;

    public IndividualRecyclerViewAdapter(Context mContext, List<IndividualItemModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.individual_item_layout,parent,false);
        MViewHolder vHolder = new MViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {

        holder.tv_itemName.setText(mData.get(position).getItem_name());
        holder.tv_stock.setText(mData.get(position).getIn_stock());
        holder.img.setImageResource(mData.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_itemName,tv_stock;
        private ImageView img;
        CardView cardView;

        public MViewHolder(View itemView) {
            super(itemView);

            tv_itemName = (TextView)itemView.findViewById(R.id.name_individual_item);
            tv_stock = (TextView)itemView.findViewById(R.id.stock_individual_item);
            img = (ImageView)itemView.findViewById(R.id.img_individual_item);

            cardView = (CardView)itemView.findViewById(R.id.individual_cardview);
        }
    }

}
