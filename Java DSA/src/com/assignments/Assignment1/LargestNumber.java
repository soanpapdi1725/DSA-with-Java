package com.assignments.Assignment1;

import java.util.Scanner;
//5. Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(num1+" is largest & "+num2+" is smallest");
        }else {
            System.out.println(num2+" is largest & "+num1+" is smallest");
        }
    }
}
