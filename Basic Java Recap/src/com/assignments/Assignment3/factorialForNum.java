package com.assignments.Assignment3;

import java.util.Scanner;

public class factorialForNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number for factorial: ");
        int num = input.nextInt();
        System.out.println("factorial of your number: " + factorial(num));
    }

    static int factorial(int n) {
        int fact = 1;
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return fact;
        } else {
            return fact = n * factorial(n - 1);
        }
    }
}
