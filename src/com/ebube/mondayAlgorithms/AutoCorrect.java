package com.ebube.mondayAlgorithms;

import java.util.Arrays;

public class AutoCorrect {
    public static void main(String[] args) {
        System.out.println(autocorrect("We have sent the youtube deliverables to you"));
    }
    public static String autocorrect(String input) {
        String result = "";
       String [] ans = input.split(" ");
       StringBuilder sb = new StringBuilder();

//       for(String each : ans){
//           if (ans.equals("you"))
//       }


        return result;
    }
}


// String[] words = input.split(" ");
//        for(String word : words){
//        }


//public static String autocorrect(String input) {
//        String result = "";
//       for(int i = 0; i < input.length(); i++){
//          result = input.replace("you", "your client");
//
//       }
//
//        return result;
//    }