package model;

import service.TaxCalculator;
import service.TaxCalculatorFactory;

public class Salary {

    double netSalary;
    TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();
    TaxCalculator taxCalculator;

    public Salary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double getNetSalary() {
        return this.netSalary;
    }

    public double getTax(String employee) {
        taxCalculator = taxCalculatorFactory.getTaxCalculatorType(employee);
        return taxCalculator.calculate(getNetSalary());
    }

    public double getGrossSalary(String employee) {
        return this.getTax(employee) + this.getNetSalary();
    }

    @Override
    public String toString() {
        return "Salary{" +
                "netSalary=" + netSalary +
                ", taxCalculatorFactory=" + taxCalculatorFactory +
                ", taxCalculator=" + taxCalculator +
                '}';
    }
}
