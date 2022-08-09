package com.ebube.dailyAlgorithms;

//{String.valueOf(strArr.length)}
//wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
//split by words
//lopp through each word
//at index i, convert i to uppercase, the rest to lovercase
//2 loops needed
public class MexicanWave {
    public static void main(String[] args) {
        System.out.println(wave("hello"));
    }

    public static String[] wave(String str) {
        String[] strArr = str.split("");
        String result = "";
        String ansr = "";

        int i = 0;
        for (int j = 0; j < strArr.length; j++) {
            if (i == j) {
                ansr += strArr[j].toUpperCase() + str.substring(i + 1);
            } else if (i != j) {
                ansr += str.substring(0, strArr.length) + strArr[j].toUpperCase() + str.substring(j);
            }
            i++;
            result = ansr;
            System.out.println(result);
        }


        return new String[]{};
    }
}
