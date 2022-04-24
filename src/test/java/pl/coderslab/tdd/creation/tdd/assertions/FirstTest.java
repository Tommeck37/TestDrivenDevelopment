package pl.coderslab.tdd.creation.tdd.assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {

    private First first;

    @BeforeEach
    void setUp(){
        first = new First();
    }

    @Test
    void concatString() {
        String partA = "Coders";
        String partB = "Lab";
        String expected = "CodersLab";

        String result = first.concatString(partB, partA);

        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        int a = 10;
        int b = 90;
        int expected = 900;

        int result = first.multiply(a, b);

        assertEquals(expected, result);
    }
}