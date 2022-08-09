package com.ebube.dailyAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {1, 4, 5, 8, 9, 12, 14, 16, 19, 21, 25, 28, 19, 31, 35};
        System.out.println(binarySearch(number, 28));
        // System.out.println(search(number, 28));
    }
//    public static int search(int[] num, int target){
//        for(int i = 0; i < num.length; i++){
//            if(num[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = (high + low) / 2; //middle index
            int indexValue = array[middle];  //index value

            if (indexValue < target) low = middle + 1;
            else if (indexValue > target) high = middle - 1;
            else return middle; //returns the index where the target was found

        }
        return -1; //target not found
    }

    String bits = Long.toBinaryString(9);
}
