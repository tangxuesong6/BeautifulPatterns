package com.mdht.beautifulkotlin.state.java;

import android.util.Log;

public class LoginedStateJava implements UserStateJava {
    @Override
    public void forward() {
        Log.d("LoginedStateJava", "LoginedStateJava 点击了转发，可以转发");
    }

    @Override
    public void comment() {
        Log.d("LoginedStateJava", "LoginedStateJava 点击了评论，可以评论");
    }
}
