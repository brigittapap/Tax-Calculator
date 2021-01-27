package service;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator {

    public static final double INCOME_TAX_PERCENTAGE = 16;
    public static final double HEALTH_CARE_PERCENTAGE = 10;
    public static final double PENSION_FUND = 200;

    public double calculate(double salary) {
        return salary * INCOME_TAX_PERCENTAGE / 100 + salary * HEALTH_CARE_PERCENTAGE / 100 + PENSION_FUND;
    }

}
