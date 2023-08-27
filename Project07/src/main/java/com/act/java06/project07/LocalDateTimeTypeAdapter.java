package com.act.java06.project07;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yatth
 */
public class LocalDateTimeTypeAdapter extends TypeAdapter<LocalDateTime> {

    // Define a DateTimeFormatter for parsing and formatting LocalDateTime
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        // Format the LocalDateTime object into a String
        String formatted = formatter.format(value);
        // Write the String as a JsonElement
        out.value(formatted);
    }

    @Override
    public LocalDateTime read(JsonReader in) throws IOException {
        // Read the JsonElement as a String
        String input = in.nextString();
        // Parse the String into a LocalDateTime object
        return LocalDateTime.parse(input, formatter);
    }
}
