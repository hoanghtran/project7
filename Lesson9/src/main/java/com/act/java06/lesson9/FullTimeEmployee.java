package com.act.java06.lesson9;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary(){
        return super.getPaymentPerHour() * 8;
    }

    @Override
    public void showInfo() {
        System.out.println("Full time employee:");
        System.out.printf("Name: %s, salary per day: %d\n", getName(), calculateSalary());
    }
}
