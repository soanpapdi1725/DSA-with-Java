package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Insertion_Sort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] > nums[j - 1]) {
                    break;
                } else {
                    swap(nums, j, (j - 1));
                }
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
