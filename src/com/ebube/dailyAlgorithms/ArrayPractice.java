package com.ebube.dailyAlgorithms;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] ar = {1, 4, 6, 3, 8};
        System.out.println(Arrays.toString(traverseArray(ar)));
    }

    public static int[] traverseArray(int[] arr ){
        try{
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e){
            System.out.println("array no longer exists");
        }

        return arr;
    }


}
