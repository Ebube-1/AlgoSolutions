package com.ebube.mondayAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

//loop through
// find the largest no using
//if direction is east == right
//
//1, 3, 6, 7
public class SunsetViews {
    public static void main(String[] args) {
      //              0  1  2  3  4  5  6  7
        int[] arr = {3, 5, 4, 4, 3, 1, 3, 2}; // 0,1
        System.out.println(sunsetViews(arr, "WEST"));
    }


    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> ascend = new ArrayList<>();
        int smallest = Integer.MIN_VALUE;
        if(direction.equals("EAST")){
            int start = buildings.length -1;
            for(int i = start; i >= 0; i--){
                if(buildings[i] > smallest){
                    ascend.add(i);
                    smallest = buildings[i];
                }
            }
        }else{
            for(int i = 0; i < buildings.length; i++){
                if(buildings[i] > smallest){
                    ascend.add(i);
                    smallest = buildings[i];
                }
            }
        }
        Collections.sort(ascend);
        return ascend;
    }
}
