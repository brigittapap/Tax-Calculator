

public class Tax_Calculator {

    public static void main(String[] args){

        Employee intern = new Intern("Ioana", 500);
        System.out.println(intern);
        int salary = intern.calculate_tax();
        System.out.println(salary);

        Employee fulltimeemp = new FullTimeEmployee("Matei", 2300);
        System.out.println(fulltimeemp);
        int salary2 = fulltimeemp.calculate_tax();
        System.out.println(salary2);

    }

}
