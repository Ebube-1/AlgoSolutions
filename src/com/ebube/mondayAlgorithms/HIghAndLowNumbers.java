package com.ebube.mondayAlgorithms;


import java.util.Arrays;

//Input	Output
//"1 2 3 4 5"	"5 1"
//"1 2 -3 4 5"	"5 -3"
//"1 9 3 4 -5"	"9 -5"
public class HIghAndLowNumbers {
    public static void main(String[] args) {
        System.out.println(highAndLow("5"));
    }

    public static String highAndLowI(String numbers) {
        int result = 0;
        int result1 = 0;
        String[] numberArr = numbers.split(" ");
        Arrays.sort(numberArr);

        System.out.println(Arrays.toString(numberArr));
        result1 = Integer.parseInt(numberArr[0]);
        result = Integer.parseInt(numberArr[numberArr.length -1]);

        return result + " " + result1;
    }

    public static String highAndLow(String numbers) {
        String[] numberArr = numbers.split(" ");
        String result =  "";
        int max = 0;
        int min = Integer.parseInt(numberArr[0]);
        for(int i = 0; i< numberArr.length; i++){
            if(Integer.parseInt(numberArr[i]) > max) max = Integer.parseInt(numberArr[i]);
            if(Integer.parseInt(numberArr[i]) < min) min = Integer.parseInt(numberArr[i]);
        }

        result = max + " " + min;
        return result;
    }
}
