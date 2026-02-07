package com.assignments.Assignment3;

import java.util.Scanner;

public class MultiplyTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your Second number: ");
        double num2 = input.nextDouble();
        System.out.println("Multiplication of Two nums: " + multiply(num1, num2));
    }

    static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
