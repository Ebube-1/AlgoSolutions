package com.ebube.dailyAlgorithms;

import java.math.BigInteger;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        System.out.println(multiplyStrings("33","2"));
    }
    public static String multiplyStrings(String s1,String s2){
        BigInteger s1Num = new BigInteger(s1);
        BigInteger s2Num = new BigInteger(s2);

        BigInteger result = s1Num.multiply(s2Num);
        String resultString = String.valueOf(result);

        return resultString;
    }
}
