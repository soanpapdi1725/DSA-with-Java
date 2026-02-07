package com.assignments.Assignment3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to know Odd or even: ");
        int num = input.nextInt();
        System.out.println(isEven(num) ? num + " is Even" : num + " is Odd");
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
