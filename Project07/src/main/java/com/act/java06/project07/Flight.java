package com.act.java06.project07;

import java.time.LocalDateTime;
import java.util.List;

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
    private String destination;
    private int usedEconomySeats;
    private int usedBusinessSeats;
    private double economyFare;
    private double businessFare;
    private int totalEconomySeats;
    private int totalBusinessSeats;
    private int numOfPassengers;
    private int numOfBusiness;
    private int numOfEconomic;
    private List<Passenger> listOfPassengers;
    private List<BusinessClass> listOfBusiness;
    private List<EconomyClass> listOfEconomic;

    public Flight() {
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfBusiness() {
        return numOfBusiness;
    }

    public void setNumOfBusiness(int numOfBusiness) {
        this.numOfBusiness = numOfBusiness;
    }

    public int getNumOfEconomic() {
        return numOfEconomic;
    }

    public void setNumOfEconomic(int numOfEconomic) {
        this.numOfEconomic = numOfEconomic;
    }

    public List<Passenger> getListOfPassengers() {
        return listOfPassengers;
    }

    public void setListOfPassengers(List<Passenger> listOfPassengers) {
        this.listOfPassengers = listOfPassengers;
    }

    public List<BusinessClass> getListOfBusiness() {
        return listOfBusiness;
    }

    public void setListOfBusiness(List<BusinessClass> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    public List<EconomyClass> getListOfEconomic() {
        return listOfEconomic;
    }

    public void setListOfEconomic(List<EconomyClass> listOfEconomic) {
        this.listOfEconomic = listOfEconomic;
    }

    public Flight(String flightCode, String planeCode, LocalDateTime departureTime, LocalDateTime arrivalTime, String departure, String destination, int usedEconomySeats, int usedBusinessSeats, double economyFare, double businessFare, int totalEconomySeats, int totalBusinessSeats, int numOfPassengers, int numOfBusiness, int numOfEconomic, List<Passenger> listOfPassengers, List<BusinessClass> listOfBusiness, List<EconomyClass> listOfEconomic) {
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.destination = destination;
        this.usedEconomySeats = usedEconomySeats;
        this.usedBusinessSeats = usedBusinessSeats;
        this.economyFare = economyFare;
        this.businessFare = businessFare;
        this.totalEconomySeats = totalEconomySeats;
        this.totalBusinessSeats = totalBusinessSeats;
        this.numOfPassengers = numOfPassengers;
        this.numOfBusiness = numOfBusiness;
        this.numOfEconomic = numOfEconomic;
        this.listOfPassengers = listOfPassengers;
        this.listOfBusiness = listOfBusiness;
        this.listOfEconomic = listOfEconomic;
    }

    public Flight(String flightCode, String planeCode, LocalDateTime departureTime, LocalDateTime arrivalTime, String departure, String destination, double economyFare, double businessFare, int totalEconomySeats, int totalBusinessSeats) {
        this.flightCode = flightCode;
        this.planeCode = planeCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.destination = destination;
        this.economyFare = economyFare;
        this.businessFare = businessFare;
        this.totalEconomySeats = totalEconomySeats;
        this.totalBusinessSeats = totalBusinessSeats;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public int getTotalEconomySeats() {
        return totalEconomySeats;
    }

    public void setTotalEconomySeats(int totalEconomySeats) {
        this.totalEconomySeats = totalEconomySeats;
    }

    public int getTotalBusinessSeats() {
        return totalBusinessSeats;
    }

    public void setTotalBusinessSeats(int totalBusinessSeats) {
        this.totalBusinessSeats = totalBusinessSeats;
    }

}
