package com.taxcalculator.model;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, int salary) {
        super(name, salary);
        this.setNumberOfHoursPerWeek(20);
        this.setType("PartTime");
    }

}
