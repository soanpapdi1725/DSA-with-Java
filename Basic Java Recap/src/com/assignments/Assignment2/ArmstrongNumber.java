package com.assignments.Assignment2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check the Armstrong number: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("It is Armstrong number");
        } else {
            System.out.println("It is not armstrong number");
        }
    }
}
