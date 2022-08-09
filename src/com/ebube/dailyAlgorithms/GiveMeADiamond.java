package com.ebube.dailyAlgorithms;


//"  *\n ***\n*****\n ***\n  *\n"
public class GiveMeADiamond {
    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) {
        if (n % 2 == 0 && n < 0) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i += 2) {
            sb.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            sb.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }


        return sb.toString();
    }


}
