package com.L4_Arrays_And_ArraysList.Binary_Search;

// https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=binary-search
/*
first result = length of array
then from 0 -> n-1(8)
it will add
result = result + i - nums[i];

for example-> dry run
result = 9(length of array)
i < nums.length(8)
i=0, nums[i] = 9
result = 9 + 0 - 9 => 0

i=1, nums[i] = 6
result = 0 + 1 - 6=> -5

i=2, nums[i] = 4
result = -5 + 2 -4 => -7

i=3, nums[i] = 2
result = -7 + 3 - 2 => -6

i=4, nums[i] = 3
result = -6 + 4 - 3 => -5

i=5, nums[i] = 5
result = -5 + 5 - 5 => -5

i=6, nums[i] = 7
result = -5 + 6 -7 => -6

i=7, nums[i] = 0
result = -6 + 7 - 0 => 1

i=8, nums[i] = 1
result = 1 + 8 - 1 => 8

and 8 is answer

 */
public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(array));
    }

    static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result += i - nums[i];
        }
        return result;
    }
}
