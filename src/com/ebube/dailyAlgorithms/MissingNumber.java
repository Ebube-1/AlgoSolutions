package com.ebube.dailyAlgorithms;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumberII(arr));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += i + 1;
            result -= nums[i];
        }
        return result;
    }


    public static int missingNumberII(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        result = len * (len + 1) / 2;
        return result - sum;
    }
}
