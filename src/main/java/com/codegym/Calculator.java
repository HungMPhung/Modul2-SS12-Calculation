package com.codegym;

public class Calculator {
    public static float calculate (float firstOperator, float secondOperator, char operator){
        switch (operator) {
            case '+':
                return firstOperator + secondOperator;
            case '-':
                return firstOperator - secondOperator;
            case '*':
                return firstOperator * secondOperator;
            case '/':
                if (secondOperator != 0)
                    return firstOperator / secondOperator;
                else
                    throw new RuntimeException("Can't divided zero!");
                default:
                    throw new RuntimeException("Invalid operation");

        }
    }
}
