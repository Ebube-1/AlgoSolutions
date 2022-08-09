package com.ebube.dailyAlgorithms;

public class RepeatIt {
    public static void main(String[] args) {
        System.out.println(repeatString("hello", 3));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        String str = toRepeat.toString();
        String result = "";
        if (!toRepeat.equals(str)) return "Not a string";
        for (int i = 1; i <= n; i++) {
            result += toRepeat;
        }

        return result;
    }

    public static String repeatStringII(final Object toRepeat, final int n) {
        String some = "";
        if (!toRepeat.equals(toRepeat.toString())) return "Not a string";
        for (int i = 0; i < n; i++) {
            some += toRepeat;
        }
        return some;
    }
}























