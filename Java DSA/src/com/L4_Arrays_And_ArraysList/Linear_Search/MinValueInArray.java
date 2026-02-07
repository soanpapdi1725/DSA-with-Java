package com.L4_Arrays_And_ArraysList.Linear_Search;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {55, 9, 52, 96, 74, 10, 26, 7, -5, -10, 5, -4};
        System.out.println("Min value in Array: " + minValue(arr) + "\n" + "Min value in Range: " + minValueInRange(arr, 2, 7));
    }

    static int minValue(int[] arr) {
        int minValue = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < minValue) {
                minValue = arr[index];
            }
        }
        return minValue;
    }

    static int minValueInRange(int[] arr, int start, int end) {
        int minValue = arr[start];
        if (arr.length == 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        if (start == end) {
            return minValue;
        }
        for (int index = start + 1; index <= end; index++) {
            if (arr[index] < minValue) {
                minValue = arr[index];
            }
        }
        return minValue;
    }
}
