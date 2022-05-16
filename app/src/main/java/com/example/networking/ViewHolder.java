package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView height;
    private TextView name;
    private TextView Location;


    public MountainViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.mountain_name);
    }
}
