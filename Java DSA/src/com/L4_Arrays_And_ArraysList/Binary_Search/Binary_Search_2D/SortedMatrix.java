package com.L4_Arrays_And_ArraysList.Binary_Search.Binary_Search_2D;

import java.util.Arrays;

public class SortedMatrix {
    /*
    sorted matrix are like
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15},
    {16,17,18,19,20},
    {21,22,23,24,25}
     */
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}
                };
        int target = 19;
        System.out.println(Arrays.toString((searchInSortedMatrix(matrix, target))));
    }

    static int[] binarySearch2D(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] > target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarySearch2D(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        //search in 2D matrix
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }


//        checking for all the 4 halfs remaining
        /*
    for ex of this matrix last 2 rows only remaining column mid = {12,17}
    {11,12,13,14,15},
    {16,17,18,19,20},



    check
    row 1st left of mid
    row 1st right of mid but should not be in between it's max elements
    row 2nd left of mid
    row 2nd right of mid
         */
        // target is smaller than mid of last two row's -> 1st row
        if (matrix[rStart][cMid] > target) {
            return binarySearch2D(matrix, rStart, 0, cMid - 1, target);
        } else if (matrix[rStart][cMid] < target && target < matrix[rStart][cols - 1]) {
            return binarySearch2D(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // target is smaller than mid of last two row's -> 2nd row
        else if (matrix[rStart + 1][cMid] > target) {
            return binarySearch2D(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch2D(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
