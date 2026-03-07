package com.L7_Recursion.Question;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 18, 27, 45, 69, 96, 106};
        System.out.println(recursionBinarySearch(arr, 0, arr.length - 1, 107));
    }

    static int recursionBinarySearch(int[] arr, int start, int end, int target) {
        /*In arguments always pass the first important things which require

        and also pass those things which future function require
        and write those things in the function which needs to be function specific not every recursive function call specific
        for example start and end will decide kitna hamne search kar liya hai toh ye toh har function ko pta hona chahiye kitna search kr liya hamne, Isliye arguments me hai Start and end

        and mid is in function body because each function have to check different mid and different function call will be done
        */
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
