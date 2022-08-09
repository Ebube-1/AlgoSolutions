//package com.ebube;
//
//import java.nio.charset.MalformedInputException;
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
////        System.out.println(repeatStr1(7, "run"));
////        System.out.println(Main.IsPalindrome(1012));
////        System.out.println(Main.IsPalindrome2("ANNA"));
////        System.out.println(Main.IsUpperCase("tolu"));
////        System.out.println(Main.solution("abcde", "ee"));
////        int[] array = new int[5];
////        int[] array2 = {1, -2, 3, 4, 7, 6};
////        int[] arr = {2,7,99,23,33};
//////        System.out.println(findMaximumNumber(array2));
//////       System.out.println(findMinimumNumber(array2));
////       System.out.println(secondHighest(arr));
////        System.out.println(secondHighest1(arr));
////        char[] letters = {'a','a', 'c', 'd', 'd', 'd'};
////        int count = countOccurrences(letters, 'd');
////        System.out.println(count);
////
//        Kata kata = new Kata();
//        kata.SumOfIntegersInString("12.4");
////        String[] arr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
//
////        System.out.println(Kata.LongestConsec(arr, 4));
//
//        String s = "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog";
////        int SumOfIntegersInString (String  );
//
//
//    }
////    public static String repeatStr(final int repeat, final String string) {
////       return string.repeat(repeat);
////    }
////
////    public static String repeatStr1(final int repeat, final String string) {
////        String repeatedString = "";
////        for (int i = 0; i < repeat; i++) {
////            repeatedString += string;
////        }
////        return repeatedString;
////    }
////
////    public static boolean IsPalindrome(Object line)
////    {
////        String string = "" + line;
////
////        String reversedString = "";
////        for (int i = string.length() -1; i >= 0; i --) {
////            reversedString += string.charAt(i);
////
////        }
////        return string.equals(reversedString);
////    }
////
////    public static int findMaximumNumber(int [] array){
////        int number = Integer.MIN_VALUE;
////        for (int i = 0; i < array.length; i++) {
////            if(array[i] > number){
////                number = array[i];
////            }
////        }
////        return number;
////    }
////
////
////    public static int findMinimumNumber(int [] arr){
////        int number = 1;
////        for(int num : arr){
////            // min = Math.min( )
////        }
////        return number;
////    }
//
//    int[] arr = {2,7,99,23,33};
//
//
//    public static int secondHighest(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp;
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr[1];
//    }
//
//
////    public static int secondHighest1(int[] arr){
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
////        return arr[arr.length -2];
////    }
////
////
////    public static int countOccurrences(char[]letters, char searchLetter){
////        int count = 0;
////        for (char letter : letters){
////            if (letter == searchLetter){
////                count++;
////            }
////        }
////        return count;
////    }
////
////
////
////        public static boolean IsPalindrome2(Object line)
////    {
////        String string = "" + line;
////
////        StringBuilder palindrome = new StringBuilder(string);
////        palindrome.reverse();
////        if ( palindrome.toString().equals(string) ){
////            return true;
////        }
////        return false;
////    }
////
////    public static boolean IsUpperCase(String text)
////    {
////        String upperCase = text.toUpperCase();
////        if(text.equals(upperCase)||text.equals("")){
////            return true;
////
////        }else{
////            return false;
////
////        }
////    }
////
////
//////    Complete the solution so that it returns true if the first argument(string)
//////    passed in ends with the 2nd argument (also a string).
//////    solution('abc', 'bc') // returns true
//////    solution('abc', 'd') // returns false
////
////    public static boolean solution(String str, String ending) {
////         if(str.endsWith(ending)){
////             return true;
////         }
////        return false;
////    }
////
//////    Your task in this kata is to implement a function that
//////    calculates the sum of the integers inside a string.
//////    For example, in the string
//////    "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog",
//////    the sum of the integers is 3635.
////
////    //declare an empty int variable
////    //for loop to find the numbers in the string
////    //if index is number add to the new int variable
////    //return the addition
////
////
////
//    public static class Kata {
//    public int SumOfIntegersInString(String s) {
//              String num = s.replaceAll("[A-Za-z]", " ");
//              String[] numArr = num.split(" ");
//            System.out.println(Arrays.toString(numArr));
//            int sum = 0;
//            for (String s1 : numArr) {
//                 if (!s1.equals(" ") && !s1.equals("")) {
//                     sum += Integer.parseInt(s1) ;
//
//                 }
//            }
////            System.out.println(sum);
////              return sum;
////        int sum = 0;
////        for (int i = 0; i < s.length(); i++) {
////            System.out.println(s.charAt(i));
////            if (Character.isDigit(s.charAt(i))) {
////                String str = "";
////                while (Character.isDigit(s.charAt(i))) {
////                    if (i < s.length() - 1) {
////                        str += s.charAt(i);
////
////                    } else break;
////                    i++;
////                }
////                if (!str.equals(""))
////                    sum += Integer.parseInt(str);
////          }
////        return;
//        }
////        System.out.println(s.length());
////        System.out.println(sum);
////        return sum;
////    }
////
////    public static String LongestConsec(String[] strarr, int k) {
////        if (strarr.length < k || k <= 0) {
////            return "";
////        } else {
////            String str = "";
////            for (int i = 0; i < strarr.length; i++) {
////                int c = i;
////                String newStr = "";
////                while (c < k) {
////                    if (c <= strarr.length - 1) {
////                        newStr += strarr[c];
////                        c++;
////                    } else break;
////                }
////                if (newStr.length() > str.length()) {
////                    str = newStr;
////                }
////                k++;
////            }
////            return str;
////        }
//
//   // }
//
//
////    public class Solution{
////        public static int largestPairSum(int[] numbers){
////            int result = 0;
////            Array.sort(numbers);
////            int num = numbers.length;
////            result = number[num-1] + number[num-2];
////            return result;
////        }
////    }
//
//    //productArray ({10,3,5,6,2}) return ==> {180,600,360,300,900}
//    //Given an array/list [] of integers , Construct a product array Of same size Such That
//    //prod[i] is equal to The Product of all the elements of Arr[] except Arr[i].
//
////i
////    public static long[] productArray(int[] numbers) {
////        long[] productOutput = new long[numbers.length];
////        for (int i = 0; i < numbers.length; i++) {
////            int product = 1;
////            for (int j = 0; j < numbers.length; j++) {
////                if (i != j) {
////                    product *= numbers[j];
////                }
////            }
////            productOutput[i] = product;
////        }
////            return productOutput;
////    }
////}
////
////    public static double[] ToDoubleArray(String[] stringArray){
////        double []  convertString =  new double[stringArray.length];
////        for (int i = 0; i < stringArray.length; i++) {
////            convertString[i] = Double.parseDouble(stringArray[i]);
////        }
////        return convertString;
////    }
//
//
//}}
//
//
