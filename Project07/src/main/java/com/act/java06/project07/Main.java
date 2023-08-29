package com.act.java06.project07;

import static com.fasterxml.uuid.impl.UUIDUtil.uuid;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.time.LocalDateTime;
import java.util.*;

import JSON.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yatth
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    private static final String current = System.getProperty("user.dir");
    private static final String separator = File.separator;
    static String Json_file_path = current + separator + "data" + separator + "List_of_Airlines_Json.json";

    static void navigator() {
        System.out.println("======= Dieu huong =======");
        System.out.println("1. Khach hang\n2. Quan ly\n3. Thoat chuong trinh");
        System.out.print("Ban la: ");
    }

    static <E> void airline_menu() throws IOException {
        System.out.println("====== Hang hang khong ======");
        //Hàm duyệt hiển thị các hãng hàng không
        read_airlines_file(Json_file_path);
    }

    static void modify_or_access_an_airline_option() {
        System.out.println("============== Hang hang khong ==============");
        System.out.println("1. Tao mot hang hang khong"); //Done
        System.out.println("2. Xoa mot hang hang khong"); //Done
        System.out.println("3. Truy cap hang hang khong");
        System.out.println("4. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void modify_or_access_a_flight() {
        System.out.println("============== Chuyen bay ==============");
        System.out.println("1. Them chuyen bay");
        System.out.println("2. Xoa mot chuyen bay");
        System.out.println("3. Truy cap mot chuyen bay");
        System.out.println("4. Sua thong tin mot chuyen bay");
        System.out.println("5. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void add_edit_remove_a_passenger() {
        System.out.println("============== Hanh khach va Ve ==============");
        System.out.println("1. Them hanh khach ");
        System.out.println("2. Xoa mot hanh khach");
        System.out.println("3. chon loc hanh khach cua 1 chuyen bay:");
        System.out.println("4. Sua ve");
        System.out.println("5. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static <E> void show(List<E> list) {
        System.out.println("=========================");
        for (Object item : list) {
            System.out.println(item.toString());
        }
    }

    static void read_airlines_file(String file_path) throws IOException {

        try (FileReader fr = new FileReader(file_path)) {
            Gson gson = new Gson();

            Type type = new TypeToken<List<JSON.Airline>>() {
            }.getType();

            List<JSON.Airline> airlines = gson.fromJson(fr, type);
            int stt = 1;
            for (JSON.Airline airline : airlines) {
                System.out.println(stt + ". " + airline.getBrandname());
                stt++;
            }
        }
        System.out.println("============ Het ============");

    }

    static void write_airlines_file(String file_path, List<Airline> list) throws IOException {

        try (FileWriter fw = new FileWriter(file_path)) {
            Gson gson = new Gson();
            String data = gson.toJson(list);
            fw.write(data);
        }
        System.out.println("============ Het ============");

    }

    static void openLocalDateTimeForReadingJsonFilePurpose() {
        // Create a GsonBuilder and register the custom TypeAdapter
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter());

        // Create a Gson instance from the GsonBuilder
        Gson gson = gsonBuilder.create();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //global variables:
        ArrayList<Passenger> LPassengers = new ArrayList<>();
        ArrayList<FlightTicket> LTicket = new ArrayList<>();
        ArrayList<Flight> LFlight = new ArrayList<>();
        ArrayList<Airline> LAirline = new ArrayList<>();

        int option, opt_for_airline;

        //regulate some rules:
        openLocalDateTimeForReadingJsonFilePurpose();

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
                                System.out.print("Nhập tên hãng hàng không: ");
                                sc.nextLine();
                                String brandname = sc.nextLine();

                                System.out.print("Nhập mã hãng hàng không: ");
                                String code = sc.nextLine();

                                System.out.print("Nhập số máy bay hãng sở hữu: ");
                                int numOfPlanes = sc.nextInt();

                                LAirline.add(new Airline(brandname, code, numOfPlanes));
                                break;
                            case 2: // xóa một hãng hàng không 
                                //exception mã hãng hàng không sai thì sao?

                                System.out.print("Nhập mã hãng hàng không cần xóa: ");
                                sc.nextLine();
                                code = sc.nextLine();

                                int check = 0;

                                for (int i = 0; i < LAirline.size(); i++) {
                                    if (LAirline.get(i).getCode().equals(code)) {
                                        LAirline.remove(i);
                                        check = 1;
                                        break;
                                    }
                                }
                                if (check == 0) {
                                    System.out.println("Không tìm thấy mã hãng hàng không cần xóa");
                                }
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
                                            int n;
                                            try {
                                                do {
                                                    System.out.println("Nhap so luong chuyen bay muon them: ");
                                                    n = sc.nextInt();
                                                    sc.nextLine();
                                                    String pattern = "yyyy-MM-dd HH:mm:ss";
                                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
                                                    if (n > 0) {
                                                        for (int i = 0; i < n; i++) {
                                                            System.out.println(" -Nhap so hieu chuyen bay: ");
                                                            String soHieuCb = sc.nextLine();

                                                            System.out.println(" -Nhap so hieu may bay: ");
                                                            String soHieuMb = sc.nextLine();

                                                            System.out.println(" -Nhap diem xuat phat: ");
                                                            String diemXp = sc.nextLine();

                                                            System.out.println(" -Nhap diem den: ");
                                                            String diemDen = sc.nextLine();

                                                            System.out.println(" -Nhap thoi gian di (Theo dinh dang yyyy-MM-dd HH:mm:ss): ");
                                                            String tgDi = sc.nextLine();

                                                            System.out.println(" -Nhap thoi gian den (Theo dinh dang yyyy-MM-dd HH:mm:ss): ");
                                                            String tgDen = sc.nextLine();

                                                            System.out.println(" -Nhap so luong cho ngoi hang thuong gia: ");
                                                            int soluongTg = sc.nextInt();

                                                            System.out.println(" -Nhap so luong cho ngoi hang pho thuong: ");
                                                            int soluongPt = sc.nextInt();

                                                            System.out.println(" -Nhap gia ve hang thuong gia");
                                                            double giaVeTg = sc.nextDouble();

                                                            System.out.println(" -Nhap gia ve hang pho thong");
                                                            double giaVePt = sc.nextDouble();

                                                            LFlight.add(new Flight(soHieuCb, soHieuMb, LocalDateTime.parse(tgDi, formatter), LocalDateTime.parse(tgDen, formatter), diemXp, diemDen, giaVeTg, giaVePt, soluongTg, soluongPt));
                                                        }
                                                    } else {
                                                        System.out.println("Loi nhap so luong!!!!!!");
                                                        System.out.println("So can nhap la so nguyen duong!!!!");
                                                    }
                                                } while (n < 0);
                                            } catch (Exception ex) {
                                                System.out.println("Da xay ra loi khi nhap 1 chuyen bay" + ex);
                                            }

                                            break;
                                        case 2: // xóa một chuyến bay
                                            //exception mã chuyến bay sai thì sao?

                                            // chèn code vào đây
                                            System.out.println("Nhap so hieu chuyen bay can xoa: ");
                                            int pointRemote = -1;
                                            sc.nextLine();
                                            try {
                                                String ctFlightCode = sc.nextLine();
                                                for (int i = 0; i < LFlight.size(); i++) {
                                                    if (LFlight.get(i).getFlightCode().equals(ctFlightCode)) {
                                                        pointRemote = i;
                                                        for (int j = 0; j < LTicket.size(); j++) {
                                                            if (LTicket.get(j).getFlightNumber().equals(ctFlightCode)) {
                                                                for (int k = 0; k < LPassengers.size(); k++) {
                                                                    if (LPassengers.get(k).getTicketCode().equals(LTicket.get(j).getTicketCode())) {
                                                                        LPassengers.remove(k);
                                                                    }
                                                                }
                                                                LTicket.remove(j);
                                                            }
                                                        }
                                                        LFlight.remove(pointRemote);
                                                        break;
                                                    }
                                                }
                                                if (pointRemote == -1) {
                                                    System.out.println("Khong ton tai ma chuyen bay nay!!!");
                                                }

                                            } catch (ExceptionInInitializerError ex) {
                                                System.out.println("Da xay ra loi khi nhap ma chuyen bay" + ex);
                                            }

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
                                                                for (int j = 0; j < LTicket.size(); j++) {
                                                                    if (LTicket.get(j).getTicketCode().equals(LPassengers.get(i).getTicketCode())) {
                                                                        LTicket.remove(j);
                                                                    }
                                                                }
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

                                                    case 4:
                                                        System.out.printf("Nhap ma ve can sua: ");
                                                        String maVe = sc.nextLine();
                                                        for (int i = 0; i < LTicket.size(); i++) {
                                                            if (LTicket.get(i).getTicketCode().equals(maVe)) {
                                                                for (int j = 0; j < LFlight.size(); j++) {
                                                                    if (LFlight.get(j).getFlightCode().equals(LTicket.get(i).getFlightNumber())) {
                                                                        System.out.printf("Chon hang ve: ");
                                                                        System.out.printf("1.Thuong gia");
                                                                        System.out.printf("2.Pho Thong");
                                                                        int luaChon = sc.nextInt();
                                                                        switch (luaChon) {
                                                                            case 1: {
                                                                                LTicket.get(i).setFare(LFlight.get(j).getBusinessFare());
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                LTicket.get(i).setFare(LFlight.get(j).getEconomyFare());
                                                                                break;
                                                                            }
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    case 5:
                                                        // thoát chương trình                                                     
                                                        break;
                                                    default:
                                                        break;

                                                }
                                            } while (opt_for_passenger != 4); // loop cho mục khách
                                            break;                           // tier 4
                                        case 4: // sua thong tin 1 chuyen bay
                                            int pointEdit = -1;
                                            System.out.println("Nhap so hieu chuyen bay can sua: ");
                                            String ctFlightCode = sc.nextLine();
                                            try {
                                                for (int i = 0; i < LFlight.size(); i++) {
                                                    if (LFlight.get(i).getFlightCode().equals(ctFlightCode)) {
                                                        pointEdit = i;
                                                        System.out.println(" -Nhap diem xuat phat: ");
                                                        String diemXp = sc.nextLine();
                                                        LFlight.get(pointEdit).setDeparture(diemXp);
                                                        System.out.println(" -Nhap diem den: ");
                                                        String diemDen = sc.nextLine();
                                                        LFlight.get(pointEdit).setDestination(diemDen);
                                                        System.out.println(" -Nhap thoi gian di (Theo dinh dang yyyy-MM-dd HH:mm:ss): ");
                                                        String tgDi = sc.nextLine();
                                                        LFlight.get(pointEdit).setDepartureTime(LocalDateTime.parse(tgDi));
                                                        System.out.println(" -Nhap thoi gian den (Theo dinh dang yyyy-MM-dd HH:mm:ss): ");
                                                        String tgDen = sc.nextLine();
                                                        LFlight.get(pointEdit).setArrivalTime(LocalDateTime.parse(tgDen));
                                                        System.out.println(" -Nhap so luong cho ngoi hang thuong gia: ");
                                                        int soluongTg = sc.nextInt();
                                                        LFlight.get(pointEdit).setUsedBusinessSeats(soluongTg);
                                                        System.out.println(" -Nhap so luong cho ngoi hang pho thuong: ");
                                                        int soluongPt = sc.nextInt();
                                                        LFlight.get(pointEdit).setUsedEconomySeats(soluongPt);
                                                        System.out.println(" -Nhap gia ve hang thuong gia");
                                                        double giaVeTg = sc.nextDouble();
                                                        LFlight.get(pointEdit).setBusinessFare(giaVeTg);
                                                        System.out.println(" -Nhap gia ve hang pho thong");
                                                        double giaVePt = sc.nextDouble();
                                                        LFlight.get(pointEdit).setEconomyFare(giaVePt);
                                                        System.out.println("Thong bao thay doi den hanh khach co so hieu chuyen bay: " + ctFlightCode);
                                                        break;
                                                    }
                                                }
                                                if (pointEdit == -1) {
                                                    System.out.println("Khong ton tai ma chuyen bay nay!!!");
                                                }
                                            } catch (Exception ex) {
                                                System.out.println("Da xay ra loi khia nhap ma chuyen bay!!!");
                                            }

                                            System.out.println("Nhập mã hãng hàng không cần tính doanh thu: ");
                                            code = sc.nextLine();
                                            check = 0;

                                            for (int i = 0; i < LAirline.size(); i++) {
                                                if (LAirline.get(i).getCode().equals(code)) {
                                                    check = 1;
                                                    int month = 0, year = 0;

                                                    System.out.println("Tính doanh thu theo");
                                                    System.out.println("1. Tháng");
                                                    System.out.println("2. Năm");
                                                    System.out.println("Lựa chọn của bạn là: ");
                                                    int x = sc.nextInt();
                                                    if (x == 1) {
                                                        System.out.println("Tháng bạn cần tính doanh thu: ");
                                                        month = sc.nextInt();
                                                        System.out.println("Năm bạn cần tính doanh thu: ");
                                                        year = sc.nextInt();
                                                    } else {
                                                        System.out.println("Năm bạn cần tính doanh thu: ");
                                                        year = sc.nextInt();
                                                    }

                                                    LAirline.get(i).statisticize_turnOver(LAirline.get(i).getListOfFlights(), x, month, year);
                                                    break;
                                                }
                                            }
                                            if (check == 0) {
                                                System.out.println("Không tìm thấy mã hãng hàng không cần tính");
                                            }
                                            break;
                                        /*case 4: // tính doanh thu của 1 hãng hàng không 

                                            break;*/
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
