package com.treball_entorns;

public class Calculator {

    public static void main(String[] args) {
        
    }

    public int calculate(int num1, int num2, String signe) {
        switch (signe) {
            case "+" -> { return num1 + num2; }
            case "-" -> { return num1 - num2; }
            case "*" -> { return num1 * num2; }
            case "/" -> {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + signe);
        }
    }
}
