package com.ebube.dailyAlgorithms;

//Remove all exclamation marks from the end of words. Words are separated by a single space. There are no exclamation marks within a word.
//
//Examples
//remove("Hi!") === "Hi"
//remove("Hi!!!") === "Hi"
//remove("!Hi") === "!Hi"
//remove("!Hi!") === "!Hi"
//remove("Hi! Hi!") === "Hi Hi"
//remove("!!!Hi !!hi!!! !hi") === "!!!Hi !!hi !hi"



public class ExclamationMarksSeries {
    public static void main(String[] args) {
        System.out.println(removeBang("!!!Hi !!hi!!! !hi"));
    }

    public static String removeBang(String str) {
        if (str.length() == 0) return str;
        String ans = "";
        String[] str1 = str.split(" ");

        for (String a : str1) {
            while (a.charAt(a.length() - 1) == '!') {
                a = a.substring(0, a.length() - 1);
            }
            ans += a + " ";
        }
        return ans.trim();
    }

    public static String removeBang1(String str) {
        String ans = "";
        String[] indiChar = str.split(" ");

        for(String i : indiChar){
            while( i.charAt(i.length() - 1) == '!')  {
                i = i.substring(0, i.length()-1);
            }
            ans += i + " ";
        }
        return ans.trim();
    }

}
