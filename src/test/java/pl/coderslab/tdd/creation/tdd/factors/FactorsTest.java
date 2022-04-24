package pl.coderslab.tdd.creation.tdd.factors;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {

    @Test
    public void shouldReturnAllFactors(){
        //given
        Integer number = 20;
        Factors factors = new Factors();
        List<Integer> expected = List.of(1,2,4,5,10,20);

        //when
        List<Integer> result = factors.generatePrimeFactors(number);

        //then
        assertEquals(expected, result);
    }
}