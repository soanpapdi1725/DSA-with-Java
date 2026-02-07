package com.L4_Arrays_And_ArraysList.Binary_Search;

import java.text.DecimalFormat;

public class Intro {
    /*
    Q1:- What is Binary Search?
    --> Binary Search is a Searching Technique that works on Sorted Array(Ascending or Desending order)
     where it continously finds the middle index and compares the element on middle index to target element until the array ends

    Best Case -> O(1) time constant in time(ms) vs array size graph

    Worst Case -> O((log base 2) N)
    deepest level of an array



     */

    public static void main(String[] args) {
        int[] arr = {-45, -38, -21, -18, -9, -7, -3, 0, 7, 12, 23, 28, 31, 37, 39, 45, 54, 69, 89, 97, 100, 105};
        int target = 100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Array length is: " + arr.length + "\nWorst Case Scenario for this: " +
                df.format(
                        Math.log10(arr.length - 1) / Math.log10(2)) // formula -> k = log10(N)/log10(2)
        );
        System.out.println();
        long MAX = 2300000000l;
        System.out.println(MAX < 2147483647 ? "True" : "false"); // (start+end)/2
        System.out.println(1_700_000_000 < 2147483647 ? "True" : "false"); //Output -> True
        System.out.println(1_150_000_000 < 2147483647 ? "True" : "false"); //Output ->  True

//      Testing Binary Search
        System.out.println(BinarySearch(arr, target));
    }

    //    will return the index of target element if found else -1
    static int BinarySearch(int[] array, int target) {
        int comparisons = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
//            int mid = (start+end)/2; -> might not work if start or end both are in millions which will exceed int's limit
//            to fix this we can do
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
                comparisons++;
            } else if (target > array[mid]) {
                start = mid + 1;
                comparisons++;
            } else {
                System.out.println("Number of Comparisons required: " + (comparisons + 1));
                return mid;
            }
            /*
            explanation->
            int MAX-> 2147483647 & MIN-> -2147483648

            1-> int mid = (start+end)/2
            start -> 300,000,000
            end -> 2,000,000,000
            start + end = 2300000000 > 2147483647 ❌

            2-> int mid = start + (end-start)/2
            start -> 300,000,000
            end -> 2,000,000,000

            end - start =  2,000,000,000 - 300,000,000 => 1,700,000,000 < 2147483647 ✅
            (end - start)/2 = 1,700,000,000/2 => 850,000,000 > 2147483647 ✅
            start + (end - start)/2 = 300,000,000 + 850,000,000 => 1,150,000,000 < 2147483647 ✅
             */
        }
        System.out.println("Number of Comparisons required: " + (comparisons + 1));
        return -1;
    }

}
