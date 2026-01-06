package com.assignments.Assignment2;

import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String expression = "";
        while (true) {
            System.out.println("Choose A valid option from below:");
            System.out.println("1. Add one more number");
            System.out.println("2. Calculate sum");
            int option = input.nextInt();
            if (option == 1) {
                System.out.print(expression);
                int num = input.nextInt();
                sum = sum + num;

                expression += num + " + ";
                count++;
            } else if (option == 2) {
                System.out.println(expression.substring(0, expression.length() - 3) + " = " + sum);
                break;
            } else {
                System.out.println("Invalid option is choosen");
                break;
            }
        }
    }
}
