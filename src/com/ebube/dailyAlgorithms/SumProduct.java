package com.ebube.dailyAlgorithms;

public class SumProduct {
    public static void main(String[] args) {
        System.out.println(prodSum(123456));
    }

    //12356
    public static int prodSum(int number){
        String numStr = String.valueOf(number);
        int prod = 1;
        int sum = 0;

        if(numStr.length() == 1){
            return number;
        }
        for(int i = 0; i < numStr.length(); i++){
            prod *= Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }

        return prod - sum;
    }

}
