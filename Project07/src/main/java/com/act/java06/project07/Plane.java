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
    private int numOfSeat;

    public Plane(String planeCode, int numOfSeat) {
        this.planeCode = planeCode;
        this.numOfSeat = numOfSeat;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }
    
    
    
    
}
