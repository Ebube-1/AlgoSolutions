package com.ebube.dailyAlgorithms;

//Example 1*
//SubstringTest("Something","Fun"); //Returns false
//
//*Example 2*
//SubstringTest("Something","Home"); //Returns true
//In the above example, example 2 returns true because both of the inputs contain the substring "me". (soMEthing and hoME)
//In example 1, the method will return false because something and fun contain no common substrings.
// (We do not count the 'n' as a substring in this Kata because it is only 1 character long)
public class CommonSubstrings {
    public static void main(String[] args) {
        System.out.println(SubstringTest("Something", "Fun"));
    }

    public static boolean SubstringTest(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str2.contains("" + str1.charAt(i) + str1.charAt(i + 1))) return true;
        }
        return false;
    }
}
