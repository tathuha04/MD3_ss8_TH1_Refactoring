package rikkei.academy.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Testign addition")
    void testCalculatorAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testign subtraction")
    void testCalculatorSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testign multiplication")
    void testCalculatorMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testign division")
    void testCalculatorDiv() {
        int a = 2;
        int b = 1;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testign division by zero")
    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

      assertThrows(RuntimeException.class,
              ()->{Calculator.calculate(a,b,o);});
    }
    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 1;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()->{Calculator.calculate(a,b,o);});
    }
}
