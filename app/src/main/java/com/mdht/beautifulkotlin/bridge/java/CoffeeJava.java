package com.mdht.beautifulkotlin.bridge.java;

public abstract class CoffeeJava {
    protected CoffeeAdditivesJava impl;

    public CoffeeJava(CoffeeAdditivesJava impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();

}
