package com.conditionalsAndLoops;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max;
        if (a > b) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max + " is max number");
    }
}
