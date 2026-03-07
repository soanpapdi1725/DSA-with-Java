package com.L7_Recursion.Question;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 18, 27, 45, 69, 96, 106};
        System.out.println(recursionBinarySearch(arr, 0, arr.length - 1, 107));
    }

    static int recursionBinarySearch(int[] arr, int start, int end, int target) {
        //In argument
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            recursionBinarySearch(arr, start, mid - 1, target);
        }

        return recursionBinarySearch(arr, mid + 1, end, target); // always have write return in case u provided return type other than void

    }
}
