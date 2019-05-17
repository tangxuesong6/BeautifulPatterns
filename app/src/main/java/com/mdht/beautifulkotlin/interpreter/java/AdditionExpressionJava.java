package com.mdht.beautifulkotlin.interpreter.java;

public class AdditionExpressionJava extends OperatorExpressionJava {
    public AdditionExpressionJava(ArithmeticExpressionJava exp1, ArithmeticExpressionJava exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
