package com.L2_conditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter the numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            } else if (ch == 'x' || ch == 'X') {
                System.out.println("x Pressed program exited");
                break;
            } else {
                System.out.print("Invalid Operator");
            }
            System.out.println(ans);
        }
    }
}
