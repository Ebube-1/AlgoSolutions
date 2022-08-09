package com.ebube.dailyAlgorithms;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindromeI(int x) {
        String num = String.valueOf(x);
        String result = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            result += num.charAt(i);
        }
        if (result.equals(num)) return true;

        return false;
    }

    public static boolean isPalindrome(int x) {

        return false;
    }


}
