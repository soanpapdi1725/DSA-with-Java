package com.L4_Arrays_And_ArraysList.Questions;

import java.util.Arrays;

public class SpiralMatrix_2 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int value = 1;
        while (top <= bottom && left <= right && value <= n * n) {
            // left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value;
                value++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value;
                value++;
            }
            right--;
            // right to left -> condition is there because maan lo wo bottom already ho rakha hai fir kyu hi aap wapas usey re write kroge
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value;
                    value++;
                }
                bottom--;
            }
            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value;
                    value++;
                }
                left++;
            }
        }
        return matrix;
    }
}
