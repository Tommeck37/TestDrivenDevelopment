package pl.coderslab.tdd.creation.tdd.practice;

import org.apache.commons.math3.util.Precision;

public class Circle {



    public static Double circleArea(Double r){
        if(r < 0){
            throw new ArithmeticException("Wartość nie może być ujemna");
        }else {
            return Precision.round((Math.PI *(r*r)),2);
        }
    }
}
