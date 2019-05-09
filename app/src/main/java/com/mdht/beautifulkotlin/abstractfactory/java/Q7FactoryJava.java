package com.mdht.beautifulkotlin.abstractfactory.java;

public class Q7FactoryJava extends CarFactoryJava {
    @Override
    public ITireJava createTire() {
        return new SUVTireJava();
    }
}
