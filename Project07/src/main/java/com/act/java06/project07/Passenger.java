/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class Passenger implements IPassenger{
    private String ID;
    private String fullName;
    private String ticketCode;

    public Passenger(String ID, String fullName, String ticketCode) {
        this.ID = ID;
        this.fullName = fullName;
        this.ticketCode = ticketCode;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Passenger{" + "ID=" + ID + ", fullName=" + fullName + ", ticketCode=" + ticketCode + '}';
    }
    
    

    @Override
    public void selectionPassenger() {
    }
    
}
