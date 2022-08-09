package com.ebube.dailyAlgorithms;

import java.util.Arrays;
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class RotateArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(a, 0, 4)));

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        //if(nums == null || k < 0 )
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
        return nums;
    }


    //nums = [1,2,3,4,5,6,7], k = 3
    public static int[] rotateI(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        return result;
    }


    public static int[] reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
             start++;
            end--;
        }
        return arr;
    }

}

