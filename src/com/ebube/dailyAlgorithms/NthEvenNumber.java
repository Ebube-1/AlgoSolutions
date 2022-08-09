package com.ebube.dailyAlgorithms;


// 0 - 1st
//4 - 3rd
//return nth even


public class NthEvenNumber {
    public static void main(String[] args) {
        System.out.println(nthEven(5));
    }

    public static int nthEven(int n) {
        return (n - 1) * 2;
    }
}
