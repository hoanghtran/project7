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
    public double statisticize_turnOver(Flight[] fl, int choose, int month, int year) {
        double turnOver = 0;

        for (Flight flight : fl) {
            if (choose == 1) { // tinh doanh thu theo thang
                if (flight.getArrivalTime().getYear() == year
                        && flight.getArrivalTime().getMonth().getValue() == month) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }

            } else if (choose == 2) { // tinh doanh thu theo nam
                if (flight.getArrivalTime().getYear() == year) {
                    turnOver += flight.getUsedEconomySeats() * flight.getEconomyFare()
                            + flight.getUsedBusinessSeats() * flight.getBusinessFare();
                }
            }
        }
        return turnOver;
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

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Plane[] getListOfPlanes() {
        return listOfPlanes;
    }

    public void setListOfPlanes(Plane[] listOfPlanes) {
        this.listOfPlanes = listOfPlanes;
    }

    public Flight[] getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(Flight[] listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

}
