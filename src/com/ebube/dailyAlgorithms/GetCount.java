package com.ebube.dailyAlgorithms;

import java.util.Arrays;
import java.util.List;

public class GetCount {


    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }


    //method 2
    public static int getCountII(String str) {
        int vowelsCount = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) vowelsCount++;
        }
        return vowelsCount;
    }


}