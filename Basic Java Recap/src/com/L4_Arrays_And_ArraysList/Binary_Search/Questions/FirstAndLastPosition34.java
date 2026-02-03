package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

import java.util.Arrays;

/*
Array will be run two times first to find the farthest index where target starts
and second to find end of it

create a separate binarySearch function which takes int[] array, int target, boolean forStartIndex
initialize int ans = -1
int start = 0, end = array.length;
run the loop till start <= end
   initialize mid = start + (end - start)/2;
   if target >= array[mid]
      then start = mid + 1
   else if target <= array[mid]
      then end = mid - 1
   else
      update ans = mid
      check forStartIndex // for shortening the array continously in just left of mid if target element is found
        if true then end = mid - 1;
        else start = mid + 1;

in end just return ans if not found will return -1
 */
public class FirstAndLastPosition34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] answer = searchRange(arr, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = BinarySearch(nums, target, true);
        int end = BinarySearch(nums, target, false);
        return new int[]{start, end};
    }

    static int BinarySearch(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
//                potential Answer found
                ans = m;
                if (findStartIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

}
