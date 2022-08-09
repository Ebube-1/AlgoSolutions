package com.ebube.dailyAlgorithms;
//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd,
// return the middle character. If the word's length is even, return the middle 2 characters.
//#Examples:
//
//Kata.getMiddle("test") should return "es"
//Kata.getMiddle("testing") should return "t"
//Kata.getMiddle("middle") should return "dd"
//Kata.getMiddle("A") should return "A"
//#Input
//A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
//#Output
//The middle character(s) of the word represented as a string.
public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle1("Decagono"));
    }
//    public static String getMiddle(String word) {
//        String result = "";
//        char middleCharacter = word.charAt(word.length()/2);
//        System.out.println(middleCharacter);
//        if(word.length() % 2 == 0) {
//            System.out.println( word.charAt(word.length()/2) );
//        }
//        return resulti;
//    }

    public static String getMiddle1(String word) {
        //Code goes here!
        int index = word.length() / 2;
        if (word.length() <= 2) return word;
        else if (word.length() % 2 == 0) {
            return word.substring(index - 1, index + 1);
        }
        return word.substring(index, index + 1);
    }


    //method 2
//    public static String getMiddleII(String word) {
//        int index = word.length() / 2;
//        return word.length()%2 == 0 ? word.substring(index -1, index + 1) : word.substring(index, index +1);
//    }
//    //method 3
//    public static String getMiddleIII(String word) {
//        int index = word.length() / 2;
//        if (word.length() % 2 == 1) {
//            return Character.toString(word.charAt(index));
//        }
//        return Character.toString(word.charAt(index -1)) + Character.toString(word.charAt(index));
//    }
}
