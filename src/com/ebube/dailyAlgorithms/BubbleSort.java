package com.ebube.dailyAlgorithms;

import java.util.Arrays;


//procedure bubbleSort( list : array of items )
//
//   loop = list.count;
//
//   for i = 0 to loop-1 do:
//      swapped = false
//
//      for j = 0 to loop-1 do:
//
//         /* compare the adjacent elements */
//         if list[j] > list[j+1] then
//            /* swap them */
//            swap( list[j], list[j+1] )
//            swapped = true
//         end if
//
//      end for
//
//      /*if no number was swapped that means
//      array is sorted now, break the loop.*/
//
//      if(not swapped) then
//         break
//      end if
//
//   end for
//
//end procedure return list


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 9, 3, 9, 2, 8, 1, 1, 7, 9, 3};
        System.out.println(bubble(arr1));
    }


    public static String bubble(int[] arr) {
        int temp = 0;
        int arrLen = arr.length;

        for (int i = 0; i < arrLen; i++) {
            for (int j = 1; j < arrLen; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Arrays.toString(arr);

    }


}
