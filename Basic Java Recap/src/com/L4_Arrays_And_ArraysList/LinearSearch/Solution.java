package com.L4_Arrays_And_ArraysList.LinearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }


    static int findNumbers(int[] nums) {
        int evenDigits = 0;
        for (int element : nums) {
            int count = 0;
            int num = element;
            while (num != 0) {
                num /= 10;
                count++;
            }
            if (count % 2 == 0) {
                evenDigits++;
            }
        }
        return evenDigits;
    }
}