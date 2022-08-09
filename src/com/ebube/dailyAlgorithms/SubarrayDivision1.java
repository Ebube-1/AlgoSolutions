package com.ebube.dailyAlgorithms;

import java.util.List;

public class SubarrayDivision1 {
    public static void main(String[] args) {

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        return d;
    }

    public static int birthday1(List<Integer> s, int d, int m) {

        int start = 0;
        int count = 0;
        int sum = 0;

        for(int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            if(i - start +1 == m) {
                if(sum == d) {
                    count++;
                }

                sum -= s.get(start);
                start++;
            }
        }
        return count;
    }
}
