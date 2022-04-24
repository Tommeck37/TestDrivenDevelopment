package creation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.coderslab.tdd.creation.tdd.creation.TaxCalculator;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    private static TaxCalculator taxCalculator;

    @BeforeAll
    static void beforeAll() {
        taxCalculator = new TaxCalculator();
    }

    @Test
    void calculateGross() {
        Double result = taxCalculator.calculateGross(1000.0, 23.0);
        assertEquals(1230.0, result);
    }


    @Test
    void calculateNetto() {
        Double result = taxCalculator.calculateNetto(1230.0, 23.0);
        assertEquals(1000.0, result);
    }


}