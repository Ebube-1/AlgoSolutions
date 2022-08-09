package com.ebube.dailyAlgorithms;


//Your task in this kata is to implement a function that calculates the sum of the integers inside a string.
// For example, in the string
// "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog", the sum of the integers is 3635.

import java.util.Arrays;

public class SumOfIntergerInAString {
    public static void main(String[] args) {
        String s = "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog";
        System.out.println(sumOfIntegersInString(s));
    }

    public static int sumOfIntegersInString(String s) {
        String num = s.replaceAll("[^0-9]", " ");
        String[] numArr = num.split(" ");
        int sum = 0;
        for (String each : numArr) {
            if (!each.equals((" ")) && !each.equals("")) {
                sum += Integer.parseInt(each);
            }
        }
        return sum;
    }
}





