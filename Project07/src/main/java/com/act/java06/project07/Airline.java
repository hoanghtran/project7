package com.act.java06.project07;

/**
 *
 * @author Tran Huy Hoang
 */
public class Airline implements IAirline{

    private String brandname;
    private String code;
    private int numOfPlanes;
    private int numOfFlights;
    Plane[] listOfPlanes;


    public Airline(String brandname, String code, int numOfPlanes, int numOfFlights) {
        this.brandname = brandname;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
        this.numOfFlights = numOfFlights;
    }

    public Airline() {
    }

    @Override
    public double statisticize_turnOver() {
        double turnOver = 0;
        
        
        return turnOver;
    }

    public String getBrand() {
        return brandname;
    }

    public void setBrand(String brandname) {
        this.brandname = brandname;
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

    public int getNumOfFlights() {
        return numOfFlights;
    }

    public void setNumOfFlights(int numOfFlights) {
        this.numOfFlights = numOfFlights;
    }
}
