package com.mdht.beautifulkotlin.template.java;

import android.util.Log;

public class MilitaryComputerJava extends AbstractComputerJava {
    private final String TAG = MilitaryComputerJava.class.getSimpleName();
    @Override
    protected void checkHardware() {
        super.checkHardware();
        Log.d(TAG,"检查硬件防火墙");
    }

    @Override
    protected void login() {
        Log.d(TAG,"进行复杂的身份验证");
    }
}
