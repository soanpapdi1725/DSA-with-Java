package com.assignments.Assignment2;

import java.util.Scanner;

public class NCRandNPR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        System.out.print("Enter the r: ");
        int r = input.nextInt();
        int factN = 1, factR = 1, factNR = 1;

//      for N
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
//      for r
        for (int i = 1; i <= r; i++) {
            factR *= i;
        }
//      for nr
        for (int i = 1; i <= (n - r); i++) {
            factNR *= i;
        }

        float permutation = (float) factN / factNR;
        float combination = (float) factN / (factR * factNR);

        System.out.println("Permutation for " + n + "P" + r + ": " + permutation + "\nCombination for " + n + "C" + r + ": " + combination);

    }
}
