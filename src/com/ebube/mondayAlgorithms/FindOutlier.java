package com.ebube.mondayAlgorithms;

import java.util.ArrayList;

public class FindOutlier {
    public static void main(String[] args) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        ans.add(160);
//        ans.add(3);
//        ans.add(1719);
//        ans.add(19);
//        ans.add(13);
//        ans.add(-21);
//
//        System.out.println(findOutlier(ans));

        int[] arr = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(find(arr));

    }
    public static int find(int[] integers){
        int evenCount = 0;
        int oddCount = 0;
        int even = 0;
        int odd = 0;

        for(int i = 0; i < integers.length; i++){
            if(integers[i] % 2 == 0) {
                evenCount++;
                even = integers[i];
            } else {
                oddCount++;
                odd = integers[i];
            }
        }

        if( evenCount == 1) return even;
        return odd;
    }


    public static int findOutlier(ArrayList<Integer> integers) {
        int evenCount = 0;
        int oddCount = 0;
        int even = 0;
        int odd = 0;

        for(int i = 0; i< integers.size(); i++) {
            if(integers.get(i) % 2 == 0) {
                evenCount++;
                even = integers.get(i);
            } else{
                oddCount++;
                odd = integers.get(i);
            }
        }
        if(evenCount == 1) return even;

        return odd;
    }





    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i < n; i++){
            if(n % i == 0) result.add(i);
        }
        return result;
    }
}
