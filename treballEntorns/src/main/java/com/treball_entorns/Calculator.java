package com.treball_entorns;

/**
 * La classe Calculator permet fer operacions aritmètiques bàsiques
 * com suma, resta, multiplicació i divisió, així com altres funcions addicionals.
 * 
 * @author Victor P., Victor A., Christopher
 */
public class Calculator {

    /**
     * Realitza una operació aritmètica entre dos nombres enters segons el signe especificat.
     *
     * @param num1 El primer operand
     * @param num2 El segon operand
     * @param signe L’operador aritmètic: "+", "-", "*", o "/"
     * @return El resultat de l’operació
     * @throws ArithmeticException Si es divideix per zero
     * @throws IllegalArgumentException Si l’operador no és vàlid
     */
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

    /**
     * Comprova si un nombre és parell.
     *
     * @param num El nombre a comprovar
     * @return Cert si és parell, fals si es imparell
     */
    public boolean esParell(int num) {
        return num % 2 == 0;
    }

    /**
     * Calcula la potència d’un nombre enter elevat a un exponent enter positiu.
     *
     * @param base La base de la potència
     * @param exponent L’exponent (ha de ser 0 o positiu)
     * @return El resultat de base^exponent
     * @throws IllegalArgumentException Si l’exponent és negatiu
     */
    public int potencia(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("L’exponent ha de ser positiu o zero.");
        }

        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }
}
