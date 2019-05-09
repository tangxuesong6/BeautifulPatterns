package com.mdht.beautifulkotlin.abstractfactory.java;

import com.mdht.beautifulkotlin.abstractfactory.kotlin.CarFactory;

public abstract class CarFactoryJava {
    public abstract ITireJava createTire();

    public static CarFactoryJava createFactory(EnumFactoryJava enumFactoryJava) {
        switch (enumFactoryJava) {
            case Q3:
                return new Q3FactoryJava();
            case Q7:
                return new Q7FactoryJava();
            default:
                throw new IllegalArgumentException();
        }
    }
}
