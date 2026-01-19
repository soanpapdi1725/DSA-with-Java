package com.L3_FunctionAndMethod;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int target = 6;
        int[] nums = {3, 2, 4};
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
