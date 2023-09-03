/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07;

import JSON.Flight;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class NameComparator implements Comparator<JSON.Flight>{

    @Override
    public int compare(Flight o1, Flight o2) {
       return o1.getFlightCode().compareTo(o2.getFlightCode());
    }

    

    

    

    

    
    
}
