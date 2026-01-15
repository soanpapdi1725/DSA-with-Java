package com.FunctionAndMethod;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        int addition = sum(20, 30);
        System.out.println(addition);

    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = input.nextInt();
        System.out.println("Sum is: " + (num1 + num2));

    }

    static int sum(int a, int b) {
        return a + b;
    }
}
