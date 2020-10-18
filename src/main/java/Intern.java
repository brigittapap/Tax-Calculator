public class Intern extends Employee {

    Intern(String name, int salary){
        super(name,salary);
    }

    public int calculate_tax() {
        int salary = this.getSalary();
        return salary*16/100;
    }

    @Override
    public String toString() {
        return "Intern: " + super.getName() + ", Salary: " + super.getSalary();
    }


}
