package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Disappeared_Nums_448 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(disapperedNums(arr).toArray()));
    }

    static List<Integer> disapperedNums(int[] nums) {
        List<Integer> disappNums = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] != nums[correctPos]) {
                swap(nums, i, correctPos);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if ((j + 1) != nums[j]) {
                disappNums.add(j + 1);
            }
        }
        return disappNums;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
