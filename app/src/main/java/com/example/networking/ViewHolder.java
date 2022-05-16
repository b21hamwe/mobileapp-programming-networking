package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView height;
    public TextView name;
    public TextView location;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.mountain_name);
    }
}
