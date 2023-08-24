package com.act.java06.project07;

/**
 *
 * @author Admin
 */
public class BusinessClass extends FlightTicket {

    public BusinessClass() {
    }

    public BusinessClass(String ticketCode, String flightNumber, String departure, String destination, String departureTime, String arrivalTime, String ticketClass, double fare, String SeatNumber) {
        super(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber);
    }

    @Override
    public void showTicketClassRemaining(Flight fl, Plane p) {
        int avaBusiTicket = fl.getUsedBusinessSeats();
        int totalBusi = fl.getTotalBusinessSeats();
        System.out.println("So ve hang thuong gia: "+(totalBusi - avaBusiTicket));
    }

}
