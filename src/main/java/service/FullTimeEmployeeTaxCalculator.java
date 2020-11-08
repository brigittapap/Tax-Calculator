package service;

import model.Employee;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator {

    public static final double INCOME_TAX_PERCENTAGE = 16;
    public static final double HEALTH_CARE_PERCENTAGE = 10;
    public static final double PENSION_FUND = 200;

    public double calculate(double salary) {
//        int salary = employee.getSalary();
        return salary * INCOME_TAX_PERCENTAGE / 100 + salary * HEALTH_CARE_PERCENTAGE / 100 + PENSION_FUND;
    }

}
