package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

import java.util.Arrays;

/*
  Ques-> Suppose you have given an Array ->[4,8,9,14,19,25,29,30,35,47,50] and target -> 43
  find the number which is just greater or equal to TARGET if it exists in array which is 47

  example
  Array ->[4,8,9,14,19,25,29,30,35,47,50], Target -> 43

  start -> 0, end -> 10, mid -> 5
  array[mid] = 25 == 43 ❌ target is bigger

  start -> 6, end -> 10, mid -> 8
  array[mid] = 35 == 43 ❌ target is bigger

  start -> 9, end -> 10, mid -> 9
  array[mid] = 47 == 43 ❌ target is smaller

  start -> 9, end -> 8, mid -> 9 ->> Breaking the loop and returning array[start]
  array[mid] = 47 == 43 ❌

  return array[start]
 */
public class CeilProblemBS {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 14, 19, 25, 29, 30, 35, 47, 50};
        int target = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(CeilBinarySearch(arr, target));
    }

    static int CeilBinarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return array[mid];
            }
            if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return array[start];
    }
}
