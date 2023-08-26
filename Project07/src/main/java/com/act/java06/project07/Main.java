package com.act.java06.project07;

import java.util.Scanner;

/**
 *
 * @author Yatth
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void navigator() {
        System.out.println("======= Điều hướng =======");
        System.out.println("1. Khách hàng\n2. Quản lý\n3. Thoát chương trình");
        System.out.print("Bạn là: ");
    }

    static void modify_or_access_an_airline_option() {
        System.out.println("============== Hang hang khong ==============");
        System.out.println("1. Tao mot hang hang khong");
        System.out.println("2. Xoa mot hang hang khong");
        System.out.println("3. Truy cap hang hang khong");
        System.out.println("4. Thoat chuong trinh");
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
        System.out.println("3. Thoat chuong trinh");
        System.out.print("Vui long nhap lua chon cua ban: ");
    }

    public static void main(String[] args) {

        //global variables:
        int option, opt_for_airline;

        do {
            navigator(); // menu điều hướng
            option = sc.nextInt();

            switch (option) {
                case 1: // case cho khách hàng

                    // chèn code vào đây
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
                                            int opt_for_passenger = sc.nextInt(); // một hành khách
                                            do {
                                                switch (opt_for_passenger) {
                                                    case 1: // thêm hành khách và đồng thời thêm vé 
                                                        // bay lưu ý là cho quản lý điền thêm bao 
                                                        // nhiêu khách nhé, không nhất thiết phải 
                                                        // là 1, exception là <= 0

                                                        break;
                                                    case 2: // xóa 1 hành khách
                                                        // exception sai CCCD

                                                        break;
                                                    case 3: // thoát chương trình
                                                        break;
                                                    default:
                                                        break;

                                                }
                                            } while (opt_for_passenger != 3); // loop cho mục khách
                                            break;                           // tier 4
                                        case 4: // thoát chương trình
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
