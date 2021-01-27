import com.taxcalculator.model.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<Employee> EMPLOYEES = Arrays.asList(
            new FullTimeEmployee("Ioana", 3000),
            new Intern("David", 2000),
            new PartTimeEmployee("Ana", 1430),
            new Intern("Robert", 1800),
            new Intern("Alexandra", 1800),
            new PartTimeEmployee("Liana", 5316),
            new FullTimeEmployee("Mircea", 2566),
            new FullTimeEmployee("Andrea", 5234),
            new FullTimeEmployee("Alex", 4320),

            new FullTimeEmployee("Oana", 4000)
    );

    public static void main(String[] args) {

        EMPLOYEES.forEach(employee -> {
            String employeeName = employee.getName();

            Salary salary = employee.getSalary();

            double netSalary = salary.getNetSalary();
            double tax = salary.getTax(employee);
            double grossSalary = salary.getGrossSalary(employee);

            printSalaryDetails(employeeName, netSalary, tax, grossSalary);
        });
    }

    public static void printSalaryDetails(String name, double netSalary, double tax, double grossSalary) {
        System.out.println("\n===========================================================\n");
        System.out.println(name + " salary details:\n");
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Taxes: " + String.format("%.2f", tax));
        System.out.println("Gross Salary: " + grossSalary);
    }


}
