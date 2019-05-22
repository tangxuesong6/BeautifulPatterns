package com.mdht.beautifulkotlin.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class CoderJava implements Observer {
    public String name;
    public CoderJava(String name){
        this.name = name;
    }
    @Override
    public void update(Observable observable, Object o) {
        Log.d("CoderJava","Hi, "+ name + ",DevTechFrontier更新，内容： " + o);
    }

    @Override
    public String toString() {
        return "码农: "+ name;
    }
}
