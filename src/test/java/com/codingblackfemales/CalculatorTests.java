package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiply(){
        final Integer product = Calculator.multiply(204, 10);

        assertEquals(2040, product);
    }

    @Test
    @DisplayName("multiply one positive number one negative")
    public void testMultiplyAlmostNegative(){
        final Integer product = Calculator.multiply(2, -10);
        assertEquals(-20, product);
    }

    @Test
    @DisplayName("multiply two negative number")
    public void multiplyNegativeNumbers(){
        final Integer product = Calculator.multiply(-2, -10);
        assertEquals(20, product);
    }

    @Test
    @DisplayName("multiply a zero with positive number")
    public void zeroMultiplyPositiveN(){
        final Integer product = Calculator.multiply(0, 10);
        assertEquals(0, product);
    }

    @Test
    @DisplayName("Divide two numbers")
    public void testDivide(){
        final Integer product = Calculator.divide(20, 10);

        assertEquals(2, product);
    }

    @Test
    @DisplayName("divide one positive number one negative")
    public void testDivideAlmostNegative(){
        final Integer product = Calculator.divide(20, -10);
        assertEquals(-2, product);
    }

    @Test
    @DisplayName("divide two negative number")
    public void divideNegativeNumbers(){
        final Integer product = Calculator.divide(-20, -10);
        assertEquals(2, product);
    }

    @Test
    @DisplayName("divide a zero by positive number")
    public void positiveNDivideZero(){
        final Integer product = Calculator.divide(0, 10);
        assertEquals(0, product);
    }

    @Test
    @DisplayName("divide a zero by positive number")
    public void zeroDividePositiveN (){
        // final Integer product = Calculator.divide(10, 0);
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
    }
}
