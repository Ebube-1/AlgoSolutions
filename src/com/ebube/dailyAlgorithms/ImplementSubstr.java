package com.ebube.dailyAlgorithms;

public class ImplementSubstr {
    public static void main(String[] args) {
        System.out.println(strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else if (!haystack.contains(needle)) {
            return -1;
        }

        return 0;
    }
}
