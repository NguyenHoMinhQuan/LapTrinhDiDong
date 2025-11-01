package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class androidVersionAdapter extends RecyclerView.Adapter<androidVersionAdapter.Viewholder> {

    private ArrayList<androidVersion> androidList;
    ItemClicked activity;

    public androidVersionAdapter(Context context, ArrayList<androidVersion> list) {
        androidList = list;
        activity = (ItemClicked) context;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView ivicon;
        TextView tvnam, tvversion;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tvnam = itemView.findViewById(R.id.tvnam);
            tvversion = itemView.findViewById(R.id.tvversion);
            ivicon = itemView.findViewById(R.id.ivicon);

            itemView.setOnClickListener(v -> {
                activity.onItemClicked(getAdapterPosition());
            });
        }
    }

    @NonNull
    @Override
    public androidVersionAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull androidVersionAdapter.Viewholder holder, int position) {
        androidVersion item = androidList.get(position);
        holder.tvnam.setText(item.getName());
        holder.tvversion.setText(item.getVersion());

        switch (item.getPrefer().toLowerCase()) {
            case "cupcake":
                holder.ivicon.setImageResource(R.drawable.cupcake);
                break;
            case "donut":
                holder.ivicon.setImageResource(R.drawable.donut);
                break;
            case "eclair":
                holder.ivicon.setImageResource(R.drawable.eclair);
                break;
            case "kitkat":
                holder.ivicon.setImageResource(R.drawable.kitkat);
                break;
            case "lollipop":
                holder.ivicon.setImageResource(R.drawable.lollipop);
                break;
            case "marshmallow":
                holder.ivicon.setImageResource(R.drawable.marshmallow);
                break;
            case "gingerbread":
                holder.ivicon.setImageResource(R.drawable.gingerbread);
                break;
            case "honeycomb":
                holder.ivicon.setImageResource(R.drawable.honeycomb);
                break;
            case "icecreamsandwich":
                holder.ivicon.setImageResource(R.drawable.icecreamsandwich);
                break;
            case "jellybean":
                holder.ivicon.setImageResource(R.drawable.jellybean);
                break;
            default:
                holder.ivicon.setImageResource(R.drawable.ic_launcher_foreground);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return androidList.size();
    }
}
