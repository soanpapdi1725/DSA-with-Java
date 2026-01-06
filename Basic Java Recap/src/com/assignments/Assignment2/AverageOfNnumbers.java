package com.assignments.Assignment2;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        int count = 0;
        while (true) {

            System.out.println("Choose one option from below");
            System.out.println("1. Add one more number");
            System.out.println("2. Calculate the Average");
            int option = input.nextInt();
            if (option == 1) {
                System.out.print("Enter the number: ");
                sum = sum + input.nextInt();
                count++;
            } else if (option == 2) {
                avg = sum / count;
                System.out.print("Average is: " + avg);
                break;
            } else {
                System.out.println("Choose valid option");
                avg = sum / count;
                System.out.println("Average is: " + avg);
                break;
            }
        }
    }
}
