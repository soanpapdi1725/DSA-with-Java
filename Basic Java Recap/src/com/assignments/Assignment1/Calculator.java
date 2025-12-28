package com.assignments.Assignment1;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your equation ex (a + b): ");
        float num1 = input.nextFloat();
        String operator = input.next();
        float num2 = input.nextFloat();
        if(operator.equals("+")){
            System.out.println("addition of 2 number is: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("substraction of 2 number is: " + (num1 - num2));
        }
       else if(operator.equals("*")){
            System.out.println("multiplication of 2 number is: " + (num1 * num2));
        }else if(operator.equals("/")){
            System.out.println("division of 2 number is: " + (num1 / num2));
        }else{
            System.out.println("only +,-,/,* can be performed");
        }
    }
}
