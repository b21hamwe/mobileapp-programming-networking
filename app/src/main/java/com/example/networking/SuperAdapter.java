package com.example.networking;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SuperAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Mountain> mountains = new ArrayList();
    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        return new ViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false)));

    };

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);

        holder.name.setText(mountain.name);
        holder.size.setText(String.valueOf(mountain.getSize()));
        holder.location.setText(mountain.location);
    }


    public int getItemCount(){
      return mountains.size();
    };

    public void setMountains (List<Mountain>mountains){
        this.mountains = mountains;
    };
}
