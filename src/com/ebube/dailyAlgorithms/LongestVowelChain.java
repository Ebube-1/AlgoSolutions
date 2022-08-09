package com.ebube.dailyAlgorithms;

//The vowel substrings in the word codewarriors are o,e,a,io.
// The longest of these has a length of 2. Given a lowercase string that has
// alphabetic characters only (both vowels and consonants) and no spaces,
// return the length of the longest vowel substring. Vowels are any of aeiou.
//
//Good luck!
public class LongestVowelChain {
    public static void main(String[] args) {
        System.out.println(solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }

    public static int solve(String s) {


        int maxValue = 0;
        int temp = 0;
        s = s + "p";

        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains("" + s.charAt(i))) {
                temp++;
            } else {
                if (temp > maxValue) {
                    maxValue = temp;
                }
                temp = 0;
            }

        }
        if (temp > maxValue) {
            maxValue = temp;
        }
        return maxValue;
    }
}
