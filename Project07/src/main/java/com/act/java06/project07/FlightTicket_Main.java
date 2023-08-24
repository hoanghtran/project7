/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FlightTicket_Main {

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("===========CHUC NANG===========");
        System.out.println("    0.Thoat");
        System.out.println("    1.Them ve may bay");
        System.out.println("    2.Sua ve may bay");
        System.out.println("    3.Xoa ve may bay");
        System.out.println("    4.Hien thi so ve co san");
        System.out.println("        Nhap chuc nang: ");
    }

    public static void main(String[] args) {
        ArrayList<FlightTicket> dsve = new ArrayList<>();
        int chon = sc.nextInt();
        do {
            menu();
            switch (chon) {
                case 1: {
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
                    sc.next();
                    System.out.printf(" -Nhap gia ve: ");
                    double fare = sc.nextDouble();
                    sc.next();
                    System.out.printf(" -Nhap so hieu ghe ngoi: ");
                    String SeatNumber = sc.nextLine();
                    dsve.add(new FlightTicket(ticketCode, flightNumber, departure, destination, departureTime, arrivalTime, ticketClass, fare, SeatNumber));
                    break;
                }
                case 2: {
                    System.out.printf("Nhap ma ve can sua: ");
                    String maVe = sc.nextLine();
                    for (int i = 0; i < dsve.size(); i++) {
                        if (dsve.get(i).getTicketCode().equals(maVe)) {

                        } else {
                            System.out.println("Khong the sua do khong tim thay ma ve!!!");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.printf("Nhap ma ve can sua: ");
                    String maVe = sc.nextLine();
                    for (int i = 0; i < dsve.size(); i++) {
                        if (dsve.get(i).getTicketCode().equals(maVe)) {
                            dsve.remove(i);
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

        } while (chon != 0);
    }
}
