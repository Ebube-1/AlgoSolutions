package com.ebube.dailyAlgorithms;


//You are given a string of letters and an array of numbers.
//The numbers indicate positions of letters that must be removed, in order, starting from the beginning of the array.
//After each removal the size of the string decreases (there is no empty space).
//Return the only letter left.
//
//Example:
//
//    str = "zbk", arr = {0, 1}
//    str = "bk", arr = {1}
//    str = "b", arr = {}
//    return "b"


public class LastSurvivor {
    public static String lastSurvivor1(String letters, int[] coords) {
        StringBuffer charWord = new StringBuffer(letters);
        for (int i : coords) {
            charWord.deleteCharAt(i);
        }
        return charWord.toString();
    }

}