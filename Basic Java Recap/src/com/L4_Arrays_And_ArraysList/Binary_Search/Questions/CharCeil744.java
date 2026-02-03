package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// if character at the end < target or if character at the end equals to the target return the first element of the array
// use equals when u want to avoid

import java.util.Arrays;

public class CharCeil744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'}; // (99,102, 106) target -> 99 < 102
        char target = 'c';
        System.out.println(Arrays.toString(letters));
        System.out.println("Index of just Greater or equal to target is: " +
                CeilBinarySearch(letters, target));
    }

    static char CeilBinarySearch(char[] array, char target) {

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] <= target) {
                start = mid + 1;
            } else if (array[mid] >= target) {
                end = mid - 1;
            }
        }
        System.gc();
        return array[start % array.length];
    }
}
