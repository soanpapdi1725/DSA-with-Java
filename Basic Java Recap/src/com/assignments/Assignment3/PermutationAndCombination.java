package com.assignments.Assignment3;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        System.out.print("Enter the r: ");
        int r = input.nextInt();

        int permutation = factorial(n) / factorial((n - r));
        int diff = n - r;
        int combination = factorial(n) / (factorial(r) * factorial(diff));
        System.out.println("Permutation: " + permutation + "\ncombination: " + combination);
    }

    static int factorial(int n) {
        int fact = 1;
        if (n < 0) {
            return 1;
        }
        if (n == 0) {
            return fact;
        } else {

            return fact = n * factorial(n - 1);
        }
    }
}
