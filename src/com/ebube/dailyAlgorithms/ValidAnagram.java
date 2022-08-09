package com.ebube.dailyAlgorithms;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (String each : alphabets.split("")) {
            int a = s.replace(each, "").length();
            int b = t.replace(each, "").length();
            if (a != b) return false;
        }
        return true;
    }
}
