
public class PartTimeEmployee extends Employee{

    PartTimeEmployee(String name,int salary){
        super(name, salary);
    }

    public int calculate_tax() {
        int salary = this.getSalary();
        return salary * 16/100 + salary*5/100 + 200;
    }
}
