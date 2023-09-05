package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class Plane {
    private String planeCode;
    private int numOfSeats = 20;

    public Plane(String planeCode, int numOfSeat) {
        this.planeCode = planeCode;
        this.numOfSeats = numOfSeat;
    }

    public Plane() {
    }
    
    public int getNumOfSeat() {
        return numOfSeats;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeats = numOfSeat;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }
    
    
    
    
}
