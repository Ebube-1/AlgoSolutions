package com.ebube.dailyAlgorithms;

public class MainPriority {
    public static void main(String[] args) {
        // write your code here
        MyPriorityList myPriorityList = new MyPriorityList();


//add items to the list
        myPriorityList.addToList("wake up");
        myPriorityList.addToList("solve algorithm");
        myPriorityList.addToList("pray");
        myPriorityList.addToList("eat");
        myPriorityList.addToList("sleep");
        myPriorityList.addToList("reply mails");

        System.out.println(myPriorityList);


//check the size of the list
        int size = myPriorityList.sizeList();
        System.out.println(size);


//get a particular list item
        System.out.println(myPriorityList.getList(1));

    }
}
