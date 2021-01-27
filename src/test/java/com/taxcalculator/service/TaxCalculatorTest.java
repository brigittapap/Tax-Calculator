package com.taxcalculator.service;

import com.taxcalculator.model.Employee;
import com.taxcalculator.model.Intern;
import com.taxcalculator.model.Salary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    @Test
    void testTaxForStudent() {
        Employee testEmployee = new Intern("David", 2000);
        Salary salary = testEmployee.getSalary();

        assertEquals(salary.getTax(testEmployee), 320);
    }
}
