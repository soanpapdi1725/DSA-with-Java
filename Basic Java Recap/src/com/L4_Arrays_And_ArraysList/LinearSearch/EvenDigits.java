package com.L4_Arrays_And_ArraysList.LinearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }


    static int findNumbers(int[] nums) {
        int evenDigits = 0;
        for (int element : nums) {
            if (isEvenDigit(element)) {
                evenDigits++;
            }
        }
        return evenDigits;
    }

    static boolean isEvenDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count % 2 == 0;
    }


}