package com.assignments.Assignment3;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        System.out.println("sum of two numbers: " + sum(num1, num2));
    }

    static double sum(double num1, double num2) {
        return num1 + num2;
    }
}
