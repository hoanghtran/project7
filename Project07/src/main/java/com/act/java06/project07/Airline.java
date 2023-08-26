package com.act.java06.project07;
/**
 *
 * @author Tran Huy Hoang
 */
public class Airline implements IAirline {

    private String brandname;
    private String code;
    private int numOfPlanes;
    private Plane[] listOfPlanes;
    private int numOfFlights = 0;
    private Flight[] listOfFlights;

    public Airline(String brandname, String code, int numOfPlanes) {
        this.brandname = brandname;
        this.code = code;
        this.numOfPlanes = numOfPlanes;
    }

    public Airline() {
    }

    //Scanner sc = new Scanner(System.in);
    @Override
    public double statisticize_turnOver(Flight[] fl, int choose, int option) {
        double turnOver = 0;

        for (Flight flight : fl) {
            if (choose == 1) { // tinh doanh thu theo thang
                if (flight.getArrivalTime().getMonth().getValue() == option) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }
            } else if (choose == 2) { // tinh doanh thu theo nam
                if (flight.getArrivalTime().getYear() == option) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }
            }
        }
        return turnOver;
    }

    public String getBrand() {
        return brandname;
    }

    public void setBrand(String brandname) {
        this.brandname = brandname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumOfPlanes() {
        return numOfPlanes;
    }

    public void setNumOfPlanes(int numOfPlanes) {
        this.numOfPlanes = numOfPlanes;
    }

    public int getNumOfFlights() {
        return numOfFlights;
    }

    public void setNumOfFlights(int numOfFlights) {
        this.numOfFlights = numOfFlights;
    }
}
