package com.ebube.dailyAlgorithms;

import java.sql.PreparedStatement;

public class PrinterErrors {
    public static void main(String[] args) {
        System.out.println(printerError("aaabbbbhaijjjm"));
    }

    public static String printerError(String s) {
        int count = 0;
        String numerator = "";
        String denominator = String.valueOf(s.length());
        String alphabets = "abcdefghijklm";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!alphabets.contains(s.charAt(i) + "")) {
                count++;
            }

            numerator = String.valueOf(count);
            result = numerator + "/" + denominator;
        }
        return result;
    }
}
