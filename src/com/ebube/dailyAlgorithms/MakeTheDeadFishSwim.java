package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeTheDeadFishSwim {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }

    public static int[] parse(String data) {

        List<Integer> result = new ArrayList<>();
        String[] dataArr = data.split("");
        int counter = 0;

        for (String ch : dataArr) {
            switch (ch) {
                case "i":
                    counter++;
                    break;
                case "d":
                    counter--;
                    break;
                case "s":
                    counter*=counter;
                    break;
                case "o":
                    result.add(counter);
                    break;
            }
        }

        int[] resultArr = new int [result.size()];
//        int count = 0;
//
//        for(Integer each : result){
//            resultArr[count] = each;
//            count++;

            for(int i = 0; i < result.size(); i++){
                resultArr[i] = result.get(i);
            }

        return resultArr;
        }

    }

