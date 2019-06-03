package com.mdht.beautifulkotlin.mediator.java;

import android.util.Log;

public class GraphicsCardJava extends ColleagueJava {
    private final String TAG = GraphicsCardJava.class.getSimpleName();
    public GraphicsCardJava(MediatorJava mediatorJava) {
        super(mediatorJava);
    }
    public void videoPlay(String data){
        Log.d(TAG,"视频: "+ data);
    }
}
