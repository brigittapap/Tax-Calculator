public class InternTaxCalculator implements TaxCalulator {

    public static final double INCOME_TAX_PERCENTAGE = 16;

    public double calculate(Employee employee) {
        int salary = employee.getSalary();
        return salary * INCOME_TAX_PERCENTAGE/100;
    }
}
