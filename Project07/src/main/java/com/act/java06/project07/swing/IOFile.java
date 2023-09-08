/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.project07.swing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
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
    List<JSON.Airline> database = new ArrayList<>();
    database = read_json_file(Json_file_path);
}
