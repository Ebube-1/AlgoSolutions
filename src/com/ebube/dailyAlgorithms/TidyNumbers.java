package com.ebube.dailyAlgorithms;


import java.util.Arrays;

//A Tidy number is a number whose digits are in non-decreasing order.
public class TidyNumbers {
    public static void main(String[] args) {
        System.out.println(tidyNumber(1235));
    }

    public static boolean tidyNumber(int number) {
        String numStr = "" + number;
        String[] strArr = numStr.split("");
        Arrays.sort(strArr);
        return String.join("", strArr).equals(numStr);

    }

    public static boolean tidyNumbers1(int num) {

        int prev = 10;
        while (num != 0) {
            int rem = num % 10;
            num /= 10;
            if (rem > prev)
                return false;
            prev = rem;
        }

        return true;
    }
}



