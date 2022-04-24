package pl.coderslab.tdd.creation.tdd.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

private static SimpleCalculator simpleCalculator;
    @Test
    void add() {
        int a = 10;
        int b = 20;
        int expected = 30;

        int result = SimpleCalculator.add(a, b);

        assertEquals(expected, result);
    }
        @Test
        void addPositve () {
            //given
            int numberA = -10;
            int numberB = 30;
            //when
            assertThrows(IllegalArgumentException.class,()->simpleCalculator.addPositve(numberA,numberB));
        }
    }
