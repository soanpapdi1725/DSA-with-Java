package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

//https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
public class CountRotationOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(countOfRotation(arr));
    }

    static int countOfRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (e > m && arr[m] > arr[m + 1]) {
                return m;
            }
            if (s < m && arr[m] < arr[m - 1]) {
                return m - 1;
            }
            if (arr[m] == arr[s] && arr[m] == arr[e]) {
                /*
                shrink the size by doing increment from start and decrement from end
                but also check that start is pivot or not
                and end - 1 is pivot or not
                 */
                if (arr[s] > arr[s + 1]) {
                    return s;
                }
                // if not return then shrinked
                s++;
                if (arr[e] > arr[e - 1]) {
                    return e - 1;
                }
                e--;
            } else if (arr[s] < arr[m] || arr[m] == arr[s] && arr[m] > arr[e]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
