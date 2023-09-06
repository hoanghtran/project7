/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import JSON.Flight;
import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class DateComparator implements Comparator<JSON.Flight>{
    static LocalDate chuyenDateJsonThanhLocalDate(int y, int m, int d) {
        return LocalDate.of(y, m, d);
    }

    @Override
    public int compare(Flight o1, Flight o2) {
        return chuyenDateJsonThanhLocalDate(o1.getDepartureTime().getDate().getYear(),
                o1.getDepartureTime().getDate().getMonth(), o1.getDepartureTime().getDate().getDay())
                .compareTo(chuyenDateJsonThanhLocalDate(o2.getDepartureTime().getDate().getYear(),
                o2.getDepartureTime().getDate().getMonth(), o2.getDepartureTime().getDate().getDay()));
    }

    

    
    
}
