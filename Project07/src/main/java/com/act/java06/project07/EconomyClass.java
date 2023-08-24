/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class EconomyClass extends FlightTicket {

    public EconomyClass() {
    }

    public EconomyClass(String ticketCode, String flightNumber, String departure, String destination, String departureTime, String arrivalTime, String ticketClass, double fare, String SeatNumber) {
        super(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber);
    }

    @Override
    public void showTicketClassRemaining(Flight fl, Plane p) {
        int avaEcoTicket = fl.getUsedEconomySeats();
        int totalEco = fl.getTotalEconomySeats();
        System.out.println("So ve hang pho thong: "+(totalEco - avaEcoTicket));
    }
}
