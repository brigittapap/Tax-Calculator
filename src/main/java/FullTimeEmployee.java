
public class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int salary){
        super(name, salary);
        this.setNumberOfHoursPerWeek(40);
    }

}
