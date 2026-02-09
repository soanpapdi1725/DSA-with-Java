package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class SearchInRotatedSortedArr_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid // so that it won't go more than end will result in end[arr.length - 1] + 1
                    && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid // so that it won't go less than end will result in start[0] - 1
                    && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //We will skip the index from left and right both pointers
                // but before that we need to check ki start hii toh pivot nahi
                // agar start pivot hoga toh start ka index retur
                start++;
                end--;
            }
        }
    }
}
