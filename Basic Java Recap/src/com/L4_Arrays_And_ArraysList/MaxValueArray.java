package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max value of your array is: " + maxVal(arr));
        System.out.println("Max value in range of your array is: " + maxValInRange(arr, 5, 6));
    }

    static int maxVal(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    static int maxValInRange(int[] array, int start, int end) {
        if (array.length == 0) {
            return -1;
        }
        if (start == end) {
            return array[start];
        }
        int maxValue = array[start];
        for (int i = start; i < end; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
