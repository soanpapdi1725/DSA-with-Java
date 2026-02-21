package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Selection_Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1, -5, -15, -25, 25, 15, 10, 18, 20, 30};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // will run till (length - 1)
            int last = n - 1 - i; // last index at every iteration so that we Can swap
            int max = getMax(arr, 0, last); //will get the max element in the array one by one
            swapNums(arr, max, last);
        }
    }

    static void swapNums(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    static int getMax(int[] arr, int start, int last) {
        int max = 0;
        for (int j = 0; j <= last; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }
}
