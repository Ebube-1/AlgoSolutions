package com.ebube.dailyAlgorithms;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String result = "";
        String backward = String.valueOf(x);
        for (int i = backward.length() - 1; i >= 0; i--) {
            result += backward.charAt(i);
        }
        ;
        if (result.equals(backward)) {
            return true;
        }
        return false;

    }
}
