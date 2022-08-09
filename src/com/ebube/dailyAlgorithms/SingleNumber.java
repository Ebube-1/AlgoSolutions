package com.ebube.dailyAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] n = {2, 2, 1};
        //System.out.println(singleNumber(n));
        System.out.println(ispar("{([])}"));
    }

    public static boolean ispar(String hello) {

        if (hello.length() % 2 == 1) return false;
        Map<String, Integer> map = new HashMap<>();
//        for(String each : hello.split("")){
//            //map.merge(each,1,Integer::sum);
//            if(map.containsKey("[") || map.containsKey("{") || map.containsKey("("))
//                map.put(map.put(),1);
//
//        }
        System.out.println(map.entrySet());

//        for(Map.Entry<String, Integer> a: map.entrySet()){
//
//        }

        return false;
    }


//    public static int singleNumber(int[] nums) {
//
//        if (nums.length == 0) return nums[0];
//        Arrays.sort(nums);
//        Map<Integer, Integer> maps = new HashMap<>();
//        for (int number : nums) {
//            maps.merge(number, 1, Integer::sum);
//        }
//        System.out.println(maps.entrySet());
//
//        int result = 0;
//        for(Map.Entry entry : maps.entrySet()){
//            if(entry.getValue().equals(1)){
//                result = (int) entry.getKey();
//            }
//        }
//        return result;
//    }
}

//    public static int singleNumber(int[] nums) {
//        int result = 0;
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length; i = i++){
//            if(nums[i] == nums[i+1]){
//                nums[i] =
//            }
//        }
//        return result;
//    }


