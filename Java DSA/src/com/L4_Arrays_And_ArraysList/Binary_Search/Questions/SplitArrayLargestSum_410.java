package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum_410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int split = 1;
            for (int n : nums) {
                if ((sum + n) > mid) {
                    sum = n;
                    split++;
                } else {
                    sum += n;
                }

            }
            if (split > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; //end can also be return because both will be same
    }
}
