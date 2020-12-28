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

    public double getTax(Employee employee) {
        taxCalculator = taxCalculatorFactory.getTaxCalculator(employee);
        return taxCalculator.calculate(getNetSalary());
    }

    public double getGrossSalary(Employee employee) {
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
