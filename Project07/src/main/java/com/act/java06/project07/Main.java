package com.act.java06.project07;

import static com.fasterxml.uuid.impl.UUIDUtil.uuid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Yatth
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void navigator() {
        System.out.println("======= Đieu huong =======");
        System.out.println("1. Khach hang\n2. Quan ly\n3. Thoat chuong trinh");
        System.out.print("Ban la: ");
    }

    static void airline_menu() { //ArrayList<Airline> LAirline){
        System.out.println("====== Hang hang khong ======");
        System.out.println("1. Bamboo Airways");
        System.out.println("2. Vietnam Airlines");

        // Hàm duyệt hiển thị các hãng hàng không
//        for(int i = 0; i < LAirline.size(); i++){
//            int stt = 0;
//            System.out.println(stt++ + ". " + LAirline.get(i).getBrand());
//        }
    }

    static void modify_or_access_an_airline_option() {
        System.out.println("============== Hang hang khong ==============");
        System.out.println("1. Tao mot hang hang khong");
        System.out.println("2. Xoa mot hang hang khong");
        System.out.println("3. Truy cap hang hang khong");
        System.out.println("4. Tinh doanh thu hang hang khong");
        System.out.println("5. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void modify_or_access_a_flight() {
        System.out.println("============== Chuyen bay ==============");
        System.out.println("1. Them chuyen bay");
        System.out.println("2. Xoa mot chuyen bay");
        System.out.println("3. Truy cap mot chuyen bay");
        System.out.println("4. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void add_edit_remove_a_passenger() {
        System.out.println("============== Hanh khach ==============");
        System.out.println("1. Them hanh khach ");
        System.out.println("2. Xoa mot hanh khach");
        System.out.println("3. chon loc hanh khach cua 1 chuyen bay:");
        System.out.println("4. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    public static void main(String[] args) {

        //global variables:
        ArrayList<Passenger> LPassengers = new ArrayList<>();
        ArrayList<FlightTicket> LTicket = new ArrayList<>();
        ArrayList<Flight> LFlight = new ArrayList<>();
        ArrayList<Airline> LAirline = new ArrayList<>();

        int option, opt_for_airline;

        do {
            navigator(); // menu điều hướng
            option = sc.nextInt();

            switch (option) {
                case 1: // case cho khách hàng

                    airline_menu();
                    int opt_for_airline_menu = sc.nextInt();
                    switch (opt_for_airline_menu) {
                        case 1: {

                        }
                    }

                    break; // break case 1 - case cho khách hàng

                case 2: // case cho quản lý
                    do {

                        modify_or_access_an_airline_option();
                        opt_for_airline = sc.nextInt();

                        switch (opt_for_airline) {
                            case 1: // tạo một hãng hàng không 

                                // chèn code vào đây 
                                break;
                            case 2: // xóa một hãng hàng không 
                                //exception mã hãng hàng không sai thì sao?

                                // chèn code vào đây 
                                break;
                            case 3: // truy cập một hãng hàng không

                                modify_or_access_a_flight();      // menu chỉnh sửa hoặc truy cập
                                int opt_for_flight = sc.nextInt();//1 hãng hàng không 

                                do {

                                    switch (opt_for_flight) {
                                        case 1: // thêm chuyến bay - cho quản lý điền thêm
                                            // bao nhiêu chuyến bay nhé, không phải chỉ thêm 1 đâu
                                            // exception <= 0

                                            // chèn code vào đây 
                                            break;
                                        case 2: // xóa một chuyến bay
                                            //exception mã chuyến bay sai thì sao?

                                            // chèn code vào đây
                                            break;
                                        case 3: // truy cập một chuyến bay có sẵn
                                            add_edit_remove_a_passenger(); // menu thêm sửa xóa
                                            int opt_for_passenger; // một hành khách
                                            do {
                                                add_edit_remove_a_passenger(); // menu thêm sửa xóa
                                                 opt_for_passenger = sc.nextInt();
                                                switch (opt_for_passenger) {
                                                    case 1: {
                                                        System.out.print("Ban muon them bao nhieu hanh khach:");
                                                        int passenger1 = sc.nextInt();
                                                        for (int i = 1; i <= passenger1; i++) {
                                                            System.out.print("Nhap ten khach hang thu " + i + ": ");
                                                            sc.nextLine();
                                                            String hoTen = sc.nextLine();
                                                            System.out.print("Nhap ID: ");
                                                            String ID = sc.nextLine();
                                                            UUID maVe = UUID.randomUUID();
                                                            String maVeString = maVe.toString().toUpperCase();
                                                            String maVeEdit = maVeString.replace("-", "").substring(0, 8);
                                                            System.out.println("Ma ve cua ban la: " + maVeEdit);
                                                            LPassengers.add(new Passenger(ID, hoTen, maVeEdit));
                                                        }
                                                        break;
                                                    }

                                                    case 2: // xóa 1 hành khách
                                                        // exception sai CCCD
                                                        System.out.print("Nhap ID hanh khach muon xoa: ");
                                                        sc.nextLine();
                                                        String IDxoa = sc.nextLine();
                                                        for (int i = 0; i < LPassengers.size(); i++) {
                                                            if (LPassengers.get(i).getID().equals(IDxoa)) {
                                                                LPassengers.remove(i);
                                                            }
                                                        }
                                                        System.out.println("Da xoa ID : " + IDxoa);
                                                        break;
                                                    case 3:// chọn lọc hành khách của 1 chuyến bay
                                                        //exception sai ten chuyen bay
                                                        System.out.print("Nhap so hieu chuyen bay: ");
                                                        sc.nextLine();
                                                        String soHieu = sc.nextLine();
                                                        for (int i = 0; i < LFlight.size(); i++) {
                                                            if (LFlight.get(i).getFlightCode().equals(soHieu)) {
                                                                for (int j = 0; j < LPassengers.size(); j++) {
                                                                    if (LPassengers.get(j).getTicketCode().equals(LTicket.get(i).getTicketCode())) {
                                                                        LPassengers.get(i).toString();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    case 4: // thoát chương trình
                                                        break;
                                                    default:
                                                        break;

                                                }
                                            } while (opt_for_passenger != 4); // loop cho mục khách
                                            break;                           // tier 4

                                        case 4: // tính doanh thu của 1 hãng hàng không 

                                            break;
                                        case 5: // thoát chương trình
                                            break;
                                        default:
                                            break;
                                    }
                                } while (opt_for_flight != 3); // loop cho mục chuyến bay - tier 3

                                // chèn code vào đây 
                                break;
                            case 4: // thoát 
                                break;
                            default:
                                break;
                        }
                    } while (opt_for_airline != 4); // loop cho mục hãng hàng không - tier 2

                    break; // break case 2 - case cho quản lý

                case 3:
                    break; // break case 3 - thoát chương trình

                default:
                    break;

            }
        } while (option != 3); // loop tổng của CẢ CHƯƠNG TRÌNH - tier 1
    }
}
