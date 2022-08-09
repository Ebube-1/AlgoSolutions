package com.ebube.dailyAlgorithms;

//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.
//
//Example
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

import java.util.Arrays;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(result));
    }

    public static String createPhoneNumber(int[] numbers) {

        StringBuffer str = new StringBuffer("(");
        for (int i = 0; i < 10; i++) {
            str.append(String.valueOf(numbers[i]));
            if (i == 2)
                str.append(") ");
            if (i == 5)
                str.append("-");
        }

        return str.toString();
    }
}



