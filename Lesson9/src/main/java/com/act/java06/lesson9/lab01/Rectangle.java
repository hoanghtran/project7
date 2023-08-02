package com.act.java06.lesson9.lab01;

public class Rectangle implements IShape {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void show() {
        System.out.printf("Rectangle(%f, %f): perimeter = %.3f, area = %.3f\n", length, width, getPerimeter(), getArea());
    }

}
