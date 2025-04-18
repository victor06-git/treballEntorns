package com.treball_entorns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // Inicialización del objeto Calculator
    }

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(15, calculator.calculate(10, 5, "+"), "Addition test failed: 10 + 5 should equal 15");
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(5, calculator.calculate(10, 5, "-"), "Subtraction test failed: 10 - 5 should equal 5");
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(50, calculator.calculate(10, 5, "*"), "Multiplication test failed: 10 * 5 should equal 50");
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2, calculator.calculate(10, 5, "/"), "Division test failed: 10 / 5 should equal 2");
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.calculate(10, 0, "/"));
        assertEquals("Division by zero is not allowed.", exception.getMessage(), "Division by zero exception message mismatch");
    }

    @Test
    void shouldThrowExceptionForInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.calculate(10, 5, "%"));
        assertEquals("Invalid operator: %", exception.getMessage(), "Invalid operator exception message mismatch");
    }
}
