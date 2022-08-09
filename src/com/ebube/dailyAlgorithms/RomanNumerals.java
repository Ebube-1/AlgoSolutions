package com.ebube.dailyAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static void main(String[] args) {

        System.out.println(romanToInt1("LVIII"));
    }

    public static int romanToInt1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) result += map.get(s.charAt(i));
            else if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) result -= map.get(s.charAt(i));
            else result += map.get(s.charAt(i));
        }

        return result;
    }


//    public static int romanToInt(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        int solution = 0;
//
//        for (int i = 0; i < s.length(); i++){
//
//            if (i == s.length()-1) solution += map.get(s.charAt(i));
//            else if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
//                solution -= map.get(s.charAt(i));
//            else solution += map.get(s.charAt(i));
//        }
//        return solution;
//    }

}
