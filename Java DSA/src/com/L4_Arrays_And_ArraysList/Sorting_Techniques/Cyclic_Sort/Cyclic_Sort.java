package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort;

import java.util.Arrays;

public class Cyclic_Sort {
    /*
    cyclic sort works only if array satisfies two conditions
    1. works for range 1 to N
    2. array should be continous like {1,2,3,4,5,6,7,8...n}
     */
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // for example i = 0, arr[0] = 3, correctIndex = 2
            /*
             * if array will be sorted 3 will be at index = 2
             * arr[correctIndex] = 2 if value it contains 3 and arr[2] also 3 then i++ else swap
             * */
            if (arr[i] != arr[correctIndex]) {
                swapFunction(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swapFunction(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
