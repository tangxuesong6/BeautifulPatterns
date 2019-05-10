package com.mdht.beautifulkotlin.state.java;

import android.util.Log;

public class LogoutStateJava implements UserStateJava {
    @Override
    public void forward() {
        Log.d("LogoutStateJava", "LogoutStateJava 点击了转发，不可以转发，提示未登录");
    }

    @Override
    public void comment() {
        Log.d("LogoutStateJava", "LogoutStateJava 点击了评论，不可以评论，提示未登录");
    }
}
