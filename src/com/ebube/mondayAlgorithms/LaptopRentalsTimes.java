package com.ebube.mondayAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


//You're given a list of time intervals during which students at a school need a laptop.
// These time intervals are represented by pairs of integers [start, end], where 0 <= start < end.
// However, start and end don't represent real times; therefore, they may be greater than 24.
//
//No two students can use a laptop at the same time, but immediately after a student is done using a laptop,
// another student can use that same laptop. For example, if one student rents a laptop during the time interval [0, 2],
// another student can rent the same laptop during any time interval starting with 2.
//
//Write a function that returns the minimum number of laptops that the school needs to rent such that all students
// will always have access to a laptop when they need one.
//
//Challenge.laptopRentals(times)
//Parameters
//times: List<Integer[]> - A 2D array containing the times the student would require a laptop.
//
//Return Value
//Integer - Minimum number of laptops the school needs to rent.
//
//Examples
//times	                                        Return Value
//[[0,2],[1,4],[4,6],[0,4],[7,8],[9,11],[3,10]]	    3
//[[0,4],[2,3],[2,3],[2,3]]	                        4
//[[1,5],[5,6],[6,7],[7,9]]	                        1
public class LaptopRentalsTimes {
    public static void main(String[] args) {

    }
    public static Integer laptopAvailable2(List<List<Integer>> times) {
        int count = 1;
        int size = times.size();
        List<List<Integer>> sortedTime = sortList(times);
        for (int i = 0; i < size-1; i++) {
            if (sortedTime.get(i).get(0) < sortedTime.get(i+1).get(0) && Objects.equals(sortedTime.get(i).get(1), sortedTime.get(i + 1).get(0))) {
                System.out.println("a -> "+sortedTime);
                return count;
            }
            int temp = (sortedTime.get(i).get(1) > sortedTime.get(i + 1).get(0)) ? count++ : count--;
        }
        System.out.println("b -> "+sortedTime);
        return count;
    }

    static List<List<Integer>> sortList(List<List<Integer>> items) {
        List<List<Integer>> sorted = new ArrayList<>(items);
        for (int i=0; i < sorted.size(); i++) {
            for (int j=i+1; j < sorted.size(); j++) {
                if (sorted.get(i).get(0) > sorted.get(j).get(0)) {
                    List<Integer> temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }
}
