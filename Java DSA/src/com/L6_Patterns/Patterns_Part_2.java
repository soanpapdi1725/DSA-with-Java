package com.L6_Patterns;

public class Patterns_Part_2 {
    public static void main(String[] args) {
        System.out.println("\npattern 28");
        pattern28(5);
        System.out.println("\npattern 30");
        pattern30(5);
        System.out.println("\npattern 17");
        pattern17(9);
    }

    /*
        Pattern 28 -> n -> 5 then rows-> 2n-1
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
     */
    static void pattern28(int n) {
        for (int rows = 1; rows <= (n * 2) - 1; rows++) {
            int maxStarsInEachRow = rows > n ? 2 * n - rows : rows;
            int maxSpaces = rows > n ? rows - n : n - rows;
            for (int cols = 1; cols <= maxSpaces; cols++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= maxStarsInEachRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int whiteSpaces = (n - rows) * 2;
            for (int cols = 1; cols <= whiteSpaces; cols++) {
                System.out.print(" ");
            }
            for (int cols = rows; cols >= 2; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n) {
        for (int rows = 1; rows <= (n * 2) - 1; rows++) {
            int whiteSpaces = rows > n ? (rows - n) * 2 : (n - rows) * 2;
            int belowMaxNumber = rows > n ? (n * 2) - rows : rows;
            for (int colWhiteSpaces = 1; colWhiteSpaces <= whiteSpaces; colWhiteSpaces++) {
                System.out.print(" ");
            }
            for (int cols = belowMaxNumber; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= belowMaxNumber; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
