package com.example.networking;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class SuperAdapter {

    private List<Mountain> mountains = new ArrayList();

    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

    };

    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position){

    };


    public int getItemCount(){
      return mountains.size();
    };

    public void setMountains (List<Mountain>mountains){
        this.mountains = mountains;
    };
}
