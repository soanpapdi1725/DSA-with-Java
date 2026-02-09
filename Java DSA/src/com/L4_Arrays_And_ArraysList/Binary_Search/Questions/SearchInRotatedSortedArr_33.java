package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
/*
what is Rotated Array?

an Array where element are coming on index first or going to last index in a rotation

Array = [0,1,2,3,4,7,10,12,15]

1-> Clockwise(elememt coming last to first index) Rotation -> [15,0,1,2,3,4,7,10,12]
2-> Clockwise(elememt coming last to first index) Rotation -> [12,15,0,1,2,3,4,7,10]
3-> Clockwise(elememt coming last to first index) Rotation -> [10,12,15,0,1,2,3,4,7]
4-> Clockwise(elememt coming last to first index) Rotation -> [7,10,12,15,0,1,2,3,4]

What is Pivot in Rotated Sorted Array?
Pivot => The element from where the next numbers are Ascending
[7,10,12,15,0,1,2,3,4] -> here {7,10,12,15}, {0,1,2,3,4} are in ascending and
15 is pivot

Approach->
1. Find the Pivot the array
2. Do Binary search over to it
3. then to it's next index again do binary search to the Length - 1 of the array

Note:- If there is no duplicacy in the array then there will be single pivot there
 */
public class SearchInRotatedSortedArr_33 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        System.out.println(findPivot(arr));

    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // 4 cases can be true
            /*
            1. if end > mid && Mid element > (mid + 1) element -> return mid as pivot cuz it's bigger
                end > mid -> if by chance mid go more than end and eventually out of bound
            */
            if (end > mid && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            /*
            2. if start < mid && Mid element < (mid - 1) element -> return (mid - 1) as pivot cuz it's bigger
             start < mid -> if by chance mid go less than start and eventually out of bound
             */
            if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            /*
             3. if start element is bigger than mid element then it simply means
             it won't lie in the right of mid
             example:- [4,5,6,2,1,0,-1,-2] -> start= 4 > mid = 1 then trim from right to mid - 1
             Like this [4,5,6,2]
             */
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            }
            /*
             4. else when start element < mid element just trim from left and do start = mid + 1
             example:->
             [4,5,6,2] start = 4 < mid = 5 -> start = mid + 1
             */
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
