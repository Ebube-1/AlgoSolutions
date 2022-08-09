package com.ebube.dailyAlgorithms;

import java.util.Arrays;
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the
//first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }


    public static int removeDuplicates(int[] nums) {
        int result = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]) {
                nums[i] = 101;
            } else if(nums[i] != nums[i+1]){
                result++;
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        return result;
    }


    public static int removeDuplicates1(int[] nums) {
        int j = 1;

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] != nums[i+1]){
                j++;}
                else {nums[i] = 101;
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        return j;
    }

    public static int removeDuplicates11(int[] nums) {
        int count = 1;
        for(int i = 0; i< nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                count++;
            } else nums[i] = 101;
        }
        Arrays.sort(nums);

        return count;
    }
}
