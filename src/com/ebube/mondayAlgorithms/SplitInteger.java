package com.ebube.mondayAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SplitInteger {

    public static void main(String[] args) {
        System.out.println(splitInteger(20,6));
    }
    public static List<Integer> splitInteger(Integer num, Integer parts) {
        List<Integer> list = new ArrayList<>();
        while (parts > 0) {
            int n = Math.floorDiv(num,parts);
            list.add(n);
            num -= n;
            parts--;
        }
        return list;
    }

}

//        int result = 0;
//        int ans = 0;
//        while (!(parts < 1 && parts > parts)) { //parts
//            ans += num / parts;
//            ans += (num - ans) / parts - 1;
//            result += ans;
//                continue;
//        }
//        System.out.println(ans);