package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private ArrayList<Mountain> mountainList;
    RecyclerView recyclerView;
    private SuperAdapter adapter;


    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new SuperAdapter();
        mountainList = new ArrayList<Mountain>();
        recyclerView = findViewById(R.id. recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonFile(this, this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<Mountain>>() {
        }.getType();

        List<Mountain> listOfMountains = gson.fromJson(json,type);
        adapter.setMountains(listOfMountains);


        Log.d("MainActivity", json);
    }

}
