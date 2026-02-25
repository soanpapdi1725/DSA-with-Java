package com.L4_Arrays_And_ArraysList.Sorting_Techniques.Cyclic_Sort.Questions;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missing_Num(arr));
    }

    static int missing_Num(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i];
            if (correctPos != nums.length && correctPos != nums[correctPos]) {
                swap(nums, i, correctPos);
            } else {
                i++;
            }
        }
        //check each index are they at their correct index or not
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
