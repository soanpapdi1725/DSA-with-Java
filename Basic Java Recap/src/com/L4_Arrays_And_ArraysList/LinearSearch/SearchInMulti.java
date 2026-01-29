package com.L4_Arrays_And_ArraysList.LinearSearch;

import java.util.Arrays;

public class SearchInMulti {
    public static void main(String[] args) {
        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 3;
        System.out.println("Searching in 2D array: " + Arrays.toString(search2D(arr2D, target)));
        System.out.println("max value in 2d array using for each loop: " + maxValue(arr2D));
    }

    static int[] search2D(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] rows : arr) {
            for (int cols : rows) {
                if (cols > max) {
                    max = cols;
                }
            }
        }
        return max;
    }
}
