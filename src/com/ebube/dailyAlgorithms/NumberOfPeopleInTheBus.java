package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});

        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int peopleInBus = 0;
        int peopleOutBus = 0;

        for(int i = 0; i < stops.size(); i++){
            for(int j = 0; j <1; j++){
                peopleInBus += stops.get(i)[0];
                peopleOutBus += stops.get(i)[1];
            }
        }
        return peopleInBus - peopleOutBus;
    }
}
