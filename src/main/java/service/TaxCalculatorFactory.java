package service;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculatorType(String taxCalculatorType) {

        switch (taxCalculatorType) {
            case "FullTime":
                return new FullTimeEmployeeTaxCalculator();

            case "PartTime":
                return new PartTimeEmployeeTaxCalculator();

            case "Intern":
                return new InternTaxCalculator();

        }
        return null;
    }
}
