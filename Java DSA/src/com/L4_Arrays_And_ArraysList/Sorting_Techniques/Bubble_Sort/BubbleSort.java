package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Bubble_Sort;

import java.util.Arrays;

/*
In this sorting algorithm it runs and swaps if conditions is true

Time Complexity->
Best Case -> O(N) -> When Array is already sorted
Worst Case -> O(N^2) -> when array is in opposite order

Bubble sort is a stable algorithm means it will maintain the order

Stability of an Algorithm->
Arr given-> [ 5🔴 , 3🔵 , 5🟢 , 2🟡 , 3🟣 ]
Sorted array without discussing balls -> [2, 3, 3, 5, 5]

If Stable sorting array Algorithm -> [2🟡, 3🔵, 3🟣, 5🔴, 5🟢]
means the order of colours should be maintained as it was in given Array
Inme jese Given array me red and blue wale pehle aarahe hai wese hi unhe place kiya gya 3 and 5 me

If unstable sorting array Algorithm -> [2🟡, 3🟣, 3🔵, 5🟢, 5🔴]
means the order of colours can not be maintained as it was in given Array

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
