package com.FunctionAndMethod;

import java.util.Scanner;

public class SwapFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number for a: ");
        int a = input.nextInt();
        System.out.print("Enter Number for b: ");
        int b = input.nextInt();

        swap(a, b);
    }

    static void swap(int a, int b) {
        System.out.println("Before Swapping:- \na: " + a + "\nb: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:- \na: " + a + "\nb: " + b);
    }
}
