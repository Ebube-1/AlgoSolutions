package com.ebube.dailyAlgorithms;

//Complete the solution so that it reverses all of the words within the string passed in.
//
//Example:
//
//"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }

    public static String reverseWords(String str) {
        String[] newArr = str.split(" ");
        String result = "";
        for (int i = newArr.length - 1; i >= 0; i--) {
            result += newArr[i] + " ";
        }

        return result.trim();
    }
}