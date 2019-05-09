package com.mdht.beautifulkotlin.strategy.java;

public class SheepJava implements EatStrategyJava {
    @Override
    public String eat(String name) {
        return "Sheep: " + name + "在吃东西 咩咩咩";
    }

}
