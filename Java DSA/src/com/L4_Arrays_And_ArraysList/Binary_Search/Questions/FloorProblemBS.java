package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

import java.util.Arrays;

/*
  Ques-> Suppose you have given an Array ->[4,8,9,14,19,25,29,30,35,47,50] and target -> 43
  find the number which is just smaller or equal to TARGET if it exists in array which is 35

  example
  Array ->[4,8,9,14,19,25,29,30,35,47,50], Target -> 35

  start -> 0, end -> 10, mid -> 5
  array[mid] = 25 == 43 ❌ target is bigger

  start -> 6, end -> 10, mid -> 8
  array[mid] = 35 == 43 ❌ target is bigger

  start -> 9, end -> 10, mid -> 9
  array[mid] = 47 == 43 ❌ target is smaller

  start -> 9, end -> 8 ->> Breaking the loop and returning array[end] == 35 smaller than target

  return array[end]
 */
public class FloorProblemBS {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 14, 19, 25, 29, 30, 35, 47, 50};
        int target = 2;
        System.out.println(Arrays.toString(arr));
        int floorIndex = FloorBinarySearch(arr, target);
        System.out.println("Index of just smaller or equal to target is: " +
                floorIndex);
    }

    static int FloorBinarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;
//        if (target < array[start]) {
//            return -1;
//        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
