package com.L4_Arrays_And_ArraysList.Binary_Search;

public class Missing_Number_268 {
    public static void main(String[] args) {

    }

    static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result += i - nums[i];
        }
        return result;
    }
}
