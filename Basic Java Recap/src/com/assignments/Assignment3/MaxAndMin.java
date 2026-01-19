package com.assignments.Assignment3;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Program to findout Max and Min out of 3 given numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three nums: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Maximum of your given Numbers: " + findMax(num1, num2, num3));
        System.out.println("Minimum of your given Numbers: " + findMin(num1, num2, num3));
    }

    static int findMax(int a, int b, int c) {
        return a > b ? a : (b > c ? b : c);
    }

    static int findMin(int a, int b, int c) {
        return a > b ? b : (a > c ? c : a);
    }
}
