package com.mdht.beautifulkotlin.template.java;

import android.util.Log;

public abstract class AbstractComputerJava {
    private final String TAG = AbstractComputerJava.class.getSimpleName();
    protected void powerOn(){
        Log.d(TAG,"开启电源");
    }
    protected void checkHardware(){
        Log.d(TAG,"硬件检查");
    }
    protected void loadOS(){
        Log.d(TAG,"载入操作系统");
    }
    protected void login(){
        Log.d(TAG,"小白的计算机无需验证，直接进入系统");
    }
    public final void startUP(){
        Log.d(TAG,"-----开机 START------");
        powerOn();
        checkHardware();
        loadOS();
        login();
        Log.d(TAG,"------关机 END ------");
    }
}
