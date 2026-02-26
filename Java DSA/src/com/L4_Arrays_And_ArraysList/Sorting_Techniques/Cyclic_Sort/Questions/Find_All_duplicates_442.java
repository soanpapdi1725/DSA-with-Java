package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Find_All_duplicates_442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(findDuplicates(nums).toArray()));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] != nums[correctPos]) {
                swapNums(nums, i, correctPos);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if ((index + 1) != nums[index]) {
                result.add(nums[index]);
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
