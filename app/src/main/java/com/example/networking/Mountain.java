package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Mountain {

    String name;
    Integer size;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Mountain(String Name, Integer Size, String Location){
        this.name = Name;
        this.size = Size;
        this.location = Location;
    }


}