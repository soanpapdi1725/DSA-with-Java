package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

/**
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 * <p>
 * Return the index of the peak element.
 * <p>
 * Your task is to solve it in O(log(n)) time complexity.
 * array-> [-1,4,6,7,11,14,19,21,13,8,5,2] -> length 11
 * to return peak element
 * <p>
 * loop-> start <= end
 * possibilities
 * 1. check (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) // aagey piche dono se bada hai
 * if true  return mid
 * 2. check (arr[mid] < arr[mid+1])
 * if true, start = mid
 * 3. check (arr[mid] > arr[mid+1])
 * if true, end = mid
 * <p>
 * if no return executed then return 0;
 */
public class PeakIndexMountainArray852 {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 6, 7, 11, 14, 19, 13, 8, 5, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) { // when start == end, then the both pointers pointing to largest element in the array
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                /**
                 1. You are in Decreasing part of the array
                 2. You need to reduce the size from right
                 3. this may be the ans, but look at left
                 4. this is why end != mid - 1
                 */
                e = m;
            } else {
                /**
                 1. You are in Increasing part of the array
                 2. You need to reduce the size from Left
                 3. this may not be the ans, because next one is bigger than this
                 4. this is why start != mid and It is start != mid + 1
                 */
                s = m + 1;
            }
        }
        /**
         1. in the end, start == end and pointing to the largest number because of the 2 check above
         2. start and end are always trying to find max element in the above 2 checks
         3. hence, when they are pointing to just one element, that is the max one because that is what the checks say -> s < e
         4. more elaboration: at every point of time for  start and end, they have the best possible answer till that time
         5. if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
         */
        return e; /// start can also be returned as both are equal
    }
}
