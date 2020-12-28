package service;

import model.Employee;
import model.FullTimeEmployee;
import model.Intern;
import model.PartTimeEmployee;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculator(Employee employee) {
        try {
            if (employee instanceof FullTimeEmployee)
                return new FullTimeEmployeeTaxCalculator();

            else if (employee instanceof PartTimeEmployee)
                return new PartTimeEmployeeTaxCalculator();

            else if (employee instanceof Intern)
                return new InternTaxCalculator();

        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred in the program");
        }
        return null; //mit returnaljak itt?
    }

}
