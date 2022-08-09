package com.ebube.dailyAlgorithms;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] wordsArr = {"hello", "friend", "people"};
        System.out.println(smash(wordsArr));
        System.out.println(smashII(wordsArr));
    }

    public static String smash(String... words) {
        String result = "";
        for (String each : words) {
            result += each + " ";

        }
        return result.trim();
    }

    //using an inbuilt method
    public static String smashII(String... words) {

        return String.join(" ", words);
    }
}
