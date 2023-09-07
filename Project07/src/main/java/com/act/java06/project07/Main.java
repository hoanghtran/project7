package com.act.java06.project07;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

import JSON.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yatth
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    private static final String current = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String Json_file_path = current + separator + "data" + separator + "List_of_Airlines.json";
    private static final String Json_airport_file_path = current + separator + "data" + separator + "List_of_Airports.json";

    static void navigator() {
        System.out.println("======= Dieu huong =======");
        System.out.println("1. Khach hang\n2. Quan ly\n3. Thoat chuong trinh");
        System.out.print("Ban la: ");
    }

    static void airline_menu() throws IOException {
        System.out.println("====== Hang hang khong ======");
        //Hàm duyệt hiển thị các hãng hàng không
        List<JSON.Airline> list = read_json_file(Json_file_path);
        int stt = 1;
        for (JSON.Airline airline : list) {
            System.out.println(stt + ". " + airline.getBrandname());
            stt++;
        }
        System.out.print("Truy cap hang hang khong: ");
    }

    static void airport_menu(String Json_airport_file_path) throws IOException {
        List<JSON.Airport> LAirport = new ArrayList<>();
        LAirport = read_json_file_Airport(Json_airport_file_path);

        int stt = 1;
        System.out.println("========================== Danh sach san bay ==========================");
        for (JSON.Airport item : LAirport) {
            System.out.print(stt + ". ");
            stt--;
            System.out.println("San bay: " + item.getName() + "; Thanh pho: " + item.getCity()); // sửa lại cái này nhé Huy(sửa xong)
            stt += 2;
        }
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
        System.out.println("5. Loc thong tin cac chuyen bay(theo dia diem di/den, thoi gian di/den)");
        System.out.println("6. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void add_edit_remove_a_passenger() {
        System.out.println("============== Hanh khach va Ve ==============");
        System.out.println("1. Them hanh khach ");
        System.out.println("2. Xoa mot hanh khach");
        System.out.println("3. Chon loc hanh khach cua 1 chuyen bay:");
        System.out.println("4. Sua ve");
        System.out.println("5. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static List read_json_file(String file_path) throws IOException {

        try (FileReader fr = new FileReader(file_path)) {
            Gson gson = new Gson();

            Type type = new TypeToken<List<JSON.Airline>>() {
            }.getType();

            List<JSON.Airline> airlines = gson.fromJson(fr, type);

            return airlines;
        }
    }

    static List read_json_file_Airport(String file_path) throws IOException {

        try (FileReader fr = new FileReader(file_path)) {
            Gson gson = new Gson();

            Type type = new TypeToken<List<JSON.Airport>>() {
            }.getType();

            List<JSON.Airport> LAirport = gson.fromJson(fr, type);

            return LAirport;
        }
    }

    static void write_airlines_file(String file_path, List<JSON.Airline> list) throws IOException {

        try (FileWriter fw = new FileWriter(file_path)) {
            Gson gson = new Gson();
            String data = gson.toJson(list);
            fw.write(data);
        }
    }

    public static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }

            if (j == len2) {
                return true;
            }
        }

        return false;
    }

    static void newEmptySeats(List<JSON.Seat> listOfSeats) {

        for (int i = 1; i <= 20; i++) {
            String str = "";
            if (i <= 10) {
                if (i < 10) {
                    str = "A" + "0" + i;
                } else {
                    str = "A" + i;
                }
            } else if (i <= 20) {
                if (i % 10 < 10) {
                    str = "B" + "0" + i % 10;
                } else {
                    str = "B" + i;
                }
            }
            listOfSeats.get(i).setSeatCode(str);
            listOfSeats.get(i).setStatus(0);
        }
    }

    static void setValueForSeat(List<JSON.Seat> listOfSeats, String seatCode) {
        for (int i = 0; i < listOfSeats.size(); i++) {
            if (listOfSeats.get(i).getSeatCode().equals(seatCode)) {
                listOfSeats.get(i).setStatus(1);
            }
        }

    }

    static void printAvailableSeats(List<JSON.Seat> listOfSeats) {
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                System.out.println("");
            }
            if (listOfSeats.get(i).getStatus() == 0) {
                System.out.print(listOfSeats.get(i).getSeatCode() + "\t");
            } else {
                System.out.print("(X)\t");
            }

        }
        System.out.println("\nHang pho thong tu A01->A10");
        System.out.println("Hang thuong gia tu B01->B10");

    }

    static int getIndexOfAirline(String code) throws IOException {// error
        List<JSON.Airline> database = new ArrayList<>();
        database = read_json_file(Json_file_path);
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    static String generateTicketCode(String code, String MCB, String Seatcode) throws IOException {

        String rs = code + "-";
        rs += Seatcode + "-" + MCB;
        return rs;
    }

    static LocalDate chuyenDateJsonThanhLocalDate(int y, int m, int d) {
        return LocalDate.of(y, m, d);
    }

    static void themHanhKhachvaVe(List<JSON.Airline> database, String file_path, String maChuyenBay) throws IOException {

        for (int a = 0; a < database.size(); a++) {
            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                if (database.get(a).getFlights().get(b).getFlightCode().equals(maChuyenBay)) {
                    System.out.print("Nhap so luong hanh khach:");
                    int passenger_one = sc.nextInt(); // try catch
                    for (int i = 1; i <= passenger_one; i++) {
                        System.out.print("Nhap ten khach hang thu " + i + ": ");
                        sc.nextLine();
                        String ho_Ten = sc.nextLine();
                        System.out.print("Nhap ID: ");
                        String ID_Passenger = sc.nextLine();

                        //check hàm
                        printAvailableSeats(database.get(a).getFlights().get(b).getSeats());
                        System.out.print("Chon cho ngoi: ");
                        String choNgoi = sc.nextLine();

                        for (int j = 0; j < database.get(a).getFlights().get(b).getSeats().size(); j++) {
                            if (database.get(a).getFlights().get(b).getSeats().get(j).getStatus() == 1) {
                                if (choNgoi.equals(database.get(a).getFlights().get(b).getSeats().get(j).getSeatCode())) {
                                    System.out.println("Cho ngoi da duoc dat. Vui long chon cho ngoi khac !!!");
                                } else {
                                    database.get(a).getFlights().get(b).getPassengers().add(new JSON.Passenger(ID_Passenger, ho_Ten, generateTicketCode(database.get(a).getCode(), maChuyenBay, choNgoi)));
                                    setValueForSeat(database.get(a).getFlights().get(b).getSeats(), choNgoi);
                                    System.out.println("Da dat cho: " + choNgoi);
                                    if (choNgoi.charAt(0) == 'A') {
                                        database.get(a).getFlights().get(b).setUsedEconomySeats(database.get(a).getFlights().get(b).getUsedEconomySeats() + 1);
                                    } else if (choNgoi.charAt(0) == 'B') {
                                        database.get(a).getFlights().get(b).setUsedBusinessSeats(database.get(a).getFlights().get(b).getUsedBusinessSeats() + 1);
                                    }
                                    break;
                                }

                            }

                            // usedSeat +1, usedEconomy/business +1 , ....
                        }
                    }
                }
            }

        }
        write_airlines_file(file_path, database);
    }

    static int getIntInput(Scanner sc) {
        int num = -1;
        boolean valid = false;

        do {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                valid = true;
            } else {
                sc.nextLine();
                System.out.println("Cần nhập số, vui lòng nhập lại!");
            }
        } while (valid == false);
        return num;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //global variables:
        List<JSON.Airline> database = new ArrayList<>();
        database = read_json_file(Json_file_path);

        List<JSON.Airport> LAirport = new ArrayList<>();
        LAirport = read_json_file_Airport(Json_airport_file_path);

        List<JSON.Flight> listFlight = new ArrayList<>();

        int option = -1, opt_for_airline = -1;

        do {
            navigator(); // menu điều hướng
            do{
            option = getIntInput(sc);
            if (option < 0) {
                            System.out.println("Khong the nhap so am!!!");
                            System.out.print("Ban hay nhap lai: ");
                        }
            } while (option<0);
            switch (option) {
                case 1:

                    // case cho khách hàng
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    int stt = 1;
                    airline_menu(); // in menu các hãng hàng không cho khách chọn
                    int opt_for_airline_menu = -1;
                    Exception ex;
                    do {
                        opt_for_airline_menu = getIntInput(sc);//
                        opt_for_airline_menu--;
                        if (opt_for_airline_menu < 0) {
                            System.out.println("Khong the nhap so am!!!");
                            System.out.print("Ban hay nhap lai: ");
                        }
                    } while (opt_for_airline_menu < 0);

                    LAirport = read_json_file_Airport(Json_airport_file_path);
                    System.out.println("=========Danh sach san bay=========");
                    for (JSON.Airport item : LAirport) {
                        System.out.print(stt + ". ");
                        stt--;
                        System.out.println("Ten san bay: " + item.getName() + "  Thanh pho: " + item.getCity()); // sửa lại cái này nhé Huy(sửa xong)
                    }

                    //Hiện menu cho khách chọn nơi xuất phát, nơi đến, ngày đi và ngày về
                    int departure;
                    int destination;
                    airport_menu(Json_airport_file_path);

                    System.out.println("=======Menu======");
                    System.out.print("Chon diem xuat phat: ");
                    do {

                        departure = getIntInput(sc);
                        if (departure < 0) {
                            System.out.println("Khong the nhap so am!!!");
                            System.out.print("Ban hay nhap lai: ");
                        }
                    } while (departure < 0);
                    departure--;

                    System.out.print("Chon diem den: ");
                    do {

                        destination = getIntInput(sc);
                        if (destination < 0) {
                            System.out.println("Khong the nhap so am!!!");
                            System.out.print("Ban hay nhap lai: ");
                        }
                    } while (destination < 0);
                    destination--;

                    String departureString = LAirport.get(departure).getCity();
                    String destinationString = LAirport.get(destination).getCity();

                    //Hiển thị ds các chuyến bay khả dụng với ngày đi và ngày về đó (Quốc Huy làm)
                    int lua_Chon;
                    System.out.println("========MENU========");
                    System.out.println("1. Khu hoi");
                    System.out.println("2. Mot chieu");
                    System.out.print("Nhap lua chon cua ban: ");
                    do {

                        lua_Chon = getIntInput(sc);
                        if (lua_Chon < 0) {
                            System.out.println("Khong the nhap so am!!!");
                            System.out.print("Ban hay nhap lai: ");
                        }
                    } while (lua_Chon < 0);
                    sc.nextLine();
                    switch (lua_Chon) {
                        case 1:
                            LocalDate dateD1 = LocalDate.now();
                            LocalDate dateD2 = LocalDate.now();
                            LocalDate dateA1 = LocalDate.now();
                            LocalDate dateA2 = LocalDate.now();
                            do {
                                try {
                                    ex = null;
                                    System.out.println("Nhap khoang thoi gian khoi hanh (Theo dinh dang dd/MM/yyyy)");
                                    System.out.print("Nhap moc thoi gian co the bat dau khoi hanh: ");
                                    String ngayD1 = sc.nextLine();
                                    dateD1 = LocalDate.parse(ngayD1, format);
                                    System.out.print("Nhap moc thoi gian cuoi cung de khoi hanh: ");
                                    String ngayD2 = sc.nextLine();
                                    dateD2 = LocalDate.parse(ngayD2, format);
                                    System.out.println("Nhap khoang thoi gian tro ve (Theo dinh dang dd/MM/yyyy)");
                                    System.out.print("Nhap moc thoi gian co the bat dau tro ve: ");
                                    String ngayA1 = sc.nextLine();
                                    dateA1 = LocalDate.parse(ngayA1, format);
                                    System.out.print("Nhap moc thoi gian cuoi cung de tro ve: ");
                                    String ngayA2 = sc.nextLine();
                                    dateA2 = LocalDate.parse(ngayA2, format);
                                } catch (Exception ex_1) {
                                    System.out.println("Co loi xay ra: " + ex_1);
                                    ex = ex_1;
                                }
                            } while (ex != null);
                            System.out.println("Danh sach cac chuyen bay di: ");
                            for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                if (database.get(opt_for_airline_menu).getFlights().get(i).getDeparture().equals(departureString)
                                        && database.get(opt_for_airline_menu).getFlights().get(i).getDestination().equals(destinationString)
                                        && (chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getDay()).isAfter(dateD1)
                                        || chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getDay()).equals(dateD1))
                                        && (chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getDay()).isBefore(dateD2)
                                        || chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().getDay()).equals(dateD2))) {
                                    listFlight.add(database.get(opt_for_airline_menu).getFlights().get(i));

                                }
                            }
                            if (listFlight.isEmpty()) {
                                System.out.println("Khong co chuyen bay nao kha dung!!!");
                                break;
                            }
                            Collections.sort(listFlight, new DateComparator());
                            int STT = 1;
                            for (int i = 0; i < listFlight.size(); i++) {
                                System.out.println(STT + ":" + "Ma chuyen bay: " + listFlight.get(i).getFlightCode() + "  Thoi gian di: " + listFlight.get(i).getDepartureTime() + "  Thoi gian toi: " + listFlight.get(i).getArrivalTime());// hien thi ma chuyen bay
                                STT++;
                            }
                            int opt_for_listFlight;
                            do {

                                opt_for_listFlight = getIntInput(sc);
                                if (opt_for_listFlight < 0) {
                                    System.out.println("Khong the nhap so am!!!");
                                    System.out.print("Ban hay nhap lai: ");
                                }
                            } while (opt_for_listFlight < 0);
                            opt_for_listFlight--;

                            String maChuyenBay = listFlight.get(opt_for_listFlight).getFlightCode();
                            themHanhKhachvaVe(database, Json_file_path, maChuyenBay);
                            System.out.println("Danh sach cac chuyen bay tro ve: ");
                            for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                if (database.get(opt_for_airline_menu).getFlights().get(i).getDeparture().equals(destinationString)
                                        && database.get(opt_for_airline_menu).getFlights().get(i).getDestination().equals(departureString)
                                        && (chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getDay()).isAfter(dateA1)
                                        || chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getDay()).equals(dateA1))
                                        && (chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getDay()).isBefore(dateA2)
                                        || chuyenDateJsonThanhLocalDate(database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getYear(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getMonth(),
                                                database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().getDay()).equals(dateA2))) {
                                    listFlight.add(database.get(opt_for_airline_menu).getFlights().get(i));

                                }
                            }
                            if (listFlight.size() == 0) {
                                System.out.println("Khong co chuyen bay nao kha dung!!!");
                                break;
                            }
                            Collections.sort(listFlight, new DateComparator());
                            STT = 1;
                            for (int i = 0; i < listFlight.size(); i++) {
                                System.out.println(STT + ":" + "Ma chuyen bay: " + listFlight.get(i).getFlightCode() + "  Thoi gian di: " + listFlight.get(i).getDepartureTime() + "  Thoi gian toi: " + listFlight.get(i).getArrivalTime());// hien thi ma chuyen bay
                                STT++;
                            }
                            do {

                                opt_for_listFlight = getIntInput(sc);
                                if (opt_for_listFlight < 0) {
                                    System.out.println("Khong the nhap so am!!!");
                                    System.out.print("Ban hay nhap lai: ");
                                }
                            } while (opt_for_airline < 0);
                            opt_for_listFlight--;

                            maChuyenBay = listFlight.get(opt_for_listFlight).getFlightCode();
                            themHanhKhachvaVe(database, Json_file_path, maChuyenBay);
                            listFlight.clear();
                            break;
                        case 2:
                            for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                if (database.get(opt_for_airline_menu).getFlights().get(i).getDeparture().equals(departureString)
                                        && database.get(opt_for_airline_menu).getFlights().get(i).getDestination().equals(destinationString)) {
                                    listFlight.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                }
                            }
                            if (listFlight.size() == 0) {
                                System.out.println("Khong co chuyen bay nao kha dung!!!");
                                break;
                            }
                            Collections.sort(listFlight, new DateComparator());
                            STT = 1;
                            for (int i = 0; i < listFlight.size(); i++) {
                                System.out.println(STT + ":" + "Ma chuyen bay: " + listFlight.get(i).getFlightCode() + "  Thoi gian di: " + listFlight.get(i).getDepartureTime() + "  Thoi gian toi: " + listFlight.get(i).getArrivalTime()+
                                           "  So ve con lai cua hang thuong gia: " + (listFlight.get(i).getTotalBusinessSeats()-listFlight.get(i).getUsedBusinessSeats())+
                                         "  So ve con lai cua hang pho thong: " + (listFlight.get(i).getTotalEconomySeats()-listFlight.get(i).getUsedEconomySeats()));// hien thi ma chuyen bay
                                STT++;
                            }
                            do {

                                opt_for_listFlight = getIntInput(sc);
                                if (opt_for_listFlight < 0) {
                                    System.out.println("Khong the nhap so am!!!");
                                    System.out.print("Ban hay nhap lai: ");
                                }
                            } while (opt_for_listFlight < 0);
                            opt_for_listFlight--;

                            maChuyenBay = listFlight.get(opt_for_listFlight).getFlightCode();
                            themHanhKhachvaVe(database, Json_file_path, maChuyenBay);
                            listFlight.clear();
                            break;
                    }

                    break;
                //Cùng lúc đấy tạo (mã) vé + hành khách vào chuyến bay (Đức Duy + Q.Huy làm)(đã xong)
                //Chuyển value của seat được đặt từ - : 1, usedSeat +1, availableSeat -1 (Duy Huy làm)
                // break case 1 - case cho khách hàng

                case 2: {
                    // case cho quản lý
                    do {
                        modify_or_access_an_airline_option();
                        do {

                            opt_for_airline = getIntInput(sc);
                            if (opt_for_airline < 0) {
                                System.out.println("Khong the nhap so am!!!");
                                System.out.print("Ban hay nhap lai: ");
                            }
                        } while (opt_for_airline < 0);
                        switch (opt_for_airline) {
                            case 1: // tạo một hãng hàng không 
                                System.out.print("Nhap ten hang hang khong: ");
                                sc.nextLine();
                                String brandname = sc.nextLine();

                                System.out.print("Nhap ma hang hang khong: ");
                                String code = sc.nextLine();

                                System.out.print("Nhập so may bay hang so huu: ");

                                int numOfPlanes;
                                do {
                                    numOfPlanes = getIntInput(sc);
                                    if (numOfPlanes < 0) {
                                        System.out.println("Khong the nhap so am!!!");
                                        System.out.print("Ban hay nhap lai: ");
                                    }
                                } while (numOfPlanes < 0);

                                List<JSON.Plane> listOfPlanes = new ArrayList<>();
                                JSON.Plane plane = new JSON.Plane();
                                for (int n = 0; n < numOfPlanes; n++) {
                                    sc.nextLine();
                                    System.out.print("Nhap ma may bay: ");
                                    String PlaneCode = sc.nextLine();
                                    plane.setPlaneCode(PlaneCode);
                                }

                                database.add(new JSON.Airline(brandname, code, numOfPlanes, listOfPlanes, numOfPlanes));
                                write_airlines_file(Json_file_path, database);
                                break;
                            case 2: // xóa một hãng hàng không 
                                //exception mã hãng hàng không sai thì sao?

                                System.out.print("Nhap ma hang hang khong can xoa: ");
                                sc.nextLine();
                                code = sc.nextLine();

                                int check = 0;

                                for (int i = 0; i < database.size(); i++) {
                                    if (database.get(i).getCode().equals(code)) {
                                        database.remove(i);
                                        check = 1;
                                        break;
                                    }
                                }
                                if (check == 0) {
                                    System.out.println("Khong tim thay ma hang hang khong can xoa");
                                }
                                write_airlines_file(Json_file_path, database);

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
                                            airline_menu();
                                            System.out.print("Nhap lua chon cua ban: ");
                                            int p;
                                            do {
                                                p = getIntInput(sc);
                                                if (p < 0) {
                                                    System.out.println("Khong the nhap so am!!!");
                                                    System.out.print("Ban hay nhap lai: ");
                                                }
                                            } while (p < 0);
                                            int n;

                                            System.out.print("Nhap so luong chuyen bay muon them: ");
                                            do {
                                                n = getIntInput(sc);
                                                if (n < 0) {
                                                    System.out.println("Khong the nhap so am!!!");
                                                    System.out.print("Ban hay nhap lai: ");
                                                }
                                            } while (n < 0);
                                            sc.nextLine();

                                            System.out.print("Nhap so hieu chuyen bay: ");
                                            String soHieuCb = sc.nextLine();
                                            System.out.print("Nhap so hieu may bay: ");
                                            String soHieuMb = sc.nextLine();

                                            System.out.print("Nhap diem xuat phat: ");
                                            String diemXp = sc.nextLine();

                                            System.out.print("Nhap diem den: ");
                                            String diemDen = sc.nextLine();

                                            System.out.println("Nhap thoi gian di ");
                                            System.out.print("Nhap nam, thang, ngay: ");

                                            int year = sc.nextInt();
                                            int month = sc.nextInt();
                                            int day = sc.nextInt();
                                            JSON.Date dateDep = new JSON.Date(year, month, day);
                                            System.out.print("Nhap gio, phut: ");
                                            int hour = sc.nextInt();
                                            int minute = sc.nextInt();
                                            int second = 0;
                                            int nano = 0;
                                            JSON.Time timeDep = new Time(hour, minute, second, nano);
                                            JSON.DepartureTime tgDi = new JSON.DepartureTime(dateDep, timeDep);
                                            System.out.println("Nhap thoi gian den ");
                                            System.out.print("Nhap nam, thang, ngay: ");
                                            year = sc.nextInt();
                                            month = sc.nextInt();
                                            day = sc.nextInt();
                                            JSON.Date__1 dateArr = new JSON.Date__1(year, month, day);
                                            System.out.print("Nhập gio, phut: ");
                                            hour = sc.nextInt();
                                            minute = sc.nextInt();
                                            second = 0;
                                            nano = 0;
                                            JSON.Time__1 timeArr = new Time__1(hour, minute, second, nano);
                                            JSON.ArrivalTime tgDen = new JSON.ArrivalTime(dateArr, timeArr);
                                            System.out.print("Nhap so luong cho ngoi hang thuong gia: ");
                                            int soluongTg = sc.nextInt();
                                            System.out.print("Nhap so luong cho ngoi hang pho thuong: ");
                                            int soluongPt = sc.nextInt();

                                            System.out.print("Nhap gia ve hang thuong gia: ");
                                            int giaVeTg = sc.nextInt();

                                            System.out.println("Nhap gia ve hang pho thong: ");
                                            int giaVePt = sc.nextInt();

                                            database.get(p).getFlights().add(new JSON.Flight(soHieuCb, soHieuMb, tgDi, tgDen, diemXp, diemDen, giaVeTg, giaVePt, soluongTg, soluongPt));
                                            ArrayList<Seat> seats = new ArrayList<>();
                                            newEmptySeats(seats);
                                            database.get(p).getFlights().get(database.get(p).getFlights().size() - 1).setSeats(seats);
                                            // thêm phần viết lại vào file
                                            //write_airlines_file(Json_file_path, database);

                                            break;
                                        case 2: // xóa một chuyến bay
                                            //exception mã chuyến bay sai thì sao?

                                            // chèn code vào đây
                                            airline_menu();
                                            System.out.print("Nhap lua chon cua ban: ");
                                            p = sc.nextInt();

                                            System.out.print("Nhap so hieu chuyen bay can xoa: ");
                                            int pointRemote = -1;
                                            sc.nextLine();
                                            try {
                                                String ctFlightCode = sc.nextLine();
                                                for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                    if (database.get(p).getFlights().get(i).getFlightCode().equals(ctFlightCode)) {
                                                        pointRemote = i;

                                                        database.get(p).getFlights().remove(pointRemote);
                                                        break;
                                                    }
                                                }
                                                if (pointRemote == -1) {
                                                    System.out.println("Khong ton tai ma chuyen bay nay!!!");
                                                }

                                            } catch (ExceptionInInitializerError ex_3) {
                                                System.out.println("Da xay ra loi khi nhap ma chuyen bay" + ex_3);
                                            }

                                            break;
                                        case 3: // truy cập một chuyến bay có sẵn
                                            // menu thêm sửa xóa
                                            int opt_for_passenger; // một hành khách
                                            do {
                                                // menu thêm sửa xóa
                                                add_edit_remove_a_passenger();
                                                opt_for_passenger = sc.nextInt();
                                                switch (opt_for_passenger) {
                                                    case 1: {
                                                        int checkCodeCB = 0;
                                                        System.out.print("Vui long nhap ma chuyen bay: ");
                                                        sc.nextLine();
                                                        String luaChonCB = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {
                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                                                                if (database.get(a).getFlights().get(b).getFlightCode().equals(luaChonCB)) {

                                                                    checkCodeCB = 1;
                                                                    System.out.print("Ban muon them bao nhieu hanh khach: ");
                                                                    int passenger1 = sc.nextInt();
                                                                    for (int i = 1; i <= passenger1; i++) {
                                                                        System.out.print("Nhap ten khach hang thu " + i + ": ");
                                                                        sc.nextLine();
                                                                        String hoTen = sc.nextLine();
                                                                        System.out.print("Nhap ID: ");
                                                                        String ID = sc.nextLine();

                                                                        printAvailableSeats(database.get(a).getFlights().get(b).getSeats());
                                                                        System.out.print("Chon cho ngoi: ");
                                                                        String luaChon = sc.nextLine();

                                                                        for (int j = 0; j < database.get(a).getFlights().get(b).getSeats().size(); j++) {
                                                                            if (database.get(a).getFlights().get(b).getSeats().get(j).getStatus() == 1) {
                                                                                if (luaChon.equals(database.get(a).getFlights().get(b).getSeats().get(j).getSeatCode())) {
                                                                                    System.out.println("Cho ngoi da duoc dat. Vui long chon cho ngoi khac !!!");
                                                                                }
                                                                            } else {
                                                                                database.get(a).getFlights().get(b).getPassengers().add(new JSON.Passenger(ID, hoTen, generateTicketCode(database.get(a).getCode(), luaChonCB, luaChon)));
                                                                                setValueForSeat(database.get(a).getFlights().get(b).getSeats(), luaChon);
                                                                                System.out.println("Da dat cho: " + luaChon);

                                                                                if (luaChon.charAt(0) == 'A') {
                                                                                    database.get(a).getFlights().get(b).setUsedEconomySeats(database.get(a).getFlights().get(b).getUsedEconomySeats() + 1);
                                                                                } else if (luaChon.charAt(0) == 'B') {
                                                                                    database.get(a).getFlights().get(b).setUsedBusinessSeats(database.get(a).getFlights().get(b).getUsedBusinessSeats() + 1);
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        write_airlines_file(Json_file_path, database);
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (checkCodeCB == 0) {
                                                            System.out.println("Khong tim thay ma chuyen bay!!!");
                                                        }

                                                        break;
                                                    }

                                                    case 2: // xóa 1 hành khách
                                                        // exception sai CCCD
                                                        int checkID = 0;
                                                        System.out.print("Nhap ID hanh khach muon xoa: ");
                                                        sc.nextLine();
                                                        String IDxoa = sc.nextLine();
                                                        System.out.print("Nhap ma chuyen bay: ");
                                                        String maCB = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {

                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {

                                                                if (database.get(a).getFlights().get(b).getFlightCode().equals(maCB)) {
                                                                    for (int c = 0; c < database.get(a).getFlights().get(b).getPassengers().size(); c++) {

                                                                        if (database.get(a).getFlights().get(b).getPassengers().get(c).getId().equals(IDxoa)) {
                                                                            checkID = 1;
                                                                            for (int i = 0; i < database.get(a).getFlights().get(b).getSeats().size(); i++) {
                                                                                database.get(a).getFlights().get(b).getSeats().get(i).setStatus(0);
                                                                                if (database.get(a).getFlights().get(b).getSeats().get(i).getSeatCode().charAt(0) == 'A') {
                                                                                    database.get(a).getFlights().get(b).setUsedEconomySeats(database.get(a).getFlights().get(b).getUsedEconomySeats() - 1);
                                                                                } else if (database.get(a).getFlights().get(b).getSeats().get(i).getSeatCode().charAt(0) == 'B') {
                                                                                    database.get(a).getFlights().get(b).setUsedBusinessSeats(database.get(a).getFlights().get(b).getUsedBusinessSeats() - 1);
                                                                                }
                                                                            }
                                                                            database.get(a).getFlights().get(b).getPassengers().remove(c);
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        if (checkID == 1) {
                                                            System.out.println("Da xoa ID : " + IDxoa);
                                                        } else {
                                                            System.out.println("Khong tim thay ID: " + IDxoa);
                                                        }
                                                        break;
                                                    case 3:// chọn lọc hành khách của 1 chuyến bay
                                                        //exception sai ten chuyen bay
                                                        int checkFlCode = 0;
                                                        System.out.print("Nhap so hieu chuyen bay: ");
                                                        sc.nextLine();
                                                        String soHieu = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {
                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                                                                if (database.get(a).getFlights().get(b).getFlightCode().equals(soHieu)) {
                                                                    checkFlCode = 1;
                                                                    for (int c = 0; c < database.get(a).getFlights().get(b).getPassengers().size(); c++) {

                                                                        System.out.println(database.get(a).getFlights().get(b).getPassengers().get(c).toString());

                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (checkFlCode == 0) {
                                                            System.out.println("Khong tim thay so hieu chuyen bay: " + soHieu);
                                                        }
                                                        break;
                                                    case 4: //sua ve (cho ngoi)
                                                    {
                                                        int checkId = 0;
                                                        String cccd = "";
                                                        String hoTen = "";
                                                        System.out.print("Nhap ID hanh khach muon sua: ");
                                                        String IDsua = sc.nextLine();
                                                        sc.next();
                                                        System.out.print("Nhap ma chuyen bay: ");
                                                        String macb = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {

                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {

                                                                if (database.get(a).getFlights().get(b).getFlightCode().equals(macb)) {
                                                                    for (int c = 0; c < database.get(a).getFlights().get(b).getPassengers().size(); c++) {
                                                                        cccd = database.get(a).getFlights().get(b).getPassengers().get(c).getId();
                                                                        hoTen = database.get(a).getFlights().get(b).getPassengers().get(c).getFullName();
                                                                        if (database.get(a).getFlights().get(b).getPassengers().get(c).getId().equals(IDsua)) {
                                                                            checkId = 1;
                                                                            for (int i = 0; i < database.get(a).getFlights().get(b).getSeats().size(); i++) {
                                                                                database.get(a).getFlights().get(b).getSeats().get(i).setStatus(0);

                                                                            }
                                                                            database.get(a).getFlights().get(b).getPassengers().remove(c);
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }

                                                        // cho khach chon lai cho ngoi
                                                        if (checkId == 1) {
                                                            for (int a = 0; a < database.size(); a++) {
                                                                for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                                                                    printAvailableSeats(database.get(a).getFlights().get(b).getSeats());
                                                                    System.out.print("Chon cho ngoi: ");
                                                                    String lc = sc.nextLine();

                                                                    for (int j = 0; j < database.get(a).getFlights().get(b).getSeats().size(); j++) {
                                                                        if (database.get(a).getFlights().get(b).getSeats().get(j).getStatus() == 1) {
                                                                            if (lc.equals(database.get(a).getFlights().get(b).getSeats().get(j).getSeatCode())) {
                                                                                System.out.println("Cho ngoi da duoc dat. Vui long chon cho ngoi khac!!!");
                                                                            }
                                                                        } else {
                                                                            database.get(a).getFlights().get(b).getPassengers().add(new JSON.Passenger(cccd, hoTen, generateTicketCode(database.get(a).getCode(), macb, lc)));
                                                                            setValueForSeat(database.get(a).getFlights().get(b).getSeats(), lc);
                                                                            System.out.println("Da dat cho: " + lc);
                                                                            if (lc.charAt(0) == 'A') {
                                                                                database.get(a).getFlights().get(b).setUsedEconomySeats(database.get(a).getFlights().get(b).getUsedEconomySeats() + 1);
                                                                            } else if (lc.charAt(0) == 'B') {
                                                                                database.get(a).getFlights().get(b).setUsedBusinessSeats(database.get(a).getFlights().get(b).getUsedBusinessSeats() + 1);
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    write_airlines_file(Json_file_path, database);
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("Ban nhap sai ID !!!");
                                                        }
                                                    }
                                                    break;
                                                    case 5:
                                                        // thoát chương trình                                                     
                                                        break;
                                                    default:
                                                        break;

                                                }
                                            } while (opt_for_passenger != 5); // loop cho mục khách
                                            break;                           // tier 4  
                                        case 4: // sua thong tin 1 chuyen bay
                                            airline_menu();
                                            System.out.print("Nhap lua chon cua ban:  ");
                                            p = sc.nextInt();
                                            sc.nextLine();
                                            int pointEdit = -1;
                                            System.out.print("Nhap so hieu chuyen bay can sua: ");
                                            String ctFlightCode = sc.nextLine();
                                            try {
                                                for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                    if (database.get(p).getFlights().get(i).getFlightCode().equals(ctFlightCode)) {
                                                        pointEdit = i;
                                                        System.out.print("Nhap diem xuat phat: ");
                                                        diemXp = sc.nextLine();
                                                        database.get(p).getFlights().get(pointEdit).setDeparture(diemXp);
                                                        System.out.print("Nhap diem den: ");
                                                        diemDen = sc.nextLine();
                                                        database.get(p).getFlights().get(pointEdit).setDestination(diemDen);
                                                        System.out.println("Nhap thoi gian di ");
                                                        System.out.print("Nhap nam, thang, ngay: ");
                                                        year = sc.nextInt();
                                                        month = sc.nextInt();
                                                        day = sc.nextInt();
                                                        dateDep = new JSON.Date(year, month, day);
                                                        System.out.print("Nhap gio, phut: ");
                                                        hour = sc.nextInt();
                                                        minute = sc.nextInt();
                                                        second = 0;
                                                        nano = 0;
                                                        timeDep = new Time(hour, minute, second, nano);
                                                        tgDi = new JSON.DepartureTime(dateDep, timeDep);

                                                        database.get(p).getFlights().get(pointEdit).setDepartureTime(tgDi);
                                                        // tgian
                                                        System.out.println("Nhap thoi gian den");
                                                        System.out.print("Nhap nam, thang, ngay: ");
                                                        year = sc.nextInt();
                                                        month = sc.nextInt();
                                                        day = sc.nextInt();
                                                        dateArr = new JSON.Date__1(year, month, day);
                                                        System.out.print("Nhap gio, phut: ");
                                                        hour = sc.nextInt();
                                                        minute = sc.nextInt();
                                                        second = sc.nextInt();
                                                        nano = 0;
                                                        timeArr = new Time__1(hour, minute, second, nano);
                                                        tgDen = new JSON.ArrivalTime(dateArr, timeArr);
                                                        database.get(p).getFlights().get(pointEdit).setArrivalTime(tgDen);
                                                        //tgian
                                                        System.out.print("Nhap so luong cho ngoi hang thuong gia: ");
                                                        soluongTg = sc.nextInt();
                                                        database.get(p).getFlights().get(pointEdit).setUsedBusinessSeats(soluongTg);
                                                        System.out.print("Nhap so luong cho ngoi hang pho thuong: ");
                                                        soluongPt = sc.nextInt();
                                                        database.get(p).getFlights().get(pointEdit).setUsedEconomySeats(soluongPt);
                                                        System.out.println("Nhap gia ve hang thuong gia: ");
                                                        giaVeTg = sc.nextInt();
                                                        database.get(p).getFlights().get(pointEdit).setBusinessFare(giaVeTg);
                                                        System.out.println("Nhap gia ve hang pho thong: ");
                                                        giaVePt = sc.nextInt();
                                                        database.get(p).getFlights().get(pointEdit).setEconomyFare(giaVePt);
                                                        System.out.println("Thong bao thay doi den hanh khach co so hieu chuyen bay: " + ctFlightCode);
                                                        break;
                                                    }
                                                }
                                                if (pointEdit == -1) {
                                                    System.out.println("Khong ton tai ma chuyen bay nay!!!");
                                                }
                                            } catch (Exception ex_4) {
                                                System.out.println("Da xay ra loi khia nhap ma chuyen bay!!!");
                                            }

                                            System.out.println("Nhập mã hãng hàng không cần tính doanh thu: ");
                                            code = sc.nextLine();
                                            check = 0;

                                            for (int i = 0; i < database.size(); i++) {
                                                if (database.get(i).getCode().equals(code)) {
                                                    check = 1;
                                                    month = 0;
                                                    year = 0;

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

                                                    database.get(i).statisticize_turnOver(database.get(i).getFlights(), check, month, year);
                                                    break;
                                                }
                                            }
                                            if (check == 0) {
                                                System.out.println("Không tìm thấy mã hãng hàng không cần tính");
                                            }
                                            break;

                                        case 5: // loc thong tin 1 chuyen bay // Phan tra cuu thong tin
                                            airline_menu();
                                            System.out.print("Nhap lua chon cua ban:  ");
                                            p = sc.nextInt();

                                            System.out.println("Vui long chon thong tin ban muon loc: ");
                                            System.out.println("1. Loc theo dia diem di");
                                            System.out.println("2. Loc theo dia diem den");
                                            System.out.println("3. Loc theo ngay di(nam, thang, ngay)");
                                            System.out.println("4. Loc theo ngay den(nam, thang, ngay)");
                                            System.out.println("5. Loc theo gio di(gio, phut)");
                                            System.out.println("6. Loc theo gio den(gio, phut)");
                                            System.out.print("Nhap lua chon cua ban: ");

                                            ArrayList<JSON.Flight> list = new ArrayList<>();
                                            int luaChon = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Nhap thong tin muon loc: ");

                                            switch (luaChon) {
                                                case 1:
                                                    String information = sc.nextLine();
                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getDeparture().equals(information)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                case 2:
                                                    information = sc.nextLine();
                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getDestination().equals(information)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                case 3:
                                                    year = sc.nextInt();
                                                    month = sc.nextInt();
                                                    day = sc.nextInt();
                                                    dateDep = new JSON.Date(year, month, day);

                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getDepartureTime().getDate().equals(dateDep)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                case 4:
                                                    year = sc.nextInt();
                                                    month = sc.nextInt();
                                                    day = sc.nextInt();
                                                    dateArr = new JSON.Date__1(year, month, day);
                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getArrivalTime().getDate().equals(dateArr)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                case 5:
                                                    hour = sc.nextInt();
                                                    minute = sc.nextInt();
                                                    second = 0;
                                                    nano = 0;
                                                    timeDep = new Time(hour, minute, second, nano);
                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getDepartureTime().getTime().equals(timeDep)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                case 6:
                                                    hour = sc.nextInt();
                                                    minute = sc.nextInt();
                                                    second = 0;
                                                    nano = 0;
                                                    timeArr = new Time__1(hour, minute, second, nano);
                                                    for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                        if (database.get(p).getFlights().get(i).getArrivalTime().getTime().equals(timeArr)) {
                                                            list.add(database.get(p).getFlights().get(i));
                                                        }
                                                    }
                                                    Collections.sort(list, new NameComparator());
                                                    for (int i = 0; i < list.size(); i++) {
                                                        System.out.println(list.get(i).getFlightCode());
                                                    }
                                                    list.clear();
                                                    break;
                                                default:
                                                    break;
                                            }

                                            break;
                                        case 6: //thoat chuong trinh
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
                    // break case 2 - case cho quản lý
                }
                case 3: {
                }
                default: {
                }

            }
            // break case 3 - thoát chương trình

        } while (option
                != 3); // loop tổng của CẢ CHƯƠNG TRÌNH - tier 1
    }
}
