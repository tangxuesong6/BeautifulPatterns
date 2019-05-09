package com.mdht.beautifulkotlin.abstractfactory.java;

import android.util.Log;

public class SUVTireJava implements ITireJava {
    @Override
    public void tire() {
        Log.d("SUVTireJava", "SUV 轮胎");
    }
}
