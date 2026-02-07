package com.assignments.Assignment3;

import java.util.Scanner;

public class AdultOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age to know eligibility: ");
        int age = input.nextInt();
        System.out.println(isAdult(age) ? "eligible for vote" : "Not eligible for vote");
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

}
