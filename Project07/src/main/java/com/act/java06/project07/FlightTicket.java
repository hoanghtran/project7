package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class FlightTicket implements IFlightTicket {

    private String ticketCode;
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String ticketClass;
    private double fare;
    private String SeatNumber;

    public FlightTicket() {
    }

    public FlightTicket(String ticketCode, String flightNumber, String departure, String destination, String departureTime, String arrivalTime, String ticketClass, double fare, String SeatNumber) {
        this.ticketCode = ticketCode;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketClass = ticketClass;
        this.fare = fare;
        this.SeatNumber = SeatNumber;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public double getFare() {
        return fare;
    }

    public String getSeatNumber() {
        return SeatNumber;
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

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setSeatNumber(String SeatNumber) {
        this.SeatNumber = SeatNumber;
    }
}
