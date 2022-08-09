package com.ebube.dailyAlgorithms;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HelpTheFruitGuy {
    public static void main(String[] args) {
        String[] indiFruit = {"banana", "rottenMango", "rottenOranges", "pawpaw"};
        System.out.println(removeRotten(indiFruit));
    }


    public static String[] removeRotten(String[] fruitBasket) {
        List<String> str = new ArrayList<>(Arrays.asList(fruitBasket));
        if (str.size() == 0) {
            return new String[0];
        }

        for (int i = 0; i < str.size(); i++) {

            if (str.get(i).contains("rotten")) {
                str.set(i, str.get(i).substring(6).toLowerCase());
            }
        }
        String[] arr = str.toArray(new String[0]);

        return arr;
    }
}
