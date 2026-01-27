package com.L4_Arrays_And_ArraysList;

import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*  c1 c2 c3
        row1 [1 2 3]
        row2 [4 5 6]
        row3 [7 8 9]

        syntax
        dataType[][] variable_name = new int[row(mandatory)][];
        where
        dataType[][] variable_name; -> declaration
        variable_name = new int[row(mandatory)][]; -> initialization

        or

        dataType[][] variable_name = {{}, {}, {}...};
        */

        int[][] arr2D = new int[3][];
/*       In Java giving of rows is mandatory because in Java it stores in the form of Arrays
         2D array is a array of arrays if you provide how many array of this array contain then it will be easy to tell
         Inside those arrays we can have any number of elements
         for ex->
         {
          {1,2,3},
          {4,5},
          {6,7,8,9},
         }
 */

//        INPUT of 2D array in java
        int[][] arr2DMain = new int[3][4];
        for (int i = 0; i < arr2DMain.length; i++) {
            for (int j = 0; j < arr2DMain[i].length; j++) {
                System.out.print("Enter the " + (j + 1) + "th element of " + (i + 1) + "th row: ");
                arr2DMain[i][j] = input.nextInt();
            }
        }
        int[][] arr2D3 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        //        Output of 2D array in java
        for (int i = 0; i < arr2D3.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr2D3[i].length; j++) {
                System.out.print(arr2D3[i][j] + ",");
            }
            System.out.println("}");
        }
    }
}
