package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class FindInMountainArray1095 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
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
        int ans = binarySearch(array, target, 0, s, true);
        if (ans != -1) return ans;
        return binarySearch(array, target, s + 1, array.length - 1, false);
    }

    static int binarySearch(int[] array, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (array[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (array[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
