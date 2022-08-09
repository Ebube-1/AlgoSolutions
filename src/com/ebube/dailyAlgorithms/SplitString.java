package com.ebube.dailyAlgorithms;

public class SplitString {

    //StringSplit.solution("abc") // should return {"ab", "c_"}
    //StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
    public static void main(String[] args) {
        solution("aeioyy");
    }

    public static String[] solution(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            System.out.println(s.charAt(i));
        }

        return null;
    }
}
