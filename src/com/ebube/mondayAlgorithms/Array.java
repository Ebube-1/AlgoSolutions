package com.ebube.mondayAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.
//
//We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.

//On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
//On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.

//loop through arr +2
//add at each result and put into result
//return result into empty declared array
// then loop through result arr


class Challenge {
    public static void main(String[] args) {
        System.out.println(packArray(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))));
    }
    public static int packArray(ArrayList<Integer> integers) {

         int counter = 1;
         while (integers.size() > 1) {
             ArrayList<Integer> result = new ArrayList<>();
             if (counter % 2 == 0) {
                 for (int i = 0; i < integers.size() - 1; i+=2) {
                     result.add(integers.get(i) + integers.get(i + 1));
                 }
                 counter ++;
             } else {
                 for (int i = 0; i < integers.size() - 1; i+=2) {
                     result.add(integers.get(i) * integers.get(i + 1));
                 }
                 counter++;
             }
             integers = result;
         }

        return integers.get(0);
    }
}

