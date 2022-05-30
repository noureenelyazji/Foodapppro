package com.example.foodapppro.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapppro.R;
import com.example.foodapppro.models.HomeVerModel;

import java.util.List;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViemHolder> {

    Context context;
    List<HomeVerModel>list;

    public HomeVerAdapter(Context context, List<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViemHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViemHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name ,timing ,rating,price;
        public ViemHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_var);
            name=itemView.findViewById(R.id.name_m);
            timing=itemView.findViewById(R.id.time);
            rating=itemView.findViewById(R.id.rating);
            price=itemView.findViewById(R.id.price);
        }
    }
}
