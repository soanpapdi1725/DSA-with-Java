package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

import java.util.List;

public class Find_All_duplicates_442 {
    public static void main(String[] args) {

    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
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
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    static void swapNums(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
