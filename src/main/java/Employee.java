
public abstract class Employee {

    private String name;
    private int salary;
    private int numberOfHoursPerWeek;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getNumberOfHoursPerWeek() {
        return numberOfHoursPerWeek;
    }

    public void setNumberOfHoursPerWeek(int numberOfHoursPerWeek) {
        this.numberOfHoursPerWeek = numberOfHoursPerWeek;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'' +
                ", salary=" + salary ;
    }


}

