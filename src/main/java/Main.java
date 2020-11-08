import model.*;
import service.FullTimeEmployeeTaxCalculator;
import service.PartTimeEmployeeTaxCalculator;
import model.Salary;
import service.TaxCalculator;

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
                int hoursperWeerk = employee.getNumberOfHoursPerWeek();
                String employeeType = null;
                if(hoursperWeerk == 40) {
                    employeeType = "FullTimeEmployee";
                }
                if(hoursperWeerk == 20) {
                    employeeType = "PartTimeEmployee";
                }
                if(hoursperWeerk == 0){
                    employeeType = "Intern";

                }
                Salary netSalary = employee.getSalary();

                double tax = netSalary.getTax(employeeType);
                double grossSalary = netSalary.getGrossSalary(employeeType);

                printSalaryDetails(employeeName,netSalary,tax,grossSalary);
            });
        }

        public static void printSalaryDetails(String name, Salary salary, double tax, double grossSalary) {
            System.out.println("\n===========================================================\n");
            System.out.println(name + " salary details:\n");
            System.out.println("Net Salary: " + Double.valueOf(salary.getNetSalary()));
            System.out.println("Taxes: " + tax);
            System.out.println("Gross Salary: " + grossSalary);
        }


//
//        Employee fulltimeemployee = new FullTimeEmployee("Matei", 2300);
//        System.out.println(fulltimeemployee);
//        TaxCalculator taxCalulator1 = new FullTimeEmployeeTaxCalculator();
//        double salary2 = taxCalulator1.calculate(fulltimeemployee);
//        System.out.println(salary2);


}
