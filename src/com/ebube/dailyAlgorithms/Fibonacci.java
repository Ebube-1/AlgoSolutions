package com.ebube.dailyAlgorithms;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(6));
    }

    public static long fibonacci(int n){
        long[] fibonacciCache = new long[n + 1];
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
