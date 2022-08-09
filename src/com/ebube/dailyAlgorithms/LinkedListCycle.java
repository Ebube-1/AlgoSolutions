package com.ebube.dailyAlgorithms;

import org.w3c.dom.Node;

import java.util.*;

public class LinkedListCycle {
    public static void main(String[] args) {


    }

    class ListNode {
        int val;
        ListNode next;


        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Map<ListNode, ListNode> map = new HashMap<>();
        while (head.next != null) {
            ListNode nextNode = head.next;
            if (map.containsKey(nextNode))
                return true;
            map.put(nextNode, nextNode);
            head = nextNode;
        }
        return false;
    }

    public boolean hasCycleI(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }


    public static boolean hasCycleII(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            if (pointer1 == pointer2) return true;
        }
        return false;
    }

    //length of a linked list

    public static int length(ListNode head) {
        if (head == null || head.next == null) return 0;
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


}
