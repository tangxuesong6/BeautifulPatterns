package com.mdht.beautifulkotlin.chainofresponsibility.java;

public abstract class ILeaderJava {
    public ILeaderJava nextHandler;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(money);
            }
        }

    }

    public abstract int limit();

    public abstract void handle(int money);
}
