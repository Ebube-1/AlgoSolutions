package com.ebube.dailyAlgorithms;

import java.util.Arrays;

public class SelectionAndInsertionSort {

        public static void main(String[] args) {
            int [] unsorted = {3,4,7,8,12,3,1,2,7,10};
            selectionSorting(unsorted);
//            insertionSorting(unsorted);
            System.out.println(Arrays.toString(unsorted));
        }
        public static void selectionSorting(int [] input) {
            int n = input.length;
            for (int i = 0; i < n - 1; i++) {
                //find the minimum element in unsorted input
                int minIndex = i;
                for (int j = i + 1; j < n; j++){
                    if (input[j] < input[minIndex]) {
                        minIndex = j;
                    }
                }

                int value = input[minIndex];
                int other = input[i];
                input[i] = value;
                input[minIndex] = other;
            }
        }
        public static void insertionSorting(int [] input){
            for(int i=0;i<input.length;++i){
                int j = i;
                while(j > 0 && input[j-1]>input[j]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                    j--;
                }
            }
        }
    }

