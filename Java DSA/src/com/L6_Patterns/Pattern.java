package com.L6_Patterns;

public class Pattern {
    /*
    How to Approach

    1. no. of lines = no. of rows = no. of times outer loop will run

    2. identify for every row no.
       i. how many cols are there
       ii. types of elements in the col
    3. what u need to print
     */
    public static void main(String[] args) {
        System.out.println("pattern 1");
        pattern1(5);
        System.out.println("\npattern 2");
        pattern2(5);
        System.out.println("\npattern 3");
        pattern3(5);
        System.out.println("\npattern 4");
        pattern4(5);
        System.out.println("\npattern 5");
        pattern5(5);

    }

    /*
        pattern 1
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
     */
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
                if (col != n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        pattern 3
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
    */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                if (col != row) { // no whitespaces will be there at the end
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        pattern 3
        * * * * *
        * * * *
        * * *
        * *
        *
    */
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                /*
                n = 5, row = 1, => 5 - 1 + 1 -> loop will run till 5
                n = 5, row = 2 => 5 - 2 + 1-> loop will run till 4
                n = 5, row = 3 => 5 - 3 + 1-> loop will run till 3
                n = 5, row = 4 => 5 - 4 + 1-> loop will run till 2
                n = 5, row = 5 => 5 - 5 + 1-> loop will run till 1
                 */
                System.out.print("*");
                if (col != n - row + 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        Pattern 4
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                if (col != row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        Pattern 5 -> rows = 9
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
    static void pattern5(int n) {
        for (int rows = 1; rows <= (n * 2) - 1; rows++) {
            int maxColInEachRow = rows > n ? n * 2 - rows : rows;

            for (int cols = 1; cols <= maxColInEachRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


}
