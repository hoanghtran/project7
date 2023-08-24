/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Flight_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Flight> listFlight = new ArrayList<>();
        System.out.println("===================");
        int end = 0;
        while (end == 0) {

            System.out.println("1. Them 1 chuyen bay.");
            System.out.println("2. Sua thong tin 1 chuyen bay.");
            
            System.out.println("Ket thuc.");

            int chon = sc.nextInt();
            switch (chon) {
                case 1:
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
                    listFlight.add(flight);
                    break;
                case 2:
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
}
