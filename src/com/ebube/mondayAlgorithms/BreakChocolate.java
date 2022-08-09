package com.ebube.mondayAlgorithms;

public class BreakChocolate {
    public static void main(String[] args) {
        System.out.println(breakChocolate(5, 5));
    }
    public static int breakChocolate(int n, int m) {
        if(n == 0 || m == 0) return 0;

        return (n * m) - 1;
    }
}
