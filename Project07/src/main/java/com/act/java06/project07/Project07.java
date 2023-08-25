package com.act.java06.project07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yathh
 */
public class Project07 {

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("===============Menu===============");
        System.out.println("1: Thêm/Sửa/Xóa hành khách");
        System.out.println("2: Thêm/Sửa/Xóa vé bay");
        System.out.println("3: Thêm/Sửa/Xóa chuyen bay");
        System.out.println("4: Thêm/Sửa/Xóa hãng hàng khong");
        System.out.println("5: Thoát chương trình");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
    }

    static void passengerMenu() {
        System.out.println("=================Menu=================");
        System.out.println("1: Thêm hành khách");
        System.out.println("2: Sửa hành khách");
        System.out.println("3: Xóa hành khách");
        System.out.println("4: Chọn lọc hành khách từ chuyến bay");
        System.out.println("5: Thoát menu");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
    }

    static void flightTicketMenu() {
        System.out.println("==============Menu==============");
        System.out.println("1: Thêm vé máy bay");
        System.out.println("2: Sửa vé máy bay");
        System.out.println("3: Xóa vé máy bay");
        System.out.println("4: Hiển thị số vé còn lại");
        System.out.println("5: Thoát menu");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
    }

    static void flightMenu() {
        System.out.println("==============Menu==============");
        System.out.println("1: Thêm một chuyến bay");
        System.out.println("2: Sửa thông tin một chuyến bay");
        System.out.println("3: Thoát menu   ");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
    }

    public static void main(String[] args) {
        
        //khai báo danh sách với cú pháp L[name] ví dụ: LPassengers nhé
        ArrayList<Passenger> LPassengers = new ArrayList<>();
        ArrayList<FlightTicket> LTicket = new ArrayList<>();
        ArrayList<Flight> LFlight = new ArrayList<>();
        
        
        menu();
        int luaChon = sc.nextInt();
        
        switch (luaChon) {
            case 1: {
                passengerMenu();
                
                int passenger1 = sc.nextInt();
                
                switch (passenger1) {
                    case 1: {
                        System.out.println("Nhap ten hanh khach:");
                        sc.nextLine();
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap can cuoc cong dan hanh khach:");
                        String ID = sc.nextLine();
                        System.out.println("Nhap ma ve:");
                        String maVe = sc.nextLine();
                        LPassengers.add(new Passenger(ID, hoTen, maVe));
                        System.out.println("Da them thanh cong:");
                        System.out.println("ID: " + ID);
                        System.out.println("Ho ten: " + hoTen);
                        System.out.println("Ma ve: " + maVe);
                        break;
                    }
                    case 2: {
                        System.out.println("Nhap ID can sua doi:");
                        sc.nextLine();
                        String suaDoi = sc.nextLine();
                        for (int i = 0; i < LPassengers.size(); i++) {
                            if (LPassengers.get(i).getID().equals(suaDoi)) {
                                System.out.println("chon muc can doi");
                                System.out.println("1: ten hanh khach");
                                System.out.println("2: ma ve:");
                                
                                int passenger2 = sc.nextInt();

                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Nhap ID can xoa");
                        sc.nextLine();
                        String xoa = sc.nextLine();
                        for (int i = 0; i < LPassengers.size(); i++) {
                            if (LPassengers.get(i).getID().equals(xoa)) {
                                LPassengers.remove(i);
                            }
                        }
                        System.out.println("Da xoa ID: " + xoa);
                        break;
                    }
                    case 4: {
                        System.out.println("nhap so hieu chuyen bay:");
                        sc.nextLine();
                        String soHieu = sc.nextLine();
                        for (int i = 0; i < LFlight.size(); i++) {
                            //người nào có mã vé của vé có số hiệu máy bay = sohieu thì chọn
                            for (int j = 0; j < LPassengers.size(); j++) {
                                if (LPassengers.get(j).getTicketCode().equals(LTicket.get(i).getTicketCode())) {
                                    LPassengers.get(i).toString();
                                }
                            }
                        }
                        break;
                    }
                    case 5:{
                        
                    }
                    default: break;
                }
            }
            case 2: {
                flightTicketMenu();
                
                int flightTicket1 = sc.nextInt();
                
                switch (flightTicket1) {
                    case 1: {
                        sc.nextLine();
                        System.out.printf(" -Nhap ma ve: ");
                        String ticketCode = sc.nextLine();
                        System.out.printf(" -Nhap so hieu chuyen bay: ");
                        String flightNumber = sc.nextLine();
                        System.out.printf(" -Nhap diem khoi hanh: ");
                        String departure = sc.nextLine();
                        System.out.printf(" -Nhap diem den: ");
                        String destination = sc.nextLine();
                        System.out.printf(" -Nhap thoi gian khoi hanh: ");
                        String departureTime = sc.nextLine();
                        System.out.printf(" -Nhap thoi gian den: ");
                        String arrivalTime = sc.nextLine();
                        System.out.printf(" -Nhap hang ve may bay: ");
                        String ticketClass = sc.nextLine();
                        
                        System.out.printf(" -Nhap gia ve: ");
                        double fare = sc.nextDouble();
                        sc.nextLine();
                        System.out.printf(" -Nhap so hieu ghe ngoi: ");
                        String SeatNumber = sc.nextLine();
                        LTicket.add(new FlightTicket(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber));
                        break;
                    }
                    case 2: {
                        sc.nextLine();
                        System.out.printf("Nhap ma ve can sua: ");
                        String maVe = sc.nextLine();
                        for (int i = 0; i < LTicket.size(); i++) {
                            if (LTicket.get(i).getTicketCode().equals(maVe)) {

                            } else {
                                System.out.println("Khong the sua do khong tim thay ma ve!!!");
                            }
                        }
                        break;
                    }
                    case 3: {
                        sc.nextLine();
                        System.out.printf("Nhap ma ve can sua: ");
                        String maVe = sc.nextLine();
                        for (int i = 0; i < LTicket.size(); i++) {
                            if (LTicket.get(i).getTicketCode().equals(maVe)) {
                                LTicket.remove(i);
                            } else {
                                System.out.println("Khong the xoa do khong tim thay ma ve!!!");
                            }
                        }
                        break;
                    }
                    case 4: {

                        break;
                    }

                    default: {
                        break;
                    }
                }
            }
            case 3: {
                flightMenu();
                
                int flight1 = sc.nextInt();
                
                switch (flight1) {
                    case 1: {
                        Flight flight = new Flight();
                        System.out.println("Nhap so hieu chuyen bay");
                        flight.getFlightCode();
                        sc.nextLine();
                        System.out.println("Nhap so hieu may bay");
                        flight.getPlaneCode();
                        sc.nextLine();
                        System.out.println("Nhap diem xuat phat");
                        flight.getDeparture();
                        sc.nextLine();
                        System.out.println("Nhap diem den");
                        flight.getDestination();
                        System.out.println("Nhap thoi gian di");
                        String str = sc.nextLine();
                        flight.getDepartureTime().parse(str);
                        System.out.println("Nhap thoi gian den");
                        str = sc.nextLine();
                        flight.getArrivalTime().parse(str);
                        System.out.println("Nhap so luong cho ngoi hang thuong gia");
                        flight.getUsedBusinessSeats();
                        System.out.println("Nhap so luong cho ngoi hang pho thuong");
                        flight.getUsedEconomySeats();
                        System.out.println("Nhap gia ve hang thuong gia");
                        flight.getBusinessFare();
                        System.out.println("Nhap gia ve hang pho thong");
                        flight.getEconomyFare();
                        // so luong ve ban ra
                        LFlight.add(flight);
                        break;
                    }
                    case 2: {
                        System.out.println("Nhap so hieu chuyen bay");
                        String cdFlight = sc.nextLine();
                        System.out.println("Lua chon thao tac");
                        System.out.println("1. Sua diem xuat phat");
                        System.out.println("2. Sua diem den");
                        System.out.println("3. Sua thoi gian di");
                        System.out.println("4. Sua thoi gian den");
                        System.out.println("5. Sua so luong cho ngoi hang thuong gia");
                        System.out.println("6. Sua so luong cho ngoi hang pho thong");
                        System.out.println("7. ");
                    }
                }
            }
            case 4: {

            }
            case 5: {
                
            }

        }
    }
}
