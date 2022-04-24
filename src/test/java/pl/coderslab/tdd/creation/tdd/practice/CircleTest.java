package pl.coderslab.tdd.creation.tdd.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private static Circle circle;
    @Test
    void circleArea() {
        Circle circle = new Circle();
        assertThrows(ArithmeticException.class, ()->Circle.circleArea(-2.00));
    }
}