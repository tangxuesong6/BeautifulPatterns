package com.mdht.beautifulkotlin.interpreter.java;

public class NumExpressionJava extends ArithmeticExpressionJava {
    private int num;

    public NumExpressionJava(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
