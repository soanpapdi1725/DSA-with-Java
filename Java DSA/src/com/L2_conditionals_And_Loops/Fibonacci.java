package com.L2_conditionals_And_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("Enter the nth number you want fibonacci: ");
        int n = input.nextInt();
        if (n <= 1) {
            System.out.print(a + " ");
        } else {
            System.out.print(a + " " + b + " ");
        }
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("\n" + n + "th number in fibonacci series is: " + c);
    }

}
