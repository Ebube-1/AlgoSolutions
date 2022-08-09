package com.ebube.dailyAlgorithms;


//"coffee", "eecoff" => 2
//"eecoff", "coffee" => 4
//"moose", "Moose" => -1
//"isn't", "'tisn" => 2
//"Esham", "Esham" => 0
//"dog", "god" => -1
public class CalculateStringRotation {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee","eecoff"));
    }

    public static int shiftedDiff(String first, String second){
        if (first.length() != second.length()) return - 1;
        String combined = second + second; // coffeecoffee
        return combined.indexOf(first);
    }
}
