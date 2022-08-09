package com.ebube.dailyAlgorithms;

//This is a staircase of size :
//
//   #
//  ##
// ###
//####
//Its base and height are both equal to . It is drawn using # symbols and spaces.
// The last line is not preceded by any spaces.
//
//Write a program that prints a staircase of size .
public class StairCase {

    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {
        String ans = "";
        for (int i = 1; i <= n; i++) {
            ans = " ".repeat(n - i) + "#".repeat(i);
            System.out.println(ans);
        }
    }
}
