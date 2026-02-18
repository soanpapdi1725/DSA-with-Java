package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Selection_Sort;

import java.util.Arrays;

/*
Selection Sort-> It is an sorting algorithm, in this it selects the element and put it in it's correct position

Time Complexity:-
Best Case Scenario -> O(N²)
   reason:- Because even in best case it will check the Max elements one by one that are they in their correct place or not

Worst Case Scenario -> O(N²) if it is in opposite order

Stability:-
It is Unstable Sorting algorithm

If unstable sorting array Algorithm -> [2🟡, 3🟣, 3🔵, 5🟢, 5🔴]
means the order of colours can not be maintained as it was in given Array

Number of Comparisons per Iteration => N-1-i

N = length of array
i = iteration
N-1 = last element 
N-1-i = iterate from last to first which depends on value of i in array

Two ways
1. Put Greatest element at it's correct position
2. Put Smallest Element at it's correct position

for example:-
Put Greatest element at it's correct position
Arr = [4,5,1,2,3]

1. swap 5 to 3
Arr = [4,3,1,2,5]

2. swap 4 to 2
Arr = [2,3,1,4,5]

3. swap 3 to 1
Arr = [2,1,3,4,5]

4. swap 2 to 1
Arr = [1,2,3,4,5]

and done
 */
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
