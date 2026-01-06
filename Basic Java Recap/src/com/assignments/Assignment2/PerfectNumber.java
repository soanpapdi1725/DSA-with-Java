package com.assignments.Assignment2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check perfect number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("It is perfect number");
        } else {
            System.out.println("It is not perfect number");
        }
    }
}
