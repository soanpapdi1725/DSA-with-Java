package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size = input.nextInt();
        int[] integers = new int[size];

        for (int i = 0; i < integers.length; i++) {
            System.out.print("Enter the " + i + "th Element of array: ");
            integers[i] = input.nextInt();
        }
        for (int i = 0; i < integers.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(Arrays.toString(integers));
    }
}
