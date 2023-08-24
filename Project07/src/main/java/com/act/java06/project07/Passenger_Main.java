/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Passenger_Main {

    static void menu() {
        System.out.println("Vui long nhap so ban chon:");
        System.out.println("1: hanh khach");
        System.out.println("2: ve");
        System.out.println("3: chuyen bay");
        System.out.println("4: hang hang khong");
        System.out.println("5: thoat");
    }

    static void hanhKhach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tuy chon hanh khach:");
        System.out.println("1: them hanh khach");
        System.out.println("2: sua hanh khach");
        System.out.println("3: xoa hanh khach");
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Passenger> passengers = new ArrayList<>();
        menu();
        int luaChon = sc.nextInt();
        switch (luaChon) {
            case 1: {
                hanhKhach();
                int luaChon1 = sc.nextInt();
                switch (luaChon1) {
                    case 1: {
                        System.out.println("tuy chon hanh khach:");
                        System.out.println("1: them hanh khach");
                        System.out.println("2: sua hanh khach");
                        System.out.println("3: xoa hanh khach");
                        int luaChon2 = sc.nextInt();
                        switch (luaChon2) {
                            case 1: {
                                System.out.println("Nhap ten hanh khach:");
                                String hoTen = sc.nextLine();
                                System.out.println("Nhap can cuoc cong dan hanh khach:");
                                String ID = sc.nextLine();
                                System.out.println("Nhap ma ve:");
                                String maVe = sc.nextLine();
                                passengers.add(new Passenger(ID, hoTen, maVe));
                            }
                            case 2:{
                                System.out.println("Nhap ID can sua doi:");
                                String suaDoi = sc.nextLine();
                                for(int i=0; i<passengers.size(); i++){
                                    if(passengers.get(i).getID().equals(suaDoi)){
                                        
                                    }
                                }
                            }
                            case 3:{
                                System.out.println("Nhap ID can xoa");
                                String xoa = sc.nextLine();
                                for(int i=0; i<passengers.size(); i++){
                                    if(passengers.get(i).getID().equals(xoa)){
                                        passengers.remove(i);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
