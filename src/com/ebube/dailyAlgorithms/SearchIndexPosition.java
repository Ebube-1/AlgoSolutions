package com.ebube.dailyAlgorithms;

public class SearchIndexPosition {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]) return i;
        }
        return nums.length;
    }
}
