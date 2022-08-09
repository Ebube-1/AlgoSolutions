package com.ebube.dailyAlgorithms;

public class ILoveYouALittleALotPassionatelyNotAtAll {
    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(7));
    }
    public static String howMuchILoveYou(int nb_petals) {
        if(nb_petals % 6 == 1) return "I love you";
        if(nb_petals % 6 == 2) return "a little";
        if(nb_petals %6 ==3) return "a lot";
        if(nb_petals%6 ==4) return  "passionately";
        if(nb_petals%6 == 5) return  "madly";
        else return "not at all";
    }
}
