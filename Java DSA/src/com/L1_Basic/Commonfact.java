package com.L1_Basic;

import java.util.Scanner;

public class Commonfact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        int lcm = (num1 * num2) / hcf;

        System.out.println("Lcm is:" + lcm + "\nHCF is:" + hcf);
    }
}
