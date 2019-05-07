package com.mdht.beautifulkotlin.factorymethod.java;

import android.util.Log;
import com.mdht.beautifulkotlin.factorymethod.java.IColorJava;

public class RedJava implements IColorJava {
    @Override
    public void show() {
        Log.d("RedJava","RedJava---> show");
    }
}
