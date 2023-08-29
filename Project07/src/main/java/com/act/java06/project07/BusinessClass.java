package com.act.java06.project07;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class BusinessClass extends FlightTicket {

    public BusinessClass() {
    }

    public BusinessClass(String ticketCode, String flightNumber, String departure, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, String ticketClass, double fare) {
        super(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare);
    }

    
    @Override
    public void showTicketClassRemaining(Flight fl) {
        
        int avaBusiTicket = fl.getUsedBusinessSeats();
        int totalBusi = fl.getTotalBusinessSeats();
        System.out.println("So ve hang thuong gia: "+(totalBusi - avaBusiTicket));
    }

}
