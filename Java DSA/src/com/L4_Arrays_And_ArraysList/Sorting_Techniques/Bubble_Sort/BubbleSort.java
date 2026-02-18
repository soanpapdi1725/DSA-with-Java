package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Bubble_Sort;

import java.util.Arrays;

/*
In this sorting algorithm it runs and swaps if conditions is true

Time Complexity->
Best Case -> O(N) -> When Array is already sorted
Worst Case -> O(N^2) -> when array is in opposite order

Stability of an Algorithm->
Arr given-> [ 5🔴 , 3🔵 , 5🟢 , 2🟡 , 3🟣 ]
for example:-
arr = [5, 4, 3, 2, 1];
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
