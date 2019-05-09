package com.mdht.beautifulkotlin.abstractfactory.java;

public class Q3FactoryJava extends CarFactoryJava {
    @Override
    public ITireJava createTire() {
        return new NormalTireJava();
    }
}
