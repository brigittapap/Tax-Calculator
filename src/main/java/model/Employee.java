package model;

public abstract class Employee {

    private String name;
    private Salary salary;
    private int numberOfHoursPerWeek;
    private String type;

    public Employee(String name, double netSalary) {
        this.name = name;
        this.salary = new Salary(netSalary);
    }

    public String getName() {
        return name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public int getNumberOfHoursPerWeek() {
        return numberOfHoursPerWeek;
    }

    public void setNumberOfHoursPerWeek(int numberOfHoursPerWeek) {
        this.numberOfHoursPerWeek = numberOfHoursPerWeek;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "model.Employee " +
                "name='" + name + '\'' +
                ", salary=" + salary;
    }

}

