package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class Find_Right_Interval_436 {
    public static void main(String[] args) {

    }

    static int[] findRightInterval(int[][] intervals) {
        int[] arr = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int at = intervals[i][1];
            for (int j = 0; j < intervals.length; j++) {
                if (at <= intervals[j][0]) {
                    arr[i] = j;
                }
                if (j == intervals.length - 1) {
                    arr[i] = -1;
                }
            }

        }
        return arr;
    }
}
