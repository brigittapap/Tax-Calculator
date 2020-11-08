package service;

import model.Employee;

public class InternTaxCalculator implements TaxCalculator {

    public static final double INCOME_TAX_PERCENTAGE = 16;

    public double calculate(double salary) {
//        int salary = employee.getSalary();
        return salary * INCOME_TAX_PERCENTAGE / 100;
    }
}
