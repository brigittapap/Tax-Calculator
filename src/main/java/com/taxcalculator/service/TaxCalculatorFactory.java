package com.taxcalculator.service;

import com.taxcalculator.model.Employee;
import com.taxcalculator.model.FullTimeEmployee;
import com.taxcalculator.model.Intern;
import com.taxcalculator.model.PartTimeEmployee;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculator(Employee employee) {

        if (employee instanceof FullTimeEmployee)
            return new FullTimeEmployeeTaxCalculator();

        else if (employee instanceof PartTimeEmployee)
            return new PartTimeEmployeeTaxCalculator();

        else if (employee instanceof Intern)
            return new InternTaxCalculator();

        throw new RuntimeException("Invalid employee type");
    }
}
