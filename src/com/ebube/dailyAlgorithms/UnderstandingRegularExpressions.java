package com.ebube.dailyAlgorithms;
import java.util.regex.*;

public class UnderstandingRegularExpressions {
    //[A-Za-z] [^abc] [a-d[m-p]] [a-z&&[^m-p]]
    //x? occurs once or not at all
    //x+ occurs more than once
    //x* occurs 0 or more times
    //x{n} occurs n times
    //x{n,} occurs n or more times
    //x{x, y} occurs at least x times but less than y times
    //. any character
    // \d represents any digit
    // \D reps any non digit
    // \s reps white space
    // \S non white  char
    //w it can be a word character
    //W non word char
    //b any boundary
    //B non word boundary
    //[...] matches any single char in the string
    //[^...] does not match any char in the string
    //\A begining of the entire string
    // \z end of the entire string
    // a| b matches either a or b
    //^matches char at the beginning of string


    public static void main(String[] args) {
        String str = "i am a string";
        String yourStr = str.replaceAll("i","u");
        System.out.println(yourStr);


        String alpha = "abcdeejeff12ghabcdiiikl99gabcdeee";
        System.out.println(alpha.replaceAll(".","Y"));
        System.out.println(alpha.replaceAll("^abcdeee","YYY"));

        System.out.println(alpha.matches("^hello"));
        System.out.println(alpha.matches("^abcdeeeff12ghiiikl99gabcdeee"));

        System.out.println(alpha.replaceAll("gabcdeee$", "YYY"));
        System.out.println(alpha.replaceAll("[aei]",""));
        System.out.println(alpha.replaceAll("[aei][fj]","X"));

        System.out.println("Harry".replaceAll("[Hh]arry","harry"));
        String newAlpha = "abcdeejeff12ghabcdiiikl99gabcdeee";
        //matches all char that are not e and j
        System.out.println(newAlpha.replaceAll("[^ej]","X"));

        System.out.println(newAlpha.replaceAll("[a-fA-F3-8]","X"));
        //removes letter casing
        System.out.println(newAlpha.replaceAll("(?i)[a-f3-8]","X"));
        //removes digits
        System.out.println(newAlpha.replaceAll("\\d","X"));
        //removes non digits
        System.out.println(newAlpha.replaceAll("\\D","X"));
        //removes whitespace

        String alphanumeric = "i am a w word    with white    space in  between   ";
        System.out.println(alphanumeric.replaceAll("\\s",""));
        System.out.println(alphanumeric.replaceAll("\\b","X"));

        String word = "youuu youtube Youuuu youuu you u yuuuu Youuu";
        //System.out.println(word.replaceAll("you+","").replaceAll("\\s","X"));
        System.out.println(word.replaceAll("(?i)you+", "X"));

        //or operator
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
        String tvtest = "tstvtkt";
        String result = "t[^v]";

        String challenge4 = "Replace all blanks with underscore";
        String result1 = challenge4.replaceAll("[\\s]", "_");
        System.out.println(result1);

        String challenge5 = "aaabcccccccdDddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("(?i)[a-g]+"));
        //match the string exactly
        System.out.println(challenge5.matches("(?i)^a{3}bc{7}d{4}ef{3}g$"));
        String challenge7 = "abcd.135";
        System.out.println(match(challenge7));
        String challenge8 = "";
        String challenge12 = "11111";
        System.out.println(challenge12.matches("\\d{5}"));
        System.out.println("=========================");
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}\\-\\d{4}$"));

    }

    public static boolean match(String word){
        return word.matches("^(?i)[a-z]+\\.[0-9]+$");
    }

}























