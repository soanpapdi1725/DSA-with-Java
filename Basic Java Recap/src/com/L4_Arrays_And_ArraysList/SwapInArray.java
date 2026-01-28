package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {55, 5, 96, 15, 25, 63};
        System.out.print("Enter the index1: ");
        int index1 = input.nextInt();
        System.out.print("Enter the index2: ");
        int index2 = input.nextInt();
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
