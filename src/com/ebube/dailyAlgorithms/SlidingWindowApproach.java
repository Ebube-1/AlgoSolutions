package com.ebube.dailyAlgorithms;


import java.util.Arrays;

//Given an array, find the average of all subArrays of ‘K’ contiguous elements in it.
//eg [1, 3, 5, 3, 6, 7, 8, 4, 9, 5, 1] k = 5
public class SlidingWindowApproach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int [] arr1 = {2, 1, 5, 1, 3, 2};
        System.out.println(Arrays.toString(contiguousArr(arr, 5)));
        System.out.println(findMaxSumSubArray(3, arr1));
    }

    //normal Approach
    public static double[] contiguousArr(int[] arr, int k) {
        double[] answer = new double[arr.length - k + 1];
        for(int i = 0; i <= arr.length - k; i++){
            double sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
                answer[i] = sum / k;
            }
        }

        return answer;
    }

    //Sliding window approach

//    public static double[] contiguousArr1(int[] arr, int k){
//        double[] ans = new double[arr.length - k + 1];
//        int windowSum = 0;
//        int windowStart = 0;
//        for(int windowEnd = 0; windowEnd <arr.length; windowEnd++){
//            if(windowEnd )
//        }
//
//        return new double[0];
//    }



    //   Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
    public static int findMaxSumSubArray(int k, int[] arr){
        int minValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - k + 1; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
                if(sum > minValue){
                    minValue = sum;
                }
            }
        }

        return minValue;
    }

    //Given an array of positive integers and a number ‘S,’
    // find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
    // Return 0 if no such subarray exists.

    //Input: [2, 1, 5, 2, 3, 2], S=7
    //Output: 2
    //Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is [5, 2].

//    Input: [2, 1, 5, 2, 8], S=7
//    Output: 1
//    Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is [8].

    public static int findMinSubArray1(int S, int[] arr){



        return S;
    }

}
