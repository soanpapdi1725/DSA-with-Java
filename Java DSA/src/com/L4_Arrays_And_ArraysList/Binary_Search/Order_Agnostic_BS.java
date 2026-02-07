package com.L4_Arrays_And_ArraysList.Binary_Search;

import com.L4_Arrays_And_ArraysList.ReverseArray;

import java.util.Arrays;

public class Order_Agnostic_BS {
    /*
    Order Agnostic Binary Search means when we don't know that array is sorted in Ascending or Descending way
    if it is sorted in ascending way do it regular method
    else just change the relational operators to it's opposite
    target > array[mid] -> move left in descending
    target < array[mid] -> move right in descending
     */
    public static void main(String[] args) {
        int[] arr = {-45, -38, -21, -18, -9, -7, -3, 0, 7, 12, 23, 28, 31, 37, 39, 45, 54, 69, 89, 97, 100, 105};
        System.out.println(binarySearchAgnostic(arr, 100));
        ReverseArray.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchAgnostic(arr, 69));

    }

    static int binarySearchAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAcs = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAcs) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
