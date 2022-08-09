package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java2Blog {
    public static void main(String[] args) {
//        System.out.println(reverseStr("hello people"));
//        System.out.println(factorial(4));
//        System.out.println(sumOfDigits(123456));
//        System.out.println(power(2, 2));
//        System.out.println(GCD(8,4));
//        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(arr));
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        System.out.println(compareTriplets(a,b));



    }

    //5 6 7
    //3 6 10

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int aCount = 0;
        int bCount = 0;

        for(int i = 0; i < a.size(); i++){
                if (a.get(i) != b.get(i) && a.get(i) > b.get(i)) aCount++;
            if (a.get(i) != b.get(i) && a.get(i) < b.get(i)) bCount++;
        }

        result.add(aCount);
        result.add(bCount);
        return result;
    }


    //[0,0,1,1,1,2,2,3,3,4]
    //[0,1,2,3,4,_,_,_,_,_]
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == nums[i+1]){
               nums[i] = 101;
            } else if(nums[i] != nums[i+1]){
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        return count;
    }

    //recursion

    public static int fib(int n) {
         if(n <= 1){
             return n;
         }
        return fib(n - 1) + fib(n - 2);
    }

    public static int GCD (int num, int den){
        int result = 1;
        if(den == 0) return num;
        result = GCD(den, num % den);

        return result;
    }

    public static int power(int base, int pow) {
        int result = 0;
        if(pow < 0){
            return -1;
        }
        if (pow == 0) {
            return 1;
        }
        result = base * power(base, pow - 1);

        return result;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        if (num == 0 || num < 0) {
            return num;
        }
        sum = (num % 10) + sumOfDigits(num / 10);

        return sum;
    }

    public static int factorial(int num) {
        if (num < 1) return -1;
        if (num == 1 || num == 0) return 1;
        return num * factorial(num - 1);
    }

    public static String reverseStr(String rvr) {
        String result = "";
        for (int i = rvr.length() - 1; i >= 0; i--) {
            result += rvr.charAt(i);
        }
        return result.trim();
    }
}

