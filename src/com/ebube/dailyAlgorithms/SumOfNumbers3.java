package com.ebube.dailyAlgorithms;

public class SumOfNumbers3 {
    public static void main(String[] args) {
        System.out.println(GetSum(5, 2));
    }

    public static int GetSum(int a, int b) {
        int result = 0;
        int temp = 0;
        if (a == b) {
            return a;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            result += i;
        }

        return result;
    }
}
