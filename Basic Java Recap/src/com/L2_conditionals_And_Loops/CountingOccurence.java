package com.L2_conditionals_And_Loops;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();
        System.out.print("Enter the number to count occurence: ");
        int n = input.nextInt();
        int count = 0;
        while (num != 0) {
            long rem = num % 10;
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(n + " number occured in the given number " + count + " times");
    }
}
