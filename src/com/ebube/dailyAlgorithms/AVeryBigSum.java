package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.List;

//1 2 3
//4 5 6
//9 8 9
public class AVeryBigSum {
    public static void main(String[] args) {
        List<List<Integer>> total = new ArrayList<>();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(4);
        b.add(5);
        b.add(6);

        c.add(9);
        c.add(8);
        c.add(9);

        total.add(a);
        total.add(b);
        total.add(c);
        System.out.println(diagonalDifference1(total));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;

            int a =arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
            int b =arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);

            result = a - b;

        return Math.abs(result);
    }

    public static int diagonalDifference1(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for(int i = 0; i < arr.size(); i++){
            firstDiagonal += arr.get(i).get(i);
        }
        for(int i = 0; i < arr.size(); i++){
            secondDiagonal += arr.get(i).get(arr.size() - (1 + i));
        }

        return Math.abs(firstDiagonal- secondDiagonal);
    }

    public static long aVeryBigSum(List<Long> ar) {
        long result = 0;
        for(int i = 0; i < ar.size(); i++){
            result += ar.get(i);
        }
        return result;
    }


}
