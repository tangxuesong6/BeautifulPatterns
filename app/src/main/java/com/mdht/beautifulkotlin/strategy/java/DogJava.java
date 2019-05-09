package com.mdht.beautifulkotlin.strategy.java;

public class DogJava implements EatStrategyJava {
    @Override
    public String eat(String name) {
        return "Dog:  " + name + "在吃东西，汪汪汪";
    }
}
