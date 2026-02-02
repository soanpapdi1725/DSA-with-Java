package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {55, 59, 15, 8, 97, 69};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
