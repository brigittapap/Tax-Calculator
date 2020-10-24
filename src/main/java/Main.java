

public class Main {

    public static void main(String[] args){

//        Employee intern = new Intern("Ioana", 500);
//        System.out.println(intern);
//        int salary = intern.calculate_tax();
//        System.out.println(salary);

        Employee fulltimeemployee = new FullTimeEmployee("Matei", 2300);
        System.out.println(fulltimeemployee);
        TaxCalulator taxCalulator1 = new FullTimeEmployeeTaxCalculator();
        double salary2 = taxCalulator1.calculate(fulltimeemployee);
        System.out.println(salary2);

    }

}
