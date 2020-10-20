public class FullTimeEmployeeTaxCalculator implements TaxCalulator {

    public static final double TAX = 0.16;
    public static final double HEALTH_CARE = 0.05;
    public static final double PENSION_FUND = 200;

    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return salary * TAX + salary * HEALTH_CARE + PENSION_FUND;
    }

}
