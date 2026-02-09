package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class SearchInRotatedSortedArr_Duplicate_81 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        System.out.println(arr.length);
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
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
                /*
                but before that we need to check ki start hii toh pivot nahi
                if(arr[start] > arr[start+1]) then
                agar start pivot hoga toh start ka index return
                 */
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                // agar start pivot ni hua toh hii usko skip krenge
                start++;

                /*
                but before that we need to check ki (end-1) se hii toh pivot nahi
                if(arr[end - 1] > arr[end]) then
                agar end pivot hoga toh (end - 1) ka index return
                 */
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                // agar (end - 1) pivot ni hua toh hii usko skip krenge
                end--;
            } else if (arr[start] < arr[mid] || // this condition check-> is it sorted till start <-> mid or not if is then start = mid + 1
                    arr[start] == arr[mid] && arr[mid] > arr[end]) {
                /*
                this condition check-> in this we check after mid <-> end
                it is sorted or not meaning [2,2,2,5,7,2]
                if arr[mid] == arr[start] means identical till mid
                &&
                if(arr[mid] > arr[end])
                possible that pivot can be lie between mid and end
                 */
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
