package org.example.lesson3.homework;


public class ParsePhoneNumber {

    public static long check(String args) throws NumberFormatException{

        try {
            if (args.length() == 10) {
                return Long.parseLong(args);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage().getClass());
        }
        throw new NumberFormatException("Invalid phone number");
    }
}
