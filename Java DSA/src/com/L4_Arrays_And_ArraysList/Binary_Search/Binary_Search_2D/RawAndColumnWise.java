package com.L4_Arrays_And_ArraysList.Binary_Search.Binary_Search_2D;

import java.util.Arrays;

public class RawAndColumnWise {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {17, 27, 37, 47},
        };
        System.out.println(Arrays.toString(search2D(arr, 17)));
    }

    static int[] search2D(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
