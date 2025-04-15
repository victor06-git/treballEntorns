package com.treball_entorns;

public class Main{
    // ./run.sh com.treball_entorns.Main
    public static void main(String[] args) {
        
        System.out.println("Java entorns");

        Calculator calculator = new Calculator();
        int sum = calculator.calculate(5, 3, "-");
        System.out.println("The sum is: " + sum);
        
    }
}
