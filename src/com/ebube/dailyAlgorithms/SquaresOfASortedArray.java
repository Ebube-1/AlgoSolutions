package com.ebube.dailyAlgorithms;


import java.util.Arrays;

//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] temArr = new int[nums.length];
        int sqr = 0;
        for(int each : nums){
            sqr = each * each;
            System.out.println(sqr);
            for(int i = 0; i < temArr.length; i++){
                temArr[i] = sqr;
            }
        }

        System.out.println(Arrays.toString(temArr));
        return nums;
    }
}
