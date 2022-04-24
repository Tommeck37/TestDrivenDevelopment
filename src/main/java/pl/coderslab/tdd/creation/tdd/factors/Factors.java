package pl.coderslab.tdd.creation.tdd.factors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Factors {
    public List<Integer> generatePrimeFactors(Integer number) {
        List<Integer> result = IntStream.rangeClosed(1,number)
                .filter(i -> number % i == 0)
                .boxed()
                .collect(Collectors.toList());

        return result;
    }
}