package com.ebube.dailyAlgorithms;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//
//
//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of parentheses only '()[]{}'.only


//CHECK CODE FOR ERROR

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    public static void main(String[] args) {

        System.out.println(isValid("(){}[]"));
    }


    public static boolean isValid(String s) {
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')' ||
                s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '{'
                || s.length() % 2 != 0 || s.length() < 2) {
            return false;
        }

        List<Character> braces = new ArrayList<>();

        char[] bracket = s.toCharArray();

        for (int i = 0; i < bracket.length; i++) {
            if (bracket[i] == '(' || bracket[i] == '{' || bracket[i] == '[') {
                braces.add(bracket[i]);
            } else if (bracket[i] == ')' && bracket[i - 1] == '(') {
                braces.remove(i - 1);
            } else if (bracket[i] == '}' && bracket[i - 1] == '{') {
                braces.remove((i - 1));
            } else if (bracket[i] == ']' && bracket[i - 1] == '[') {
                braces.remove(i - 1);
            } else {
                return false;
            }

        }
        return true;
    }
}
