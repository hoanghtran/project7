package com.act.java06.project07;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Flight implements IFlight {

    private String flightCode;
    private String planeCode;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String departure;
    private String arrival;
    private int usedEconomySeats;
    private int usedBusinessSeats;
    private double economyFare;
    private double businessFare;

    public Flight() {
    }

    public Flight(String flightCode, String planeCode, LocalDateTime departureTime,
            LocalDateTime arrivalTime, String departure, String arrival,
            int usedEconomySeats, int usedBusinessSeats, EconomyClass ec, BusinessClass bs) {
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.arrival = arrival;
        this.usedEconomySeats = usedEconomySeats;
        this.usedBusinessSeats = usedBusinessSeats;
        economyFare = ec.getFare();
        businessFare = bs.getFare();
    }

    @Override
    public void add() {
    }

    @Override
    public void remote() {
    }

    @Override
    public void edit() {
    }

    @Override
    public void selectAvailableFlight() {
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getUsedEconomySeats() {
        return usedEconomySeats;
    }

    public void setUsedEconomySeats(int usedEconomySeats) {
        this.usedEconomySeats = usedEconomySeats;
    }

    public int getUsedBusinessSeats() {
        return usedBusinessSeats;
    }

    public void setUsedBusinessSeats(int usedBusinessSeats) {
        this.usedBusinessSeats = usedBusinessSeats;
    }

    public double getEconomyFare() {
        return economyFare;
    }

    public void setEconomyFare(double economyFare) {
        this.economyFare = economyFare;
    }

    public double getBusinessFare() {
        return businessFare;
    }

    public void setBusinessFare(double businessFare) {
        this.businessFare = businessFare;
    }

}
