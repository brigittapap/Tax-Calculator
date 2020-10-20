

public class Tax_Calculator {

    public static void main(String[] args){

//        Employee intern = new Intern("Ioana", 500);
//        System.out.println(intern);
//        int salary = intern.calculate_tax();
//        System.out.println(salary);

        Employee fullTimeEmployee = new FullTimeEmployee("Matei", 2300);
        FullTimeEmployeeTaxCalculator fullTimeEmployeeTaxCalculator = new FullTimeEmployeeTaxCalculator();
        System.out.println(fullTimeEmployee);
        double salary2 = fullTimeEmployeeTaxCalculator.calculateTax(fullTimeEmployee);
        System.out.println(salary2);

    }

}
