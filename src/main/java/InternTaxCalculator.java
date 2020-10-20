public class InternTaxCalculator implements TaxCalulator {

    public static final double TAX = 0.16;

    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return salary * TAX;
    }
}
