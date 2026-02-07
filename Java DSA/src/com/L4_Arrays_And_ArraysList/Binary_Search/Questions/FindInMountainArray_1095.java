package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;
//https://leetcode.com/problems/find-in-mountain-array/

/*
Ques:-
Example 1:

Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.


Approach:-
1. find Peak Element
2. Use BinarySearch on it for Ascending order by Providing the Array, target, start = 0, end = peak, isAsc = true
   if it comes -1
3. then run BinarySearch on it for Descending Order by Providing the Array, target, start = peak +1, end = array.length -1 , isAsc = false
 if it still comes -1 then directly return it
 */
public class FindInMountainArray_1095 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
        System.out.println(peakIndexInMountainArray(arr, target));
    }

    static int peakIndexInMountainArray(int[] array, int target) {
        int s = 0;
        int e = array.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (array[m] < array[m + 1]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        int ans = binarySearch(array, target, 0, s, true);
        if (ans != -1) return ans;
        return binarySearch(array, target, s + 1, array.length - 1, false);
    }

    static int binarySearch(int[] array, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (array[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (array[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
