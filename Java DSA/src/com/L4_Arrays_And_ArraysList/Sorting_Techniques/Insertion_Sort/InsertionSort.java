package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // for (int i = 1; i < arr.length; i++)
            for (int j = i + 1; j > 0; j--) { // for (int j = i; j > 0; j--)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else { //if you found that [3,5,4,2,1] and j is at 5 and j-1 is at 3
                    // if array[j] > array[j-1] means already sorted
                    break;
                }
            }
        }
    }
}
