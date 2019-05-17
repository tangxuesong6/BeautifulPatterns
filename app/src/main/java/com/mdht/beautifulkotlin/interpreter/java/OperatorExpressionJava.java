package com.mdht.beautifulkotlin.interpreter.java;

public abstract class OperatorExpressionJava extends ArithmeticExpressionJava {
    protected ArithmeticExpressionJava exp1;
    protected ArithmeticExpressionJava exp2;

    public OperatorExpressionJava(ArithmeticExpressionJava exp1, ArithmeticExpressionJava exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

}
