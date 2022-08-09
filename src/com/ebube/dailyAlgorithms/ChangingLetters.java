package com.ebube.dailyAlgorithms;

import java.util.List;
import java.util.Locale;

//When provided with a String, capitalize all vowels
//
//For example:
//
//Input : "Hello World!"
//
//Output : "HEllO WOrld!"
//
//Note: Y is not a vowel in this kata.
public class ChangingLetters {
    public static void main(String[] args) {
        //System.out.println(swap1("hello wOrld"));
        System.out.println(swap2("hello world"));
    }

    public static String swap(String st) {
        String result = "";
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');


        for (int i = 0; i < st.length(); i++) {
            if (vowels.contains(st.charAt(i))) {
                result += String.valueOf(st.charAt(i)).toUpperCase();
            } else {
                result += st.charAt(i);
            }
        }
        return result;
    }

    public static String swap1(String st) {

        // Your code here
        String ans = "";
        String vowels = "aeiou";
        for (int i = 0; i < st.length(); i++) {
            if (vowels.contains("" + st.charAt(i))) {
                ans += String.valueOf(st.charAt(i)).toUpperCase();
            } else {
                ans += st.charAt(i);
            }
        }

        return ans;
    }

    public static String swap2(String st) {

        // Your code here
        String ans = "";
        String vowels = "aeiou";
        String[] split = st.split("");
        for (String i : split) {
            if (vowels.contains(i)) {
                ans += i.toUpperCase(Locale.ROOT);
            } else {
                ans += i;
            }
        }

        return ans;
    }
}





















