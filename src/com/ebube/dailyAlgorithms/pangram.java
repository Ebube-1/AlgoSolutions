package com.ebube.dailyAlgorithms;

public class pangram {
    public static void main(String[] args) {
        String i = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams1(i));
    }

    public static String pangrams(String s) {
        return s.toLowerCase().replace(" ","").chars().distinct().count() == 26 ? "pangram" : "not pangram";
    }

    public static String pangrams1(String s) {
        String newStr = "";
        s = s.toLowerCase().replace(" ","");
        for(int i = 0; i <s.length(); i++){
            if(!newStr.contains(s.charAt(i) +"")){
                newStr += s.charAt(i)+"";
            }
        }
        return newStr.length() == 26 ? "pangram" : "not pangram";

    }
}
