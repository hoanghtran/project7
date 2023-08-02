package com.act.java06.lesson9;

public class Employee implements IEmployee, IShow{
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }
            
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour;
    }

    @Override
    public void showInfo() {
    }    
}
