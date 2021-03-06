package com.mdht.beautifulkotlin.factorymethod.java;

public class ColorFactoryJava {
    public static IColorJava getColor(EnumJava enumJava) {
        switch (enumJava) {
            case RED:
                return new RedJava();
            case YELLOW:
                return new YellowJava();
        }
        return null;
    }
}
