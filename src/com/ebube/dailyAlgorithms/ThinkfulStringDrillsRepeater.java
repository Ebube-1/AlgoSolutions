package com.ebube.dailyAlgorithms;

public class ThinkfulStringDrillsRepeater {
    public static void main(String[] args) {
        System.out.println(repeat("a", 5));
    }
    public static String repeat(String string,long n){
        String result= "";
        for(int i = 0; i < n; i++){
            result += string;
        }
        return result;
    }
}
