package com.assignments.Assignment3;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to check prime or not: ");
        int num = input.nextInt();
        System.out.println(isPrime(num) ? num + " is Prime" : num + " is not Prime");
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
