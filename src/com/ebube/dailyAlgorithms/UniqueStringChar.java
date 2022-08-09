package com.ebube.dailyAlgorithms;


//In this Kata, you will be given two strings a and b and your task will be to return the characters
// that are not common in the two strings.
//
//For example:
//
//solve("xyab","xzca") = "ybzc"
//--The first string has 'yb' which is not in the second string.
//--The second string has 'zc' which is not in the first string.


//public class UniqueStringChar {
//    public static String solve(String a, String b){
//        String ans = "";
//        for(char strChar : (a + b).toCharArray()){
//            if(a.indexOf(strChar) == -1 || b.indexOf(strChar) == -1)
//                ans += strChar;
//        }
//        return ans;
//    }


//public class UniqueStringChar {
//    public static String solve(String a, String b) {
//        String [] aArr = a.split("");
//        String [] bArr = a.split("");
//
//        String result = "";
//        for(int i = 0; i < aArr.length; i++){
//            if(b.contains(aArr[i]))
//        }
//        return a;
//    }
//}


class Solution {
    public static String solve(String a, String b) {
        //..
        String[] aArr = a.split("");
        String[] bArr = b.split("");
        String result = "";
        for (int i = 0; i < aArr.length; i++) {
            if (!b.contains(aArr[i])) {
                result += aArr[i];
            }
        }
        for (int i = 0; i < bArr.length; i++) {
            if (!a.contains(bArr[i])) {
                result += bArr[i];
            }
        }
        return result;
    }
}


//public class UniqueStringChar {
//    public static void main(String[] args) {
//
//    }
//    public static String solve(String a, String b) {
//
//        return a;
//    }
//}