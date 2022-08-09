package com.ebube.dailyAlgorithms;

public class LargestPairInASum {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 14, 2, 23, 19};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int num1 = arr.length;
        System.out.println(arr[num1 - 1] + arr[num1 - 2]);
    }
}
