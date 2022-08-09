package com.ebube.dailyAlgorithms;

//Input: nums = [1,3,5,4,7]
//Output: 3
//Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
//Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7
// are separated by element 4.
public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[] {1,3,5,4,7,6}));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int anchor = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i -1] >= nums[i]) {
                anchor = i;
            } else{
                count = Math.max(count, i - anchor + 1);
            }
        }
        return count;
    }
}
