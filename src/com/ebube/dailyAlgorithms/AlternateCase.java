package com.ebube.dailyAlgorithms;

public class AlternateCase {
    public static void main(String[] args) {
        System.out.println(alternateCase("Hello WorRd"));
    }

    static String alternateCase(final String string) {
        String result = "";
        for (String s : string.split("")) {
            if (s.equals(s.toUpperCase())) {
                result += s.toLowerCase();
            } else {
                result += s.toUpperCase();
            }
        }
        return result;
    }
}
