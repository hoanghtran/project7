/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07.swing;

import JSON.Passenger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class IOFile {
    
    private static final String current = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String Json_file_path = current + separator + "data" + separator + "List_of_Airlines.json";
    private static final String Json_airport_file_path = current + separator + "data" + separator + "List_of_Airports.json";
    static List<JSON.Airline> database = new ArrayList<>();
    
    static List read_json_file(String file_path) throws IOException {

        try (FileReader fr = new FileReader(file_path)) {
            Gson gson = new Gson();

            java.lang.reflect.Type type = new TypeToken<List<JSON.Airline>>() {
            }.getType();

            List<JSON.Airline> airlines = gson.fromJson(fr, type);

            return airlines;
        }
    }
    
    
    
    public JSON.Passenger getPassenger(int a, int b, int c) throws IOException{
        List<JSON.Airline> LAirline = new ArrayList<>();
        JSON.Passenger passenger = new Passenger();
        
        LAirline = read_json_file(Json_file_path);
             
        return LAirline.get(a).getFlights().get(b).getPassengers().get(c);
    }
}
