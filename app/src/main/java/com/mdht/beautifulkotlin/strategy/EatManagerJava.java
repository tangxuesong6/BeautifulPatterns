package com.mdht.beautifulkotlin.strategy;

public class EatManagerJava {
    private EatStrategyJava eatStrategyJava;

    public void setStrategy(EatStrategyJava eatStrategyJava) {
        this.eatStrategyJava = eatStrategyJava;
    }

    public void eat() {
        eatStrategyJava.eat();
    }
}
