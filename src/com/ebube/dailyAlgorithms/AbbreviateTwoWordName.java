package com.ebube.dailyAlgorithms;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName1("Ebube Chineke"));
    }

    //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    //
    //The output should be two capital letters with a dot separating them.
    //
    //It should look like this:
    //
    //Sam Harris => S.H
    //
    //patrick feeney => P.F




    public static String abbrevName3(String name) {
        String[] newArr = name.split(" ");
        String result = "";
        result +=  newArr[0].substring(0,1) + "." + newArr[1].substring(0,1);


            return result.toUpperCase();
    }



    public static String abbrevName1(String name) {
        String[] eachName = name.split(" ");
        String result = "";
        String a = eachName[0].substring(0, 1);
        String b = eachName[1].substring(0, 1);
        result = a + "." + b;


        return result.toUpperCase();
    }

    public static String abbrevName2(String name) {
        String[] eachName = name.split(" ");
        String result = "";
        String a = eachName[0].substring(0, 1);
        String b = eachName[1].substring(0, 1);
        result = a + "." + b;


        return result.toUpperCase();
    }


    //Sam Harris = S.H










}
