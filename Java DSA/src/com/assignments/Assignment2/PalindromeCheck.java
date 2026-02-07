package com.assignments.Assignment2;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check the palindrome: ");
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (num == rev) {
            System.out.println("It is palindrome");
        } else {
            System.out.println(rev);
            System.out.println("It is not palindrome");
        }
    }
}
