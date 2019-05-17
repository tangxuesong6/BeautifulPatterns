package com.mdht.beautifulkotlin.interpreter.java;

import android.util.Log;

import java.util.Stack;

public class CalculatorJava {
    private Stack<ArithmeticExpressionJava> mExpStack = new Stack<ArithmeticExpressionJava>();

    public CalculatorJava(String expression) {
        ArithmeticExpressionJava exp1;
        ArithmeticExpressionJava exp2;
        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; i++) {
            Log.d("CalculatorKotlin",String.valueOf(i));
            switch (elements[i].charAt(0)) {
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpressionJava(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpressionJava(exp1, exp2));
                    break;
                default:
                    mExpStack.push(new NumExpressionJava(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }
    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
