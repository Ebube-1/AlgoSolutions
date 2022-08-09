package com.ebube.dailyAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 1, 4, 7};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

//    public static int[] getTwoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (target - numbers[i] == numbers[j]) {
//                    result[0] = i + 1;
//                    result[1] = j + 1;
//                }
//            }
//        }
//        return result;
//    }

    public static int[] twoSum(int[] nums, int target) {
      int [] ans = new int[2];

      Map<Integer, Integer> newMap = new HashMap<>();
      for(int i = 0; i< nums.length; i++){
          int help = target - nums[i];
          if(newMap.containsKey(help)){
              ans[0]=i;
              ans[1]= newMap.get(target - nums[i]);
          }
          newMap.put(nums[i], i );
      }
      return ans;
    }



}
