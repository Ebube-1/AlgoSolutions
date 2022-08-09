package com.ebube.dailyAlgorithms;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("Ebube"));
        System.out.println(removeII("Innocent"));
    }

    public static String remove(String str) {
        String result = "";
        for(int i = 1; i < str.length() - 1; i++){
            result += str.charAt(i);
        }
        return result;
    }

    public static String removeII(String str) {
        return str.substring(1, str.length()-1);

    }
}
