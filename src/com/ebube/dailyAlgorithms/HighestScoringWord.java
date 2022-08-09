package com.ebube.dailyAlgorithms;


//Given a string of words, you need to find the highest scoring word.
//
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//You need to return the highest scoring word as a string.
//
//If two words score the same, return the word that appears earliest in the original string.
//
//All letters will be lowercase and all inputs will be valid.
//assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
public class HighestScoringWord {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }

    public static String high(String s) {
        String alphabets = " abcdefghijklmnopqrstuvwxyz";
        //String [] arr = s.split(" ");
        int max = 0;
        String word = "";

        for (String value : s.split(" ")) {

            int count = 0;
            for (String a : value.split("")) {
                count += alphabets.indexOf(a);

                if (count > max) {
                    max = count;
                    word = value;
                }
            }
        }
        return word;
    }
}
