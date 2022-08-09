package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given a string array words, return an array of all characters that show up in
// all strings within the words (including duplicates). You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]

//loop through the first word
//check if each letter in the first can be found the rest
//need another loop to check
//if found put letter in a declared string variable
//return string variable



public class FindCommonCharacters {
    public static void main(String[] args) {
        String [] commonChars = {"hello", "label", "roller"};
        System.out.println(commonChars);

        //convert array to array list
        //List<String>numList = new ArrayList<String>(Arrays.asList(numArray));
        //convert arraylist to array
        //numArray = numList.toArray(numArray);


    }
    public List<String> commonChars(String[] words) {
        String wordStr = Arrays.toString(words);

        int firstWord = wordStr.indexOf(0);




        return null;
    }
}
