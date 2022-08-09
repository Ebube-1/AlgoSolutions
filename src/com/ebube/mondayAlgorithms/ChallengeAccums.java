package com.ebube.mondayAlgorithms;


import java.util.Locale;

//"RqaEzty"	"R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
public class ChallengeAccums {
    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
    }
    public static String accum(String str) {

        String str1 = "";
        String[] strArr = str.toLowerCase().split("");
        for (int i = 0; i < strArr.length; i++) {
            str1 += strArr[i].toUpperCase() + strArr[i].repeat(i) + "-";
        }
        StringBuilder sb = new StringBuilder(str1);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
//
//    public static String accum1(String str) {
//        String str1 = "";
//        StringBuilder sb = new StringBuilder(str);
//
//        return "";
//    }
}
