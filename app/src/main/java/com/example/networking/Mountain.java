package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Mountain extends AppCompatActivity {

    String name;
    Integer height;


    public Mountain(String Name, Integer Height){
        this.name = Name;
        this.height = Height;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);


    }
}