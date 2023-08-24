/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class BusinessClass extends FlightTicket{
     public BusinessClass() {
    }

    public BusinessClass(String ticketCode, String flightNumber, String departure, String destination, String departureTime, String arrivalTime, String ticketClass, double fare, int totalTickets) {
        super(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare);
    }

    @Override
    public void showTicketClassRemaining() {
        
    }

    @Override
    public void add() {
    }

    @Override
    public void edit() {
    }

    @Override
    public void delete() {
    }
    
}
