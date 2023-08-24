/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Flight implements IFlight{
    String flightCode;
    String planeCode;
    LocalDateTime departureTime;
    LocalDateTime arrivalTime;
    String departure;
    String arrival;
    int usedEconomySeats;
    int usedBusinessSeats;

    public Flight() {
    }

    public Flight(String flightCode, String planeCode, LocalDateTime departureTime, LocalDateTime arrivalTime, String departure, String arrival) {
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.arrival = arrival;
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
    
}
