package com.ebube.dailyAlgorithms;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {

        String str = s.trim();
        String[] strArr = str.split(" ");
        String lastWord = strArr [strArr.length - 1];

        return lastWord.length();
    }
}
