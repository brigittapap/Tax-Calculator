public class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int salary){
        super(name, salary);
    }

    public int calculate_tax() {
        int salary = this.getSalary();
        return salary * 16/100 + salary*10/100 + 200;
    }

}
