package com.junit.basicjunittest.exceptionhandlingtest;


import com.junit.basicjunittest.exceptionhandlingtest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testDivideByZero() {
        try {
            calculator.divide(1, 0);
            fail("Expected ArithmeticException to be thrown for division by zero");
        } catch (ArithmeticException e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}