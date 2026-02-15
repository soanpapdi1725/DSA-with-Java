package com.L4_Arrays_And_ArraysList;

//https://leetcode.com/problems/matrix-diagonal-sum/
//optimized approach below
/*
public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int dSum = 0;
        for (int i = 0; i < n; i++) {
            dSum += mat[i][i]; //Primary Diagonal
            dSum += mat[i][(n - 1) - i]; //Secondary Diagonal
            // But both will count middle element twice in case of matrix of 3*3,5*5,7*7,9*9
        }
        // Double Counting of middle element in case Matrix is 3*3,5*5,7*7,9*9
        if (n % 2 == 1) {
            dSum -= mat[n / 2][n / 2];
        }
        return dSum;
    }
 */
public class Diagonal_Sum_Array_1572 {
    public static void main(String[] args) {
        int[][] matrix = {
                {6, 3, 1, 10, 7, 4},
                {4, 10, 1, 9, 5, 10},
                {5, 5, 7, 3, 8, 5},
                {2, 7, 6, 4, 7, 6},
                {7, 9, 6, 1, 8, 5},
                {1, 7, 9, 5, 8, 4},
        };
        int Sum = diagonalSum(matrix);
        System.out.println(Sum);

    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        System.out.println((n - 1) / 2);
        int dSum = 0;
        System.out.println(dSum);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    dSum += mat[i][j];
                } else if (i == j) {
                    dSum += mat[i][j];
                }
            }
        }
        return dSum;
    }
}
