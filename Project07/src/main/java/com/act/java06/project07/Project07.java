package com.act.java06.project07;

import java.time.LocalDateTime;
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
        System.out.println("1: Thêm/Sửa/Xóa/Hiển thị/Tra cứu hành khách");
        System.out.println("2: Thêm/Sửa/Xóa/Hiển thị/Tra cứu vé bay");
        System.out.println("3: Thêm/Sửa/Xóa/Hiển thị/Tra cứu chuyen bay");
        System.out.println("4: Thêm/Sửa/Xóa/Hiển thị/Tra cứu hãng hàng không");
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

    static void menuFlightEdit() {
        System.out.println("Lua chon thao tac");
        System.out.println("1. Sua diem xuat phat");
        System.out.println("2. Sua diem den");
        System.out.println("3. Sua thoi gian di");
        System.out.println("4. Sua thoi gian den");
        System.out.println("5. Sua so luong cho ngoi hang thuong gia");
        System.out.println("6. Sua so luong cho ngoi hang pho thong");
        System.out.println("7. Nhap gia ve hang thuong gia");
        System.out.println("8. Nhap gia ve hang pho thong");
    }

    static void AirlineMenu() {
        System.out.println("============= Airline Menu =============");
        System.out.println("1: Thêm một hãng hàng không");
        System.out.println("2: Sửa thông tin một hãng hàng không");
        System.out.println("3: Xóa thông tin một hãng hàng không");
        System.out.println("4. Hiển thị thông tin các hãng hàng không");
        System.out.println("5. Tra cứu thông tin các hãng hàng không");
        System.out.println("6: Thoát menu");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
    }

    public static void main(String[] args) {

        //khai báo danh sách với cú pháp L[name] ví dụ: LPassengers nhé
        ArrayList<Passenger> LPassengers = new ArrayList<>();
        ArrayList<FlightTicket> LTicket = new ArrayList<>();
        ArrayList<Flight> LFlight = new ArrayList<>();
        ArrayList<Airline> LAirline = new ArrayList<>();

        //
        int your_rq, luaChon;

        do {
            menu();
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1: {
                    passengerMenu();
                    int passenger1 = sc.nextInt();
                    switch (passenger1) {
                        case 1: {
                            System.out.print("Nhap ten hanh khach:");
                            sc.nextLine();
                            String hoTen = sc.nextLine();
                            System.out.print("Nhap can cuoc cong dan hanh khach:");
                            String ID = sc.nextLine();
                            System.out.print("Nhap ma ve:");
                            String maVe = sc.nextLine();
                            LPassengers.add(new Passenger(ID, hoTen, maVe));
                            System.out.println("Da them thanh cong:");
                            System.out.println("ID: " + ID);
                            System.out.println("Ho ten: " + hoTen);
                            System.out.println("Ma ve: " + maVe);
                            break;
                        }
                        case 2: {
                            System.out.print("Nhap ID can sua doi:");
                            sc.nextLine();
                            String suaDoi = sc.nextLine();
                            for (int i = 0; i < LPassengers.size(); i++) {
                                if (LPassengers.get(i).getID().equals(suaDoi)) {
                                    System.out.println("==============Menu==============");
                                    System.out.println("1: ten hanh khach");
                                    System.out.println("2: ma ve:");
                                    System.out.print("chon muc can doi:");
                                    int passenger2 = sc.nextInt();
                                    if (passenger2 == 1) {
                                        System.out.print("nhap ten moi: ");
                                        String tenMoi = sc.nextLine();
                                        LPassengers.get(i).setFullName(tenMoi);

                                    } else if (passenger2 == 2) {
                                        System.out.print("Nhap ma ve moi: ");
                                        String veMoi = sc.nextLine();
                                        LPassengers.get(i).setTicketCode(veMoi);
                                    }
                                }
                            }
                            break;
                        }
                        case 3: {
                            System.out.print("Nhap ID can xoa:");
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
                            System.out.println("Tuy chon:");
                            System.out.println("1: hien tat ca");
                            System.out.println("2: hien hanh khach :");
                            System.out.print("Nhap lua chon: ");
                            int passenger3 = sc.nextInt();

                        }
                        case 5: {
                            System.out.print("Nhap so hieu chuyen bay: ");
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
                        case 6: {

                        }
                        default:
                            break;
                    }
                    break;
                }
                case 2: { // case 2 tổng
                    flightTicketMenu();

                    int flightTicket1 = sc.nextInt();
                    String ticketCode = "";
                    String flightNumber = "";
                    String departure = "";
                    String destination = "";
                    String departureTime = "";
                    String arrivalTime = "";
                    String ticketClass = "";
                    double fare = 0;
                    String SeatNumber = "";
                    switch (flightTicket1) {
                        case 1: {
                            sc.nextLine();

                            System.out.printf(" -Nhap ma ve: ");
                            ticketCode = sc.nextLine();

                            System.out.printf(" -Nhap so hieu chuyen bay: ");
                            flightNumber = sc.nextLine();

                            System.out.printf(" -Nhap diem khoi hanh: ");
                            departure = sc.nextLine();

                            System.out.printf(" -Nhap diem den: ");
                            destination = sc.nextLine();

                            System.out.printf(" -Nhap thoi gian khoi hanh: ");
                            departureTime = sc.nextLine();

                            System.out.printf(" -Nhap thoi gian den: ");
                            arrivalTime = sc.nextLine();

                            System.out.printf(" -Nhap hang ve may bay: ");
                            ticketClass = sc.nextLine();

                            System.out.printf(" -Nhap gia ve: ");
                            fare = sc.nextDouble();
                            sc.nextLine();

                            System.out.printf(" -Nhap so hieu ghe ngoi: ");
                            SeatNumber = sc.nextLine();

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
                            Flight fl = new Flight(flightNumber, ticketCode, LocalDateTime.MIN, LocalDateTime.MIN, departure, destination, flightTicket1, flightTicket1, fare, fare);

                            BusinessClass business = new BusinessClass(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber);
                            business.showTicketClassRemaining(fl);

                            EconomyClass economy = new EconomyClass(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber);
                            economy.showTicketClassRemaining(fl);
                            break;
                        }
                        case 5: {
                            break;
                        }

                        default: {
                            break;
                        }
                    }
                    break;
                }

                case 3: { // case 3 tổng
                    flightMenu();

                    int flight1 = sc.nextInt();

                    switch (flight1) {
                        case 1: {

                            System.out.println(" -Nhap so hieu chuyen bay");
                            String soHieuCb = sc.nextLine();

                            System.out.println(" -Nhap so hieu may bay");
                            String soHieuMb = sc.nextLine();

                            System.out.println(" -Nhap diem xuat phat");
                            String diemXp = sc.nextLine();

                            System.out.println(" -Nhap diem den");
                            String diemDen = sc.nextLine();

                            System.out.println(" -Nhap thoi gian di");
                            String tgDi = sc.nextLine();

                            System.out.println(" -Nhap thoi gian den");
                            String tgDen = sc.nextLine();

                            System.out.println(" -Nhap so luong cho ngoi hang thuong gia");
                            int soluongTg = sc.nextInt();

                            System.out.println(" -Nhap so luong cho ngoi hang pho thuong");
                            int soluongPt = sc.nextInt();

                            System.out.println(" -Nhap gia ve hang thuong gia");
                            double giaVeTg = sc.nextDouble();

                            System.out.println(" -Nhap gia ve hang pho thong");
                            double giaVePt = sc.nextDouble();

                            LFlight.add(new Flight(soHieuCb, soHieuMb, LocalDateTime.parse(tgDi), LocalDateTime.parse(tgDen), diemXp, diemDen, soluongTg, soluongPt, giaVeTg, giaVePt));
                            break;
                        }
                        case 2: {
                            System.out.println("Nhap so hieu chuyen bay");
                            String flightCd = sc.nextLine();
                            System.out.println("Nhap 1 thong tin can sua:");
                            String information = sc.nextLine();
                            menuFlightEdit();
                            int chonSua = sc.nextInt();
                            int point = 0;
                            int non = 0;
                            for (int i = 0; i < LFlight.size(); i++) {
                                if (LFlight.get(i).getFlightCode().equals(flightCd)) {
                                    point = i;
                                    non = 1;
                                }
                            }
                            if (non == 0) {
                                System.out.println("Khong tim thay thong tin!!!");
                                break;
                            }
                            switch (chonSua) {
                                case 1:
                                    LFlight.get(point).setDeparture(information);
                                    break;
                                case 2:
                                    LFlight.get(point).setDestination(information);
                                    break;
                                case 3:
                                    LFlight.get(point).setDepartureTime(LocalDateTime.parse(information));
                                    break;
                                case 4:
                                    LFlight.get(point).setArrivalTime(LocalDateTime.parse(information));
                                    break;
                                case 5:
                                    LFlight.get(point).setUsedBusinessSeats(Integer.parseInt(information));
                                    break;
                                case 6:
                                    LFlight.get(point).setUsedEconomySeats(Integer.parseInt(information));
                                    break;
                                case 7:
                                    LFlight.get(point).setBusinessFare(Integer.parseInt(information));
                                    break;
                                case 8:
                                    LFlight.get(point).setEconomyFare(Integer.parseInt(information));
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }

                        case 3:
                            break;
                        default:
                            break;

                    }
                }
                case 4: { // case 4 tổng
                    AirlineMenu();
                    int rq = sc.nextInt();
                    switch (rq) {
                        case 1: {
                            System.out.print("Nhập tên hãng hàng không: ");
                            sc.nextLine();
                            String brandname = sc.nextLine();

                            System.out.print("Nhập mã hãng hàng không: ");
                            String code = sc.nextLine();

                            System.out.print("Nhập số máy bay hãng sở hữu: ");
                            int numOfPlanes = sc.nextInt();

                            LAirline.add(new Airline(brandname, code, numOfPlanes));
                            break;
                        }
                        case 2: {
                            System.out.print("Nhập mã hãng hàng không cần sửa: ");
                            sc.nextLine();
                            String code = sc.nextLine();

                            for (int i = 0; i < LAirline.size(); i++) {
                                if (LAirline.get(i).getCode().equals(code)) {
                                    do {
                                        System.out.println("==============Menu==============");
                                        System.out.println("1: Sửa tên hãng máy bay");
                                        System.out.println("2: Sửa mã hãng máy bay");
                                        System.out.println("3: Sửa số máy bay hãng sở hữu");
                                        System.out.println("4: Sửa số chuyến bay hãng đã bay");
                                        System.out.println("5: Thoát menu");
                                        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
                                        your_rq = sc.nextInt();
                                        switch (your_rq) {
                                            case 1: {
                                                System.out.print("Nhập tên mới của hãng: ");
                                                sc.nextLine();
                                                String new_name = sc.nextLine();

                                                LAirline.get(i).setBrand(new_name);
                                                break;
                                            }
                                            case 2: {
                                                System.out.print("Nhập mã mới của hãng: ");
                                                sc.nextLine();
                                                String new_code = sc.nextLine();

                                                LAirline.get(i).setCode(new_code);
                                                break;
                                            }
                                            case 3: {
                                                System.out.print("Nhập số may bay của hãng: ");
                                                int numPlanes = sc.nextInt();
                                                LAirline.get(i).setNumOfPlanes(numPlanes);
                                                break;
                                            }
                                            case 4: {
                                                System.out.print("Nhập số may bay của hãng: ");
                                                int numFlights = sc.nextInt();
                                                LAirline.get(i).setNumOfFlights(numFlights);
                                                break;
                                            }
                                        }
                                    } while (your_rq != 5);
                                    break;
                                }
                            }
                        }
                        case 3: {
                            System.out.print("Nhập mã hãng hàng không cần xóa: ");
                            sc.nextLine();
                            String code = sc.nextLine();

                            for (int i = 0; i < LAirline.size(); i++) {
                                if (LAirline.get(i).getCode().equals(code)) {
                                    LAirline.remove(i);
                                    break;
                                }
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("STT\tHãng hàng không\tMã hãng\tSố máy bay\tSố chuyên bay");
                            int stt = 0;
                            for (int i = 0; i < LAirline.size(); i++) {
                                Airline tmp = LAirline.get(i);
                                System.out.println(stt++ + "\t" + tmp.getBrand()
                                        + "\t" + tmp.getCode() + "\t" + tmp.getNumOfPlanes()
                                        + "\t" + tmp.getNumOfFlights());
                            }
                            System.out.println("========================== Hết ==========================");
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 5: { // case tổng
                    System.exit(0);
                }
            }
        } while (luaChon != 5);
    }
}
