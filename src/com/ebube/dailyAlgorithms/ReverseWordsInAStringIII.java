package com.ebube.dailyAlgorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

//Input: s = "hello take LeetCode contest"
//Output: "olleh ekat edoCteeL tsetnoc"
public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWordsI("i must learn algorithms"));
    }
    public static String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length; i++){
            String[] indiWord = word[i].split("");
            for(int j = 0; j < indiWord.length /2; j++){    // mu st
                String temp = indiWord[j];
                indiWord[j] = indiWord[indiWord.length - 1 - j];
                indiWord[indiWord.length - 1 - j] = temp;
            }
            String result = String.join("", indiWord);
            System.out.println(result);
            sb.append(result + " ");
        }

        return sb.toString().trim();
    }

    public static String reverseWordsI(String s) {
        return Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
