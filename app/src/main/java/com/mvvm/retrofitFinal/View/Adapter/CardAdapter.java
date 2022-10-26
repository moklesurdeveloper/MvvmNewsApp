package com.mvvm.retrofitFinal.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.mvvm.retrofitFinal.R;
import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;
import com.squareup.picasso.Picasso;

import java.util.List;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MainAdapterClass> {

    Context mContext;
    List<CarInfoModel> listData;

    public CardAdapter(Context mContext, List<CarInfoModel> listData){

        this.mContext = mContext;
        this.listData = listData;
    }

    @NonNull
    @Override
    public MainAdapterClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.cars_list_item,parent,false);
        return new MainAdapterClass(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapterClass holder, int position) {

        holder.car_name.setText(listData.get(position).getCarNames());
        holder.car_desc.setText(listData.get(position).getCarDetails());

        Picasso.get().load(listData.get(position).getCarImages()).into(holder.car_image);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MainAdapterClass extends RecyclerView.ViewHolder {

        private ImageView car_image;
        private TextView car_name,car_desc;

        public MainAdapterClass(@NonNull View itemView) {
            super(itemView);

            car_image=(ImageView)itemView.findViewById(R.id.car_image);
            car_name=(TextView) itemView.findViewById(R.id.car_name);
            car_desc=(TextView)itemView.findViewById(R.id.car_desc);
        }
    }
}
