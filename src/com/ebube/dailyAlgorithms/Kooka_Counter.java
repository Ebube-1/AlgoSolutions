package com.ebube.dailyAlgorithms;

//The trick to counting kookaburras is to listen carefully
//
//The males sound like HaHaHa...
//
//The females sound like hahaha...
//
//And they always alternate male/female
//
//Examples
//ha = female => 1
//Ha = male => 1
//Haha = male + female => 2
//haHa = female + male => 2
//hahahahaha = female => 1
//hahahahahaHaHaHa = female + male => 2
//HaHaHahahaHaHa = male + female + male => 3

public class Kooka_Counter {
    public static void main(String[] args) {
        System.out.println(kookaCounter("hahaHaHahahahahahaHaHaHa"));
    }

    public static int kookaCounter(final String laughing) {
        if (laughing.equals("")) return 0;
        String s = "";
        int counter = 1;
        for (int i = 0; i < laughing.length(); i += 2) {
            s += laughing.charAt(i);
        }
        System.out.println(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                counter++;
            } else {
                continue;
            }
        }
        return counter;
    }

    public static int kookaCounter1(final String laughing) {
        return laughing.replaceAll("(ha)+", "1").replaceAll("(Ha)+", "1").length();
    }


}



































