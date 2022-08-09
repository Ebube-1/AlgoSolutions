package com.ebube.dailyAlgorithms;


public class SplitInParts {

    //Split the below string into other strings of size #3
    //
    //'supercalifragilisticexpialidocious'
    //
    //Will return a new string
    //'sup erc ali fra gil ist ice xpi ali doc iou s'

    public static void main(String[] args) {
        System.out.println(splitInParts1("supercalifragilisticexpialidocious", 3));
    }


    public static String splitInParts(String s, int partLength) {
        if (s.length() <= partLength)
            return s;

        return s.substring(0, partLength) + " " + splitInParts(s.substring(partLength), partLength);
    }

    public static String splitInParts1(String s, int partLength) {
        if (s.length() <= partLength) return s;
        String ans = "";

        int count = -1;
        for (int i = 0; i < s.length(); i++) {

            count++;
            if (count != partLength) {
                ans += s.charAt(i);
            } else {
                ans += " " + s.charAt(i);
                count = 0;
            }
        }

        return ans;
    }

}

