package com.L4_Arrays_And_ArraysList.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Left->right
[(0,0), (0,1), (0,2)] Top
[(1,0), (1,1), (1,2)]  |
[(2,0), (2,1), (2,2)]  bottom
[(3,0), (3,1), (3,2)]
left<-right
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4}, //top = 1, right = 2, bottom = 1, left = 1;
                {5, 6, 7, 8}, //top = 2, top <= bottom -> false, right = 1, false, left == right == 1
                {9, 10, 11, 12}};
        List<Integer> result = spiralOrder(arr);

        System.out.println(Arrays.toString(result.toArray()));

    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }


        }
        return arr;
    }
}
