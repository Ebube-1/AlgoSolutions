package com.ebube.dailyAlgorithms;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "lagos");
        addInOrder(placesToVisit, "edo");
        addInOrder(placesToVisit, "awka");
        addInOrder(placesToVisit, "abuja");
        addInOrder(placesToVisit, "ibadan");
        addInOrder(placesToVisit, "taraba");
        addInOrder(placesToVisit, "owerri");

        printList(placesToVisit);
        addInOrder(placesToVisit, "lekki");
        addInOrder(placesToVisit, "awka");

        printList(placesToVisit);
    }


    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // the two cities are equal dont add
                System.out.println(newCity + " is already available");
                return false;
            } else if (comparison > 0) {
                //newcity should come b4 the current city
                //awka -- edo
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            /* comparison < 0 move to the next city */
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("no cities avaailable");
            return;
        } else {
            System.out.println("now visiting " + listIterator.next());
            // printMenu();
        }

    }
}
