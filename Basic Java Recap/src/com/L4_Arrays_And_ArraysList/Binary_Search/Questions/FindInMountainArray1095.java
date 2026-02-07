package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class FindInMountainArray1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 1};
        int target = 3;
        System.out.println(peakIndexInMountainArray(arr, target));
    }

    static int peakIndexInMountainArray(int[] array, int target) {
        int s = 0;
        int e = array.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (array[m] < array[m + 1]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return binarySearch(array, target, s);
    }

    static int binarySearch(int[] array, int target, int peak) {
        int start = 0;
        int end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = peak + 1;
        end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
