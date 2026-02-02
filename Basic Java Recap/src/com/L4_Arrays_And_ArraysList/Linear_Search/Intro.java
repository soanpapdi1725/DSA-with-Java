package com.L4_Arrays_And_ArraysList.Linear_Search;

public class Intro {
    /*
    Linear search is a searching technique to find a item
    or it's index where we iterate to each element one by one

    Best case: O(1) -> if target is at 1st index and on one check we found it
                      does not depend on number of size of array
                      graph of time(ms) y-axis vs size x-axis -> graph is parallel to x axis
    worst case: O(n) -> if target is at random number in a array where size can be n
                       In that case we require atmost n number of checks
                      graph of time(ms) y-axis vs size x-axis -> graph is linear to x & y axis

     */
    public static void main(String[] args) {
        int[] arr = {55, 9, 52, 96, 74, 10, 26, 7, -5, -10, 5, -4};
        int target = 5;
        System.out.println("Index of Target is: " + searchIndex(arr, target) + "\nitem was: " + searchItem(arr, target));
        System.out.println("Searched in range: " + searchItemInRange(arr, 74, 2, 8));
    }

    static int searchIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    static int searchItem(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return arr[index];
            }
        }
        return -1;
    }

    static int searchItemInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
