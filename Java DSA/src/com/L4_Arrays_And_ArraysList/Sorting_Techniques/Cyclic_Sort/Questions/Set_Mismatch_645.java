package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */
/*
return duplicate element and missing number
 */
public class Set_Mismatch_645 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] nums) {
        int[] result = {-1, -1};
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] != nums[correctPos]) {
                swapNums(nums, i, correctPos);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if ((j + 1) != nums[j]) {
                result[1] = (j + 1);
                result[0] = nums[j];
            }
        }
        return result;
    }

    static void swapNums(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
