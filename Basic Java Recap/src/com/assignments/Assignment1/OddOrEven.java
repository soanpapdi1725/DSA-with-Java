package com.assignments.Assignment1;

import java.util.Scanner;
// Write a program to print whether a number is even or odd, also take input from the user.
public class OddOrEven {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
