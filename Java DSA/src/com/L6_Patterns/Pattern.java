package com.L6_Patterns;

public class Pattern {
    /*
    How to Approach

    1. no. of lines = no. of rows = no. of times outer loop will run

    2. identify for every row no.
       i. how many cols are there
       ii. types of elements in the col

     */
    public static void main(String[] args) {
        pattern1(5);
    }

    /*
    pattern 1
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
