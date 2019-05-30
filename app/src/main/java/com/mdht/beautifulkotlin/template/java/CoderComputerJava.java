package com.mdht.beautifulkotlin.template.java;

import android.util.Log;

public class CoderComputerJava extends AbstractComputerJava {
    private final String TAG = CoderComputerJava.class.getSimpleName();
    @Override
    protected void login() {
        Log.d(TAG,"程序员用户名密码验证登录");
    }
}
