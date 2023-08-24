/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class Plane {
    private String planeCode;
    private int numOfSeats;

    public Plane(String planeCode, int numOfSeat) {
        this.planeCode = planeCode;
        this.numOfSeats = numOfSeat;
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
