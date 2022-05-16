package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Mountain extends AppCompatActivity {

    String name;
    Integer height;
    String location;


    public Mountain(String Name, Integer Height,String Location){
        this.name = Name;
        this.height = Height;
        this.location = Location;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);


    }
}