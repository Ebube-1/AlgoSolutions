package com.ebube.mondayAlgorithms;


// 89 -- 24
//87 + 78 = 165
//165 + 561 = 726
//726 + 627 =
public class ChallengePalindromeChainLength {
    public static void main(String[] args) {
        
        System.out.println(palindromeChainLength(87));
    }

    public static int palindromeChainLength(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        int count = 0;
        while (Long.parseLong(sb.toString()) != n) {
            n = n + Long.parseLong(sb.toString());
            sb = new StringBuilder(String.valueOf(n));
            sb.reverse();
            count++;
        }
        return count;
    }
}
