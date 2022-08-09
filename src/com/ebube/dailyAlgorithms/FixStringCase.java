package com.ebube.dailyAlgorithms;

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(solve("CODe"));
    }

    public static String solve(final String str) {
        int count = 0;
        int countLow = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLow++;
            }
        }
        if (count > countLow) return str.toUpperCase();
        if (count < countLow) return str.toLowerCase();
        if (count == countLow) return str.toLowerCase();

        return str;
    }


    public static String solve1(final String str) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char charac : str.toCharArray()) {
            if (charac >= 97 && charac <= 122) lowerCaseCount++;
            if (charac >= 65 && charac <= 90) upperCaseCount++;
        }
        return (lowerCaseCount < upperCaseCount) ? str.toUpperCase() : str.toLowerCase();
    }

}


