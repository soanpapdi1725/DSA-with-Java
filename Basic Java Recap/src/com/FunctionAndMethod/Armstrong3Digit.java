package com.FunctionAndMethod;

import java.util.Scanner;

public class Armstrong3Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number to check armstrong: ");
//        int num = input.nextInt();
//        System.out.println(isArmstrong(num) ? "It is Armstrong Number" : "It is not armstrong Number");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return original == sum;
    }
}
