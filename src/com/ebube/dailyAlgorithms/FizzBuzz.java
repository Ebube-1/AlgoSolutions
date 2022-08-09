package com.ebube.dailyAlgorithms;


//print 1 to 100 in a new line
//for each multiple of 3 print "fizz"
//for each multiple of 5 print "buzz"
//for each multiple of 3 and 5 print "fizzBuzz"


public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(50));
    }

    public static int FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        return n;
    }
}
