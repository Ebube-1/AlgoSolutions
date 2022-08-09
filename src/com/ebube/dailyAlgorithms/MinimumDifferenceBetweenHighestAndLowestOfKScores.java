package com.ebube.dailyAlgorithms;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        int[] arr = {9,4,1,7};
        System.out.println(minimumDifference(arr, 2));
    }

    //0  1  2  3  4  5
    //1, 4, 6, 7, 8, 9
    public static int minimumDifference(int[] nums, int k) {
        int result = 100001;
        Arrays.sort(nums);
        for(int i = k - 1; i < nums.length; i++){
            int diff = nums[i] - nums[i - k + 1];
            result = Math.min(result, diff);
        }
        return result;
    }
}
