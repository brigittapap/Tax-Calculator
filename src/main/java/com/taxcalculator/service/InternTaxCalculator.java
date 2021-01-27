package com.taxcalculator.service;

public class InternTaxCalculator implements TaxCalculator {

    public static final double INCOME_TAX_PERCENTAGE = 16;

    public double calculate(double salary) {
        return salary * INCOME_TAX_PERCENTAGE / 100;
    }
}
