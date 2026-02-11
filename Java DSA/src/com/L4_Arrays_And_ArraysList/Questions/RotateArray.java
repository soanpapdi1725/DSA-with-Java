package com.L4_Arrays_And_ArraysList.Questions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] toRotate = Arrays.copyOfRange(nums, k + 1, length);
        int[] begining = Arrays.copyOfRange(nums, 0, k + 1);
        int i = 0;
        while (i < k) {
            nums[k - i - 1] = toRotate[toRotate.length - 1 - i];
            i++;
        }
        for (int j = 0; j < begining.length; j++) {
            nums[j + i] = begining[j];
        }
    }
}
