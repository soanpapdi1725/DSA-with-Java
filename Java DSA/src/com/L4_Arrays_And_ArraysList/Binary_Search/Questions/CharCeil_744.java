package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// if character at the end < target or if character at the end equals to the target return the first element of the array
// use equals when u want to avoid
/*
letters[start % array.length]
it means for example array length is 4
if start == end and then start = mid + 1 means Start = 4 now
start % length of array = 1 and give first element of array

if it is less than of it it directly give that as remainder
letters [2 % 4] = letters[2]
 */

import java.util.Arrays;

public class CharCeil_744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'}; // (99,102, 106) target -> 99 < 102
        char target = 'c';
        System.out.println(Arrays.toString(letters));
        System.out.println("Index of just Greater or equal to target is: " +
                CeilBinarySearch(letters, target));
    }

    static char CeilBinarySearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else if (letters[mid] >= target) {
                end = mid - 1;
            }
        }
        System.gc();
        return letters[start % letters.length];
    }
}
