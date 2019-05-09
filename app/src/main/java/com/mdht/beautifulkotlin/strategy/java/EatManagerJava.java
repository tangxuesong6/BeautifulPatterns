package com.mdht.beautifulkotlin.strategy.java;

public class EatManagerJava {
    private EatStrategyJava eatStrategyJava;

    public void setStrategy(EatStrategyJava eatStrategyJava) {
        this.eatStrategyJava = eatStrategyJava;
    }

    public String eat(String name) {
        return eatStrategyJava.eat(name);
    }
}
