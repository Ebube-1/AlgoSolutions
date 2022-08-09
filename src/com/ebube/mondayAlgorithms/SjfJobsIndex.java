package com.ebube.mondayAlgorithms;

import java.util.ArrayList;


//[3,10,20,1,2] 0 == 6
//[3,10,10,20,1,2] 2 == 26
public class SjfJobsIndex {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(20);
        a.add(1);
        a.add(2);
        System.out.println(sjf(a,2));
    }
    public static int sjf(ArrayList<Integer> jobs, int index) {
        int num = 0;
        for(int i = 0; i < jobs.size(); i++){
            if(jobs.get(i) < jobs.get(index) || jobs.get(i) == jobs.get(index) & index >= i){
                num += jobs.get(i);
            }
        }

        return num;
    }
}
