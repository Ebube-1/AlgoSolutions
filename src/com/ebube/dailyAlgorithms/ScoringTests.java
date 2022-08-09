package com.ebube.dailyAlgorithms;


//An array containing a series of 0s, 1s, and 2s, where 0 is a correct answer,
// 1 is an omitted answer, and 2 is an incorrect answer.
//The points awarded for correct answers
//The points awarded for omitted answers (note that this may be negative)
//The points deducted for incorrect answers (hint: this value has to be subtracted)
//Note: The input will always be valid (an array and three numbers)
//
//Examples
//#1:
//
//[0, 0, 0, 0, 2, 1, 0], 2, 0, 1  -->  9
//because:
//
//5 correct answers: 5*2 = 10
//1 omitted answer: 1*0 = 0
//1 wrong answer: 1*1 = 1
//which is: 10 + 0 - 1 = 9
//
//#2:
//
//[0, 1, 0, 0, 2, 1, 0, 2, 2, 1], 3, -1, 2)  -->  3
//because: 4*3 + 3*-1 - 3*2 = 3
public class ScoringTests {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 2, 1, 0, 2, 2, 1};
        System.out.println(sol(arr, 3, -1, 2));
    }

    public static int sol(int[] arr, int r, int o, int w) {
        int ansR = 0;
        int ansO = 0;
        int ansW = 0;

        int countr = 0;
        int counto = 0;
        int countw = 0;

        for (int num : arr) {
            if (num == 0) countr++;
            if (num == 1) counto++;
            if (num == 2) countw++;
        }
        ansR = countr * r;
        ansO = counto * o;
        ansW = countw * w;


        return ansR + ansO - ansW;
    }
}
