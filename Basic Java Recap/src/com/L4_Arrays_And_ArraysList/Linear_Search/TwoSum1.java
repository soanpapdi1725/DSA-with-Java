package com.L4_Arrays_And_ArraysList.Linear_Search;
// https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 27)));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = nums[j] + nums[j - i];
                if (sum == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }

}
