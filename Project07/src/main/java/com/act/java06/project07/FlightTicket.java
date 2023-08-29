package com.act.java06.project07;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class FlightTicket implements IFlightTicket {

    private String ticketCode;
    private String flightNumber;
    private String departure;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String ticketClass;
    private double fare;


    public FlightTicket() {
    }

    public FlightTicket(String ticketCode, String flightNumber, String departure, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, String ticketClass, double fare) {
        this.ticketCode = ticketCode;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketClass = ticketClass;
        this.fare = fare;
    }

    

    @Override
    public void showTicketClassRemaining(Flight fl) {

    }

    public String getTicketCode() {
        return ticketCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public double getFare() {
        return fare;
    }



    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    
}
