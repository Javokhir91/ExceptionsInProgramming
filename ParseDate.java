package org.example.lesson3.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.zip.DataFormatException;

public class ParseDate {

    public static Date parsedate(String str) throws DataFormatException {


        try { SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            return format.parse(str);
        } catch (DateTimeParseException | ParseException e) {
            System.out.println(e.getMessage());
        } throw new DataFormatException("Invalid Date");
    }
    public static String formatDate(Date date) throws RuntimeException {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            return format.format(date);
        } catch (Exception e) {
            throw new RuntimeException("Invalid Date");
        }
    }
}
