package com.ebube.dailyAlgorithms;

import java.lang.reflect.Array;
import java.util.*;

public class UnderstandingDataStructures {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>();
       map.put(2,"mosh");
       map.put(3,"love");
       map.put(4,"dave");
       map.put(5,"josh");
        //System.out.println(map);

        map.replace(3,"love","hate");

        for(Map.Entry<Integer, String > item : map.entrySet()){
            System.out.println(item);
        }




//        System.out.println(countVowels("helloworld"));
//        System.out.println(reverse1("mosh hammedani videos"));
//        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
//        System.out.println(areRotations("ABCD", "CBDA"));
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));

    }



    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if( target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }



    public static int countVowels(String str){
        if(str == null) return 0;
        int count = 0;
        String vowels = "aeiou";
        for(char word : str.toLowerCase().toCharArray()){
            if (vowels.indexOf(word) != -1){
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str){
        StringBuilder result = new StringBuilder();
        String[] word = str.split(" ");
        for(int i = word.length -1; i >=0; i--){
            result.append(word[i] + " ");
        }
        return result.toString().trim();
    }

    public static String reverse1(String str) {
        String result = "";
        String[] word = str.split(" ");
        Collections.reverse(Arrays.asList(word));
        result = String.join(" ", word);

        return result;
    }


    public static String toJadenCase(String phrase) {
        String result = "";
        if( phrase == null || phrase.isEmpty()) return null;
        String[] word = phrase.split(" ");

        for(String each : word){
            result += each.substring(0,1).toUpperCase() + each.substring(1) + " ";
        }

        return result.trim();
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;

        if(str1.length() != str2.length() )
            return false;
        if(!(str1 + str1).contains(str2)){
            return false;
        }
        return true;
    }


}
