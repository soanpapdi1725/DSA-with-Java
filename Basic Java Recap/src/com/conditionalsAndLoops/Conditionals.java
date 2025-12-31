package com.conditionalsAndLoops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        Conditionals are used to tackle multiple cases occur in a program such as if this then do this, else do this
   /*
       if(condition){
       // block of code
    }else{
    // block of code
    }
   */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num % 2 != 0) {
            System.out.println("It is a Odd number");
        } else {
            System.out.println("It is a Even Number");
        }

        /*
         * if-else_if-else_if-else_if-else -> nested if-else -> if one true ignore others below it
         * if if if -> separate if else -> it checks every test case you want
         * */
    }
}
