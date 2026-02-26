package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

public class Find_Duplicate_Element_287 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(duplicate_Element(arr));
    }

    static int duplicate_Element(int[] nums) {
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
                return nums[index];
            }
        }
        return -1;
    }

    static void swapNums(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
