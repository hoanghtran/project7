package com.act.java06.lesson9.lab01;

public class Circle implements IShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void show() {
        System.out.printf("Circle(r = %f): perimeter = %.3f, area = %.3f\n", radius, getPerimeter(), getArea());
    }

    
}
