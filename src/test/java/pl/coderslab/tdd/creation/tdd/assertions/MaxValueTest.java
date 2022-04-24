package pl.coderslab.tdd.creation.tdd.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {

    private static MaxValue maxValue;

    @Test
    void largest() {
        int [] list = {};
        int expected = 4;

//        int result = MaxValue.largest(list);
        assertThrows(RuntimeException.class, ()->MaxValue.largest(list));
//        assertEquals(expected, result);
    }
}