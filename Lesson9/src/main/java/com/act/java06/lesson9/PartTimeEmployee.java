package com.act.java06.lesson9;

public class PartTimeEmployee extends Employee{
    int workingHours;

    public PartTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary(){
        return workingHours * super.getPaymentPerHour();
    }

    @Override
    public void showInfo() {
        System.out.println("Part time employee:");
        System.out.printf("Name: %s, salary per day: %d\n", getName(), calculateSalary());
    }   
}
