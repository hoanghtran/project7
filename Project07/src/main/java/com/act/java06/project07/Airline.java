package com.act.java06.project07;

/**
 *
 * @author Tran Huy Hoang
 */
public class Airline implements IAirline{

    private String brand;
    private String code;
    private int numOfPlanes;
    Plane[] listOfPlanes;

    public Airline(String brand, String code, int numOfPlanes) {
        this.brand = brand;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
    }

    public Airline() {
    }

    @Override
    public void statisticize_turnOver() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumOfPlanes() {
        return numOfPlanes;
    }

    public void setNumOfPlanes(int numOfPlanes) {
        this.numOfPlanes = numOfPlanes;
    }

    
}
