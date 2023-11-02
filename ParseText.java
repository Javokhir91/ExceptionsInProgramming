package org.example.lesson3.homework;

import java.util.InputMismatchException;

public class ParseText {

    public static String transform(String data) throws InputMismatchException{
        try {
            boolean hasDigits = false;
            for (int i = 0; i < data.length() && !hasDigits; i++) {
                if (Character.isDigit(data.charAt(i))) {
                    throw new InputMismatchException("Invalid symbol");
                }
            }
            return data;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } throw new InputMismatchException("Invalid symbol");


    }
}
