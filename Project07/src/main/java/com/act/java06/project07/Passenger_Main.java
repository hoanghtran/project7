/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Admin
 */
public class Passenger_Main {

    static void menu() {
        System.out.println("Menu:");
        System.out.println("    1: hanh khach");
        System.out.println("    2: ve");
        System.out.println("    3: chuyen bay");
        System.out.println("    4: hang hang khong");
        System.out.println("    5: thoat");
        System.out.println("Vui long nhap so ban chon:");
    }

    static void hanhKhach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tuy chon hanh khach:");
        System.out.println("1: them hanh khach");
        System.out.println("2: sua hanh khach");
        System.out.println("3: xoa hanh khach");
        System.out.println("4: chon loc hanh khach tu chuyen bay");

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Flight> chuyenBay = new ArrayList<>();
        ArrayList<FlightTicket> Ve = new ArrayList<>();
        menu();
        int luaChon = sc.nextInt();
        sc.nextLine();
        switch (luaChon) {
            case 1: {
                hanhKhach();
                sc.nextLine();
                int luaChon1 = sc.nextInt();
                sc.nextLine();
                switch (luaChon1) {
                    case 1: {
                        System.out.println("Nhap ten hanh khach:");
                        sc.nextLine();
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap can cuoc cong dan hanh khach:");
                        String ID = sc.nextLine();
                        System.out.println("Nhap ma ve:");
                        String maVe = sc.nextLine();
                        passengers.add(new Passenger(ID, hoTen, maVe));
                        
                    }
                    case 2: {
                        System.out.println("Nhap ID can sua doi:");
                        sc.nextLine();
                        String suaDoi = sc.nextLine();
                        for (int i = 0; i < passengers.size(); i++) {
                            if (passengers.get(i).getID().equals(suaDoi)) {
                                System.out.println("chon muc can doi");
                                System.out.println("1: ten hanh khach");
                                System.out.println("2: ma ve:");
                                sc.nextLine();
                                int luaChon2 = sc.nextInt();
                                
                            }
                        }
                    }
                    case 3: {
                        System.out.println("Nhap ID can xoa");
                        sc.nextLine();
                        String xoa = sc.nextLine();
                        for (int i = 0; i < passengers.size(); i++) {
                            if (passengers.get(i).getID().equals(xoa)) {
                                passengers.remove(i);
                            }
                        }
                    }
                    case 4: {
                        System.out.println("nhap so hieu chuyen bay:");
                        sc.nextLine();
                        String soHieu = sc.nextLine();
                        for (int i = 0; i < chuyenBay.size(); i++) {
                            //người nào có mã vé của vé có số hiệu máy bay = sohieu thì chọn
                            for (int j = 0; j < passengers.size(); j++) {
                                if (passengers.get(j).getTicketCode().equals(Ve.get(i).getTicketCode())) {
                                    passengers.get(i).toString();
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
