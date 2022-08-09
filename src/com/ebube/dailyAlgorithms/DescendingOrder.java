package com.ebube.dailyAlgorithms;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(145263));
        int[] arr = {3, 0, 1};

    }

    public static int sortDesc(final int num) {
        String numS = String.valueOf(num);
        char[] numChar = numS.toCharArray();
        String str = "";

        Arrays.sort(numChar);

        for (int i = numChar.length - 1; i >= 0; i--) {
            str += numChar[i];
        }

        return Integer.parseInt(str);
    }

}
