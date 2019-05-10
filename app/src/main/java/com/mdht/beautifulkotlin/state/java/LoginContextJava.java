package com.mdht.beautifulkotlin.state.java;

public class LoginContextJava {
    private UserStateJava userStateJava;

    private void setState(UserStateJava userStateJava) {
        this.userStateJava = userStateJava;
    }

    public void login() {
        setState(new LoginedStateJava());
    }

    public void logout() {
        setState(new LogoutStateJava());
    }

    public void forward() {
        userStateJava.forward();
    }

    public void comment() {
        userStateJava.comment();
    }
}
