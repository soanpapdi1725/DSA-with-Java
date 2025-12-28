package com.assignments.Assignment1;

import java.util.Scanner;
//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterest {
    public static  void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Rate Time: ");
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();

        float SI = (p*r*t)/100;
        System.out.println("Simple Interest is: " + SI);
    }
}
