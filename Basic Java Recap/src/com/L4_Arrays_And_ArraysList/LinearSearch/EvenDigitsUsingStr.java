package com.L4_Arrays_And_ArraysList.LinearSearch;

public class EvenDigitsUsingStr {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//    Slower because converting number to string and then storing it in heap takes much time then simple while loop

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
        String str = "";
        str += num;
        return str.length() % 2 == 0;
    }
}
