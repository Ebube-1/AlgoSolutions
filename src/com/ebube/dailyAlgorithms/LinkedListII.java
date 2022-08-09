package com.ebube.dailyAlgorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListII {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list);
        list.toArray();

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = (int) list.get(i);
        }
        System.out.println(Arrays.toString(arr));


    }
}
