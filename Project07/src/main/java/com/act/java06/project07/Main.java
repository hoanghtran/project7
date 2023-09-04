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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yatth
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<KeyValue<String, Integer>> dsChoNgoi = new ArrayList<>();

    private static final String current = System.getProperty("user.dir");
    private static final String separator = File.separator;
    static String Json_file_path = current + separator + "data" + separator + "List_of_Airlines.json";
    static String Json_airport_file_path = current + separator + "data" + separator + "List_of_Airports.json";

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
        System.out.print("Truy cập hãng hàng không: ");
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

    static void randomPlaneCode() {
        System.out.println("============== Tao ngau nhien ==============");
        System.out.println("Tao ngau nhien ma may bay (Y/N) ");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static void randomFlightCode() {
        System.out.println("============== Tao ngau nhien ==============");
        System.out.println("Tao ngau nhien so hieu chuyen bay (Y/N) ");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    static <E> void show(List<E> list) {
        System.out.println("=========================");
        for (Object item : list) {
            System.out.println(item.toString());
        }
    }

    static void menu_passenger_1() {
        System.out.println("=============Menu_Passenger==========");
        System.out.println("Tim chuyen bay theo: ");
        System.out.println("1. Dia diem di");
        System.out.println("2. Dia diem den");
        System.out.println("3. Ngay di");
        System.out.println("4. Ngay den");
        System.out.print("Nhap lua chon cua ban: ");
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
    static void newEmptySeats(List<JSON.Seat> listOfSeats){
        
        for (int i = 1; i <= 200; i++) {

            int x = i + 1;
            String str = "";
            if (i <= 50) {
                if (i < 10) {
                    str = "A" + "0" + i;
                } else {
                    str = "A" + i;
                }
            }
            else if(i<=100){
                if(i%50<10){
                    str = "B"+"0"+i%50;
                }
                else{
                    str = "B"+i;
                }
            }
            else if(i<=150){
                if(i%50<10){
                    str = "C"+"0"+i%50;
                }
                else{
                    str = "C"+i;
                }
            }
            else if(i<=200){
                if(i%50<10){
                    str = "D"+"0"+i%50;
                }
                else{
                    str = "D"+i;
                }
            }
            listOfSeats.get(i).setSeatCode(str);
            listOfSeats.get(i).setStatus(0);
        }

//        for (int a = 0; a < database.size(); a++) {
//            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
//                for (int c = 0; c < database.get(a).getFlights().get(b).getPassengers().size(); c++) {
//                    if (database.get(a).getFlights().get(b).getFlightCode().equals(code)) {
//                        String[] part = database.get(a).getFlights().get(b).getPassengers().get(c).getTicketCode().split("-");
//                        for (int i = 0; i < list.size(); i++) {
//                            if (part[1].equals(list.get(i).getKey())) {
//                                list.get(i).setValue(1);
//                            }
//                        }
//                    }
//                }
//            }
//        }
        
    }

    static void setValueForSeat(List<JSON.Seat> listOfSeats, String seatCode) {
        for (int i = 0; i < listOfSeats.size(); i++) {
            if (listOfSeats.get(i).getSeatCode().equals(seatCode)) {
                listOfSeats.get(i).setStatus(1);
            }
        }

    }

    static void printAvailableSeats(List<JSON.Seat> listOfSeats) {
        for (int i = 0; i < 200; i++) {
            if (i % 50 == 0) {
                System.out.println("");
            }
            if (listOfSeats.get(i).getStatus() == 0) {
                System.out.print(listOfSeats.get(i).getSeatCode() + "\t");
            } else {
                System.out.print("   \t");
            }

        }
        System.out.println("Hang pho thong: tu 01->25");
        System.out.println("Hang thuong gia: tu 26->50");
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
    
            
    static String generateTicketCode(String code, List<JSON.Airline> database, String Seatcode) throws IOException {

        String rs = code + "-";
        rs += Seatcode + "-";
        List<JSON.Airline> ds = read_json_file(Json_file_path);
        for (JSON.Airline airline : ds) {
            if (airline.getCode().equals(code)) {
                for (JSON.Flight fl : airline.getFlights()) {
                    rs += fl.getFlightCode();
                }
            }
            break;
        }
        return rs;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //global variables:
        List<JSON.Airline> database = new ArrayList<>();
        database = read_json_file(Json_file_path);

        int option, opt_for_airline;

        do {
            navigator(); // menu điều hướng
            option = sc.nextInt();

            switch (option) {
                case 1: // case cho khách hàng
                    int kt = 0;
                    airline_menu();
                    int opt_for_airline_menu = sc.nextInt(); // index của hãng hàng không 

                    //Hiện menu cho khách chọn nơi xuất phát, nơi đến, ngày đi và ngày về (Đức Duy làm)
                    menu_passenger_1();
                    ArrayList<JSON.Flight> listCB = new ArrayList<>();

                    //Hiển thị ds các chuyến bay khả dụng với ngày đi và ngày về đó (Quốc Huy làm)
                        int lua_chon = sc.nextInt();
                        switch (lua_chon) {
                            case 1:
                                sc.nextLine();
                                String information = sc.nextLine();
                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getDeparture().equals(information)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            case 2:
                                information = sc.nextLine();
                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getDestination().equals(information)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            case 3:
                                System.out.print("Nhap vao nam: ");
                                int year = sc.nextInt();
                                System.out.print("Nhap vao thang: ");
                                int month = sc.nextInt();
                                System.out.print("Nhap vao ngay");
                                int day = sc.nextInt();
                                JSON.Date dateDep = new JSON.Date(year, month, day);

                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getDate().equals(dateDep)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            case 4:
                                System.out.print("Nhap vao nam: ");
                                year = sc.nextInt();
                                System.out.print("Nhap vao thang: ");
                                month = sc.nextInt();
                                System.out.print("Nhap vao ngay");
                                day = sc.nextInt();
                                JSON.Date__1 dateArr = new JSON.Date__1(year, month, day);
                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getDate().equals(dateArr)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            case 5:

                                int hour = sc.nextInt();
                                int minute = sc.nextInt();
                                int second = sc.nextInt();
                                int nano = sc.nextInt();
                                JSON.Time timeDep = new Time(hour, minute, second, nano);
                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getDepartureTime().getTime().equals(timeDep)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            case 6:
                                hour = sc.nextInt();
                                minute = sc.nextInt();
                                second = sc.nextInt();
                                nano = sc.nextInt();
                                JSON.Time__1 timeArr = new Time__1(hour, minute, second, nano);
                                for (int i = 0; i < database.get(opt_for_airline_menu).getFlights().size(); i++) {
                                    if (database.get(opt_for_airline_menu).getFlights().get(i).getArrivalTime().getTime().equals(timeArr)) {
                                        listCB.add(database.get(opt_for_airline_menu).getFlights().get(i));
                                    }
                                }
                                Collections.sort(listCB, new NameComparator());
                                for (int i = 0; i < listCB.size(); i++) {
                                    System.out.println(listCB.get(i).getFlightCode());
                                }
                                listCB.clear();
                                break;
                            default:
                                System.out.println("Khong co chuyen bay nao co thong tin nhu tren!!!"); //Nếu không có hiện là không có
                                break;
                        }
                    

                    //Nếu có thì đến mục menu tiếp theo lựa chọn khứ hồi hay 1 chiều, bao nhiêu 
                    //người (Quốc Huy)
                    //Sau khi khách chọn xong hiển thị giá vé và tính toán (Hoàng làm)
                    //Cùng lúc đấy tạo (mã) vé + hành khách vào chuyến bay (Đức Duy + Q.Huy làm)
                    //Chuyển value của seat được đặt từ - -> 1, usedSeat +1, availableSeat -1 (Duy Huy làm)
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

                                List<JSON.Plane> listOfPlanes = new ArrayList<>();
                                JSON.Plane plane = new JSON.Plane();
                                for (int n = 0; n < numOfPlanes; n++) {
                                    System.out.print("Nhập mã máy bay của bạn: ");
                                    String PlaneCode = sc.nextLine();
                                    plane.setPlaneCode(PlaneCode);
                                    System.out.print("Nhập số chỗ ngồi của bạn: ");
                                    int num = sc.nextInt();
                                    plane.setNumOfSeats(num);
                                }

                                database.add(new JSON.Airline(brandname, code, numOfPlanes, listOfPlanes, numOfPlanes));
                                write_airlines_file(Json_file_path, database);
                                break;
                            case 2: // xóa một hãng hàng không 
                                //exception mã hãng hàng không sai thì sao?

                                System.out.print("Nhập mã hãng hàng không cần xóa: ");
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
                                    System.out.println("Không tìm thấy mã hãng hàng không cần xóa");
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
                                            System.out.println("Nhap ten hang hang khong can them chuyen bay(nhap dung voi ten o tren): ");
                                            brandname = sc.nextLine();
                                            for (int p = 0; p < database.size(); p++) {
                                                if (database.get(p).getBrandname().equals(brandname)) {
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
                                                                    randomFlightCode();
                                                                    String nhap = sc.next();
                                                                    char lc = nhap.charAt(0);
                                                                    if (lc == 'Y' || lc == 'y') {
                                                                        UUID maMayBay = UUID.randomUUID();
                                                                        String maMayBayString = maMayBay.toString();
                                                                        String maMayBayEdit = maMayBayString.replace("-", "").substring(0, 8);
                                                                    }
                                                                    System.out.println(" -Nhap so hieu may bay: ");
                                                                    String soHieuMb = sc.nextLine();

                                                                    System.out.println(" -Nhap so hieu chuyen bay: ");
                                                                    String soHieuCb = sc.nextLine();

                                                                    System.out.println(" -Nhap diem xuat phat: ");
                                                                    String diemXp = sc.nextLine();

                                                                    System.out.println(" -Nhap diem den: ");
                                                                    String diemDen = sc.nextLine();

                                                                    System.out.println(" -Nhap thoi gian di ");
                                                                    System.out.print("Nhập nam, thang, ngay: ");

                                                                    int year = sc.nextInt();
                                                                    int month = sc.nextInt();
                                                                    int day = sc.nextInt();
                                                                    JSON.Date dateDep = new JSON.Date(year, month, day);
                                                                    System.out.print("Nhập gio, phut, giay, nano: ");
                                                                    int hour = sc.nextInt();
                                                                    int minute = sc.nextInt();
                                                                    int second = sc.nextInt();
                                                                    int nano = sc.nextInt();
                                                                    JSON.Time timeDep = new Time(hour, minute, second, nano);
                                                                    JSON.DepartureTime tgDi = new JSON.DepartureTime(dateDep, timeDep);
                                                                    System.out.println(" -Nhap thoi gian den: ");
                                                                    System.out.print("Nhập nam, thang, ngay: ");
                                                                    year = sc.nextInt();
                                                                    month = sc.nextInt();
                                                                    day = sc.nextInt();
                                                                    JSON.Date__1 dateArr = new JSON.Date__1(year, month, day);
                                                                    System.out.print("Nhập gio, phut, giay, nano: ");
                                                                    hour = sc.nextInt();
                                                                    minute = sc.nextInt();
                                                                    second = sc.nextInt();
                                                                    nano = sc.nextInt();
                                                                    JSON.Time__1 timeArr = new Time__1(hour, minute, second, nano);
                                                                    JSON.ArrivalTime tgDen = new JSON.ArrivalTime(dateArr, timeArr);

                                                                    System.out.println(" -Nhap so luong cho ngoi hang thuong gia: ");
                                                                    int soluongTg = sc.nextInt();

                                                                    System.out.println(" -Nhap so luong cho ngoi hang pho thuong: ");
                                                                    int soluongPt = sc.nextInt();

                                                                    System.out.println(" -Nhap gia ve hang thuong gia");
                                                                    int giaVeTg = sc.nextInt();

                                                                    System.out.println(" -Nhap gia ve hang pho thong");
                                                                    int giaVePt = sc.nextInt();

                                                                    database.get(p).getFlights().add(new JSON.Flight(soHieuCb, soHieuMb, tgDi, tgDen, diemXp, diemDen, giaVeTg, giaVePt, soluongTg, soluongPt));
                                                                    ArrayList<Seat> seats = new ArrayList<>();
                                                                    newEmptySeats(seats);
                                                                    database.get(p).getFlights().get(database.get(p).getFlights().size() - 1).setSeats(seats);
                                                                    // thêm phần viết lại vào file
                                                                }
                                                            } else {
                                                                System.out.println("Loi nhap so luong!!!!!!");
                                                                System.out.println("So can nhap la so nguyen duong!!!!");
                                                            }
                                                        } while (n < 0);
                                                    } catch (Exception ex) {
                                                        System.out.println("Da xay ra loi khi nhap 1 chuyen bay" + ex);

                                                    }
                                                }
                                                break;
                                            }

                                            break;
                                        case 2: // xóa một chuyến bay
                                            //exception mã chuyến bay sai thì sao?

                                            // chèn code vào đây
                                            airline_menu();
                                            System.out.println("Nhap ten hang hang khong can xoa chuyen bay(nhap dung voi ten o tren): ");
                                            brandname = sc.nextLine();
                                            for (int p = 0; p < database.size(); p++) {
                                                if (database.get(p).getBrandname().equals(brandname)) {
                                                    System.out.println("Nhap so hieu chuyen bay can xoa: ");
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

                                                    } catch (ExceptionInInitializerError ex) {
                                                        System.out.println("Da xay ra loi khi nhap ma chuyen bay" + ex);
                                                    }
                                                }
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
                                                        int checkCodeCB = 0;
                                                        System.out.print("Vui long nhap ma chuyen bay:");
                                                        sc.nextLine();
                                                        String luaChonCB = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {
                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                                                                if (database.get(a).getFlights().get(b).getFlightCode().equals(luaChonCB)) {

                                                                    checkCodeCB = 1;
                                                                    System.out.print("Ban muon them bao nhieu hanh khach:");
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
                                                                        
//                                                                        UUID maVe = UUID.randomUUID();
//                                                                        String maVeString = maVe.toString().toUpperCase();
//                                                                        String maVeEdit = maVeString.replace("-", "").substring(0, 8);
//                                                                        System.out.println("Ma ve cua ban la: " + maVeEdit);
                                                                        for(int j=0; j<database.get(a).getFlights().get(b).getSeats().size(); j++){
                                                                            if(luaChon.equals(database.get(a).getFlights().get(b).getSeats().get(j).getSeatCode())){
                                                                                  System.out.println("Cho ngoi da duoc dat");
                                                                            }
                                                                            else{
                                                                                database.get(a).getFlights().get(b).getPassengers().add(new JSON.Passenger(ID, hoTen, generateTicketCode(database.get(a).getCode(), database, luaChon)));
                                                                            }
                                                                        }

                                                                        
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (checkCodeCB == 0) {
                                                            System.out.println("Khong tim thay ma chuyen bay");
                                                        }
                                                        break;
                                                    }

                                                    case 2: // xóa 1 hành khách
                                                        // exception sai CCCD
                                                        int checkID = 0;
                                                        System.out.print("Nhap ID hanh khach muon xoa: ");
                                                        sc.nextLine();
                                                        String IDxoa = sc.nextLine();
                                                        for (int a = 0; a < database.size(); a++) {
                                                            for (int b = 0; b < database.get(a).getFlights().size(); b++) {
                                                                for (int c = 0; c < database.get(a).getFlights().get(b).getPassengers().size(); c++) {

                                                                    if (database.get(a).getFlights().get(b).getPassengers().get(c).getId().equals(IDxoa)) {
                                                                        checkID = 1;
                                                                        for(int i=0; i<database.get(a).getFlights().get(b).getSeats().size(); i++){
                                                                            if(database.get(a).getFlights().get(b).getSeats().get(i).getSeatCode().equals(database.get(a).getFlights().get(b).getPassengers().get(c).getTicketCode().substring(3, 5))){
                                                                                database.get(a).getFlights().get(b).getSeats().get(i).setStatus(0);
                                                                                
                                                                            }
                                                                        }
                                                                        database.get(a).getFlights().get(b).getPassengers().remove(c);
                                                                    }
                                                                }
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
                                                                        database.get(a).getFlights().get(b).getPassengers().toString();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (checkFlCode == 0) {
                                                            System.out.println("Khong tim thay so hieu chuyen bay: " + soHieu);
                                                        }
                                                    case 4:
                                                        int checkMave = 0;
                                                        System.out.printf("Nhap ma ve can sua: ");
                                                        String maVe = sc.nextLine();
                                                        for (int i = 0; i < LTicket.size(); i++) {
                                                            if (LTicket.get(i).getTicketCode().equals(maVe)) {
                                                                for (int j = 0; j < LFlight.size(); j++) {
                                                                    if (LFlight.get(j).getFlightCode().equals(LTicket.get(i).getFlightNumber())) {
                                                                        checkMave = 1;
                                                                        System.out.println("Chon hang ve: ");
                                                                        System.out.println("1.Thuong gia");
                                                                        System.out.println("2.Pho Thong");
                                                                        System.out.print("nhap lua chon cua ban:");
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
                                                        if (checkMave == 0) {
                                                            System.out.println("Khong tim thay ma ve: " + checkMave);
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
                                            airline_menu();
                                            System.out.println("Nhap ten hang hang khong can xoa chuyen bay(nhap dung voi ten o tren): ");
                                            brandname = sc.nextLine();
                                            for (int p = 0; p < database.size(); p++) {
                                                if (database.get(p).getBrandname().equals(brandname)) {
                                                    int pointEdit = -1;
                                                    System.out.println("Nhap so hieu chuyen bay can sua: ");
                                                    String ctFlightCode = sc.nextLine();
                                                    try {
                                                        for (int i = 0; i < database.get(p).getFlights().size(); i++) {
                                                            if (database.get(p).getFlights().get(i).getFlightCode().equals(ctFlightCode)) {
                                                                pointEdit = i;
                                                                System.out.println(" -Nhap diem xuat phat: ");
                                                                String diemXp = sc.nextLine();
                                                                database.get(p).getFlights().get(pointEdit).setDeparture(diemXp);
                                                                System.out.println(" -Nhap diem den: ");
                                                                String diemDen = sc.nextLine();
                                                                database.get(p).getFlights().get(pointEdit).setDestination(diemDen);
                                                                System.out.println(" -Nhap thoi gian di : ");
                                                                System.out.print("Nhap nam, thang, ngay: ");
                                                                int year = sc.nextInt();
                                                                int month = sc.nextInt();
                                                                int day = sc.nextInt();
                                                                JSON.Date dateDep = new JSON.Date(year, month, day);
                                                                System.out.print("Nhập gio, phut, giay, nano: ");
                                                                int hour = sc.nextInt();
                                                                int minute = sc.nextInt();
                                                                int second = sc.nextInt();
                                                                int nano = sc.nextInt();
                                                                JSON.Time timeDep = new Time(hour, minute, second, nano);
                                                                JSON.DepartureTime tgDi = new JSON.DepartureTime(dateDep, timeDep);

                                                                database.get(p).getFlights().get(pointEdit).setDepartureTime(tgDi);
                                                                // tgian
                                                                System.out.print("Nhập nam, thang, ngay: ");
                                                                year = sc.nextInt();
                                                                month = sc.nextInt();
                                                                day = sc.nextInt();
                                                                JSON.Date__1 dateArr = new JSON.Date__1(year, month, day);
                                                                System.out.print("Nhập gio, phut, giay, nano: ");
                                                                hour = sc.nextInt();
                                                                minute = sc.nextInt();
                                                                second = sc.nextInt();
                                                                nano = sc.nextInt();
                                                                JSON.Time__1 timeArr = new Time__1(hour, minute, second, nano);
                                                                JSON.ArrivalTime tgDen = new JSON.ArrivalTime(dateArr, timeArr);
                                                                database.get(p).getFlights().get(pointEdit).setArrivalTime(tgDen);
                                                                //tgian
                                                                System.out.println(" -Nhap so luong cho ngoi hang thuong gia: ");
                                                                int soluongTg = sc.nextInt();
                                                                database.get(p).getFlights().get(pointEdit).setUsedBusinessSeats(soluongTg);
                                                                System.out.println(" -Nhap so luong cho ngoi hang pho thuong: ");
                                                                int soluongPt = sc.nextInt();
                                                                database.get(p).getFlights().get(pointEdit).setUsedEconomySeats(soluongPt);
                                                                System.out.println(" -Nhap gia ve hang thuong gia");
                                                                int giaVeTg = sc.nextInt();
                                                                database.get(p).getFlights().get(pointEdit).setBusinessFare(giaVeTg);
                                                                System.out.println(" -Nhap gia ve hang pho thong");
                                                                int giaVePt = sc.nextInt();
                                                                database.get(p).getFlights().get(pointEdit).setEconomyFare(giaVePt);
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
                                                }
                                                break;
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

                                        case 5: // loc thong tin 1 chuyen bay // Phan tra cuu thong tin
                                            airline_menu();
                                            System.out.println("Nhap ten hang hang khong can xoa chuyen bay(nhap dung voi ten o tren): ");
                                            brandname = sc.nextLine();
                                            for (int p = 0; p < database.size(); p++) {
                                                if (database.get(p).getBrandname().equals(brandname)) {

                                                    System.out.println("Vui long chon thong tin ban muon loc: ");
                                                    System.out.println("1. Loc theo dia diem di");
                                                    System.out.println("2. Loc theo dia diem den");
                                                    System.out.println("3. Loc theo ngay di(nam, thang, ngay)");
                                                    System.out.println("4. Loc theo ngay den(nam, thang, ngay)");
                                                    System.out.println("5. Loc theo gio di(gio, phut, giay, nano)");
                                                    System.out.println("6. Loc theo gio den(gio, phut, giay, nano)");
                                                    System.out.println("Nhap lua chon cua ban: ");

                                                    ArrayList<JSON.Flight> list = new ArrayList<>();
                                                    int luaChon = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Nhap thong tin muon loc: ");

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
                                                            int year = sc.nextInt();
                                                            int month = sc.nextInt();
                                                            int day = sc.nextInt();
                                                            JSON.Date dateDep = new JSON.Date(year, month, day);

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
                                                            JSON.Date__1 dateArr = new JSON.Date__1(year, month, day);
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
                                                            int hour = sc.nextInt();
                                                            int minute = sc.nextInt();
                                                            int second = sc.nextInt();
                                                            int nano = sc.nextInt();
                                                            JSON.Time timeDep = new Time(hour, minute, second, nano);
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
                                                            second = sc.nextInt();
                                                            nano = sc.nextInt();
                                                            JSON.Time__1 timeArr = new Time__1(hour, minute, second, nano);
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
                                                }
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

                    break; // break case 2 - case cho quản lý

                case 3:
                    break; // break case 3 - thoát chương trình

                default:
                    break;

            }
        } while (option != 3); // loop tổng của CẢ CHƯƠNG TRÌNH - tier 1
    }
}
