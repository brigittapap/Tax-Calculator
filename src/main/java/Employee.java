
public class Employee implements EmployeeService{

    private String name;
    private int salary;

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


    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'' +
                ", salary=" + salary ;
    }

    public int calculate_tax() {
        return 0;
    }
}

