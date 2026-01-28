package com.L4_Arrays_And_ArraysList;

import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Max value of your array is: " + maxVal(arr));
    }

    static int maxVal(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
