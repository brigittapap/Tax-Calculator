public class PartTimeEmployeeTaxCalculator implements TaxCalulator {

    public static final double INCOME_TAX_PERCENTAGE = 16;
    public static final double HEALTH_CARE = 0.05;
    public static final double PENSION_FUND = 200;

    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return salary * INCOME_TAX_PERCENTAGE/100 + salary * HEALTH_CARE/100 + PENSION_FUND;
    }

}
