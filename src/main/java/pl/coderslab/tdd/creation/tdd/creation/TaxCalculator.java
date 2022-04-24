package pl.coderslab.tdd.creation.tdd.creation;

public class TaxCalculator {

    public Double calculateGross(Double netto, Double taxRate){
        return netto + netto*(taxRate/100);
    }

    public Double calculateNetto(Double gross, Double taxRate){
        return gross / (1+taxRate/100);
    }

}
