package com.taxcalculator.service;

import com.taxcalculator.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    @Test
    void testTaxForStudent() {
        Employee testEmployee = new Intern("David", 2000);
        Salary salary = testEmployee.getSalary();

        assertEquals(salary.getTax(testEmployee), 320);
    }

    @Test
    void testTaxForPartTimeEmployee() {
        Employee partTimeEmployee = new PartTimeEmployee("Adriana", 4000);
        Salary salary = partTimeEmployee.getSalary();

        assertEquals(salary.getTax(partTimeEmployee), 1040);
    }

    @Test
    void testTaxForFullTimeEmployee() {
        Employee fullTimeEmployee = new FullTimeEmployee("Mariana", 6300);
        Salary salary = fullTimeEmployee.getSalary();

        assertEquals(salary.getTax(fullTimeEmployee), 1838);
    }

    @Test
    void testRuntimeException() {
        String messageExcepted = "Invalid employee type";
        Employee employee = null;

        TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();
        Assertions.assertThrows(RuntimeException.class, () -> taxCalculatorFactory.getTaxCalculator(employee), messageExcepted);
    }

}
