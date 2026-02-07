package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

//Ques -> Find the position of the element in the sorted array of infinity size(arr.length cannot be used)
/*
Array -> [2,3,5,6,9,15,17,24,29,37,48,50,56,59,67,88,99...♾️]
target -> 59

ans->
we can take chunks of equal size
for example
1. start = 0, end = 5
2. start = 6, end = 11
3. start = 12, end = 17
if target >= array[start] or target <= array[end] then just Binary Search in the array

or we can take chunks initally with small size and exponentially can grow it
for example:-
condition for FindingRange loop can be that array[end] < target
Jab tak array[end] <= target se tb tk chlega jese hii array[end] > hua target se mtlb range me aa gya hai and loop todne ka time aa gya hai
1. start = 0, end = 1 2 power 1
2. start = 2, end = 5 (old start = end + 1, old end = end + 2 power 2)
3. start = 6, end = 13 (old start = end + 1, old end = end + 2 power 3)
4. start = 14, end = 29 (old start = end + 1, old end = end + 2 power 4)
5. start = 30, end = 61 (old start = end + 1, old end = end + 2 power 5)
if target >= array[start] or target <= array[end] then just Binary Search in the array


end = end + (end - start + 1) * 2;
(end - start + 1) -> helps in knowing the length of the chunk
for ex
start = 2, end = 5
(5 - 2 + 1) => 4 * 2 => 8 + 5 (end) => newEnd => 13
start = 6, end = 11
(13 - 6 + 1) => 8 * 2 => 16 + 13 (end) => newEnd => 29
 */
public class InfinitySortedArrayBS {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i * i;
        }
        int target = 25;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (array[end] < target) { // chota hai tbhi tk call karo agar equal aa gya toh start and end
            // badal dega which surpase the range if it is in the starting

            if (array[start] >= target && array[end] >= target) {
                break;
            }
            int newStart = end + 1; //like temp
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(array, target, start, end);
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
