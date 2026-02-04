package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.
array-> [-1,4,6,7,11,14,19,21,13,8,5,2] -> length 11
to return peak element

loop-> start <= end
possibilities
1. check (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) // aagey piche dono se bada hai
     if true  return mid
2. check (arr[mid] < arr[mid+1])
     if true, start = mid
3. check (arr[mid] > arr[mid+1])
     if true, end = mid

if no return executed then return 0;
 */
public class PeakIndexMountainArray852 {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 6, 7, 11, 14, 19, 13, 8, 5, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) { //increasing side me hai ham 7 < 9
                start = mid;
            } else if (arr[mid] > arr[mid + 1]) { // decreasing side me hai ham 9 > 7
                end = mid;
            }
        }
        return 0;
    }
}
