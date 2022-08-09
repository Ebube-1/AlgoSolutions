package com.ebube.dailyAlgorithms;

public class ConsecutiveString {
    public static void main(String[] args) {
        String[] strarr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        System.out.println(LongestConsec(strarr, 2));
    }

    public static String LongestConsec(String[] strarr, int k) {
        if (strarr.length < k || k <= 0) {
            return "";
        } else {
            String str = "";
            for (int i = 0; i < strarr.length; i++) {
                int c = i;
                String newStr = "";
                while (c < k) {
                    if (c <= strarr.length - 1) {
                        newStr += strarr[c];
                        c++;
                    } else break;
                }
                if (newStr.length() > str.length()) {
                    str = newStr;
                }
                k++;
            }
            return str;
        }
    }

    public static String longestConsec1(String[] strarr, int k) {
        // your code
        if (strarr.length < k || k <= 0) return "";

        int count = 0;
        String result = "";

        for (int i = 0; i <= strarr.length - k; i++) {

            String temp = "";
            for (int j = i; j < i + k; j++) {

                temp += strarr[j];
            }

            if (temp.length() > count) {
                result = temp;
                count = temp.length();
            }


        }
        return result;
    }
}


