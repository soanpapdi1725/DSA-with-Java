package com.L4_Arrays_And_ArraysList.Questions;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        /*
        Arr = [1,2,3,4,5] => length 4
        k = 7 means rotate 7 times
        if we rotate it 4 times it will be the same array it was given

        if Arr.length < k then 7 % 4=> 3 means we only need to rotate 3 times
         */

        reverseArr(nums, 0, nums.length - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, nums.length - 1);
    }

    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
