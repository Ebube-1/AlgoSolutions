package com.ebube.dailyAlgorithms;



//1234567891011121314151617
public class HowManyPagesInABook {
    public static void main(String[] args) {
        System.out.println(amountOfPages(25));
    }
    public static int amountOfPages(int summary) {
        //String str = ""+ summary;
        String result = "";
        for(int i = 1; i <= summary; i++){
            result = result + i;
            if (result.length() == summary) return i;
        }
        return -1;
    }





}
