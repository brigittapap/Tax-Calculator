package service;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculatorType(String taxCalculatorType) {
        if(taxCalculatorType == null) {
            return null;
        }
        if(taxCalculatorType.equalsIgnoreCase("FULLTIMEEMPLOYEE")){
            return new FullTimeEmployeeTaxCalculator();
        }
        if(taxCalculatorType.equalsIgnoreCase("PARTTIMEEMPLOYEE")){
            return new PartTimeEmployeeTaxCalculator();
        }
        if(taxCalculatorType.equalsIgnoreCase("INTERN")){
            return new InternTaxCalculator();
        }
         return null;
    }
}
