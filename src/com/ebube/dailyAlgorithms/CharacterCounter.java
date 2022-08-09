package com.ebube.dailyAlgorithms;

public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println(validateWord("abcabcd"));
    }

    public static boolean validateWord(String word) {
        int length = word.length();
        String[] wordArr = word.split("");
        String replaceFirst = word.replace(wordArr[0], "");
        int num = length - replaceFirst.length();

        for (int i = 1; i < wordArr.length; i++) {
            String replaceEach = word.replace(wordArr[i], "");
            int num1 = length - replaceEach.length();

            if (num != num1) return false;
        }
        return true;
    }
}
