package pl.coderslab.tdd.creation.tdd.assertions;

import org.junit.jupiter.api.Test;

import javax.script.ScriptException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;
    @Test
    void add() {
        int A = 10;
        int B = 20;
        int expected = 30;
        int result = Calculator.add(A,B);
        assertEquals(expected, result, "Jest ok");
    }

    @Test
    void deduct() {
        int A = 10;
        int B = 20;
        int expected = -10;
        int result = Calculator.deduct(A,B);
        assertEquals(expected, result, "Jest błąd");
    }

    @Test
    void multiply() {
        int A = 10;
        int B = 20;
        int expected = 200;
        int result = Calculator.multiply(A,B);
        assertEquals(expected, result, "Jest błąd");
    }

    @Test
    void divide() {
        int A = 10;
        int B = 0;
        int expected = 200;
        int result = Calculator.divide(A,B);
        assertEquals(expected, result, "Jest błąd");
        assertThrows(ArithmeticException.class, ()->Calculator.divide(A,B));
    }
    @Test
    void greater() {
        //given
        int a = 10; int b = 20; int expected = 30;

        //when
        boolean result = calculator.greater(a, b);

        //then
        assertTrue(result);
    }
    @Test
    public void evaluatesExpression() throws ScriptException {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);
    }
}