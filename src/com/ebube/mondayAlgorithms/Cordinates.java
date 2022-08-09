package com.ebube.mondayAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


//We are given directions to go from one point to another.
// The directions are "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite,
// "WEST" and "EAST" too. Going one direction and coming back the opposite direction is a wasted effort,
// so let's concise these directions to go the shortest route.
//
//For example, given the following directions:
//
//plan = ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
public class Cordinates {
    public static void main(String[] args) {
        String[] arr = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST"};
        System.out.println(Arrays.toString(dirReducII(arr)));
    }

    public static String[] dirReduc(String[] arr) {
        Stack<String> holder = new Stack<>();

        for(int i = 0; i < arr.length; i++) {

            if (holder.isEmpty()) holder.add(arr[i]);
            else if (holder.peek().equals("NORTH") && arr[i].equals("SOUTH")) holder.pop();
            else if (holder.peek().equals("SOUTH") && arr[i].equals("NORTH")) holder.pop();
            else if (holder.peek().equals("EAST") && arr[i].equals("WEST")) holder.pop();
            else if (holder.peek().equals("WEST") && arr[i].equals("EAST")) holder.pop();
            else holder.add(arr[i]);

        }

        String[] result = new String[holder.size()];
        for(int i = 0; i < holder.size(); i++){
            result[i] = holder.get(i);
        }

        return result;
    }


    public static String[] dirReducII(String[] arr) {
        List<String> distance = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(distance.isEmpty()){
                distance.add(arr[i]);
            }else if(distance.get(distance.size() -1).equals("SOUTH") && arr[i].equals("NORTH") ) distance.remove(distance.size()-1);
            else if(distance.get(distance.size() -1).equals("NORTH") && arr[i].equals("SOUTH") ) distance.remove(distance.size()-1);
            else if(distance.get(distance.size() -1).equals("EAST") && arr[i].equals("WEST") ) distance.remove(distance.size()-1);
            else if(distance.get(distance.size() -1).equals("WEST") && arr[i].equals("EAST") ) distance.remove(distance.size()-1);
            else distance.add(arr[i]);
        }
        String[] result = new String[distance.size()];
        for(int i = 0; i< distance.size(); i++){
            result[i] = distance.get(i);
        }
        return result;
    }


//WRONG SOLUTION
//        public static String[] dirReduc1(String[] arr) {
//        String result = "";
//            List<String > arrResult = new ArrayList<>();
//        int northc = 0;
//        int southc = 0;
//        int eastc = 0;
//        int westc = 0;
//            for(int i = 0; i < arr.length; i++){
//                if(arr[i].equals("NORTH")) northc++;
//                if(arr[i].equals("SOUTH")) southc++;
//                if(arr[i].equals("EAST")) eastc++;
//                if(arr[i].equals("WEST")) westc++;
//            }
//            System.out.println(northc);
//            System.out.println(southc);
//            System.out.println(eastc);
//            System.out.println(westc);
//            if(northc % 2 == 1) result += "NORTH";
//            if(southc % 2 == 1) result += "SOUTH";
//            if(eastc % 2 == 1) result += "EAST";
//            if(westc % 2 == 1) result += "WEST";
//
//            System.out.println(result);
//            arrResult.add(result);
//            return arrResult.toArray(new String[0]);
//        }

    public static String[] dirReducI(String[] arr) {
        String dir = String.join(" ", arr);
        System.out.println(dir);
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder(dir);
        String northSouth = "NORTH SOUTH";
        String southNorth = "SOUTH NORTH";
        String eastWest = "EAST WEST";
        String westEast = "WEST EAST";
        while (sb.indexOf(northSouth) >= 0 || sb.indexOf(southNorth) >= 0
                || sb.indexOf(eastWest) >= 0 || sb.indexOf(westEast) >= 0) {
            if (sb.indexOf(northSouth) >= 0) {
                sb.delete(sb.indexOf(northSouth), northSouth.length() + sb.indexOf(northSouth)+1);
            }
            else if (sb.indexOf(southNorth) >= 0) {
                sb.delete(sb.indexOf(southNorth), southNorth.length() + sb.indexOf(southNorth)+1);
            }
            else if (sb.indexOf(eastWest) >= 0) {
                sb.delete(sb.indexOf(eastWest), eastWest.length() + sb.indexOf(eastWest) + 1);
            }
            else {
                sb.delete(sb.indexOf(westEast), westEast.length() + sb.indexOf(westEast) + 1);
            }
        }
        // Your code here.
        return sb.length() > 0 ? sb.toString().split(" ") : new String[]{};
    }



}
