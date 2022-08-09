package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class PointWordsVertically {
    public static void main(String[] args) {
        System.out.println(printVertically("TO BE OR NOT TO BE"));
    }

    public static List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] words = s.split(" ");

        int count = 0;
        for(String str : words){
            count = Math.max(str.length(), count);
        }


        for(int i = 0; i < count; i++){
            StringBuilder sb = new StringBuilder();
            for(String word: words){
                if(word.charAt(i) != ' '){
                    System.out.println(word);
                }
                sb.append(word.charAt(i));

            }

        }
        return list;
    }



}
