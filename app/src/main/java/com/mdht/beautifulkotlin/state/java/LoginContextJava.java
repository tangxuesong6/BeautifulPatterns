package com.mdht.beautifulkotlin.state.java;

public class LoginContextJava {
    private UserStateJava userStateJava = new LogoutStateJava();

    public void setState(UserStateJava userStateJava) {
        this.userStateJava = userStateJava;
    }

    public void forward() {
        userStateJava.forward();
    }

    public void comment() {
        userStateJava.comment();
    }
}
