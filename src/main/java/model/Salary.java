package model;

import com.sun.xml.internal.ws.message.EmptyMessageImpl;
import model.Employee;
import service.TaxCalculator;
import service.TaxCalculatorFactory;

public class Salary {

    double netSalary;
    TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();
    TaxCalculator taxCalculator;

    public Salary(double netSalary){
        this.netSalary = netSalary;
    }

    public double getNetSalary() {
        return this.netSalary;
    }

    public double getTax(String employee){
        taxCalculator = taxCalculatorFactory.getTaxCalculatorType(employee);
        return taxCalculator.calculate(getNetSalary());
    }

    public double getGrossSalary(String employee) {
        return this.getTax(employee) + this.getNetSalary();
    }


}
