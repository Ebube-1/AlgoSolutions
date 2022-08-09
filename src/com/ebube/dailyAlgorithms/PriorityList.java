package com.ebube.dailyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyPriorityList {
    private List<String> list = new ArrayList<>();

    public boolean addToList(String item) {
        boolean add = list.add(item);
        Collections.sort(list);
        return add;
    }


    public int sizeList() {
        return list.size();
    }


    public String getList(int i) {
        if (i >= sizeList() || i < 0) {
            return null;
        }
        return list.get(i);
    }


    public String toString() {
        return list.toString();
    }


}

