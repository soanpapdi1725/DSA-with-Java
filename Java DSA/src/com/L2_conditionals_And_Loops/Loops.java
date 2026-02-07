package com.L2_conditionals_And_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Loops are used for performing something which needs to be done continously
        /*
        for loop
         * for(initilialization; condition; increment/decrement){
         *     //block of code
         * }
         * */

//        System.out.print("Enter your number");
//        int num = input.nextInt();
//        for (int i = 0; i <= num; i = i + 2) {
//            System.out.print(i + " ");
//        }

        /*
         * while loop
         * initialization
         * while(condition){
         * increment/decrement
         * }
         * */
//        System.out.print("Enter your number: ");
//        int num = input.nextInt();
//        int i = 0;
//        while (i <= num) {
//            System.out.print(i + " ");
//            i = i + 2;
//        }


        /*
         * do-while loop -> atleast checks one time
         * initialization
         * do{
         * increment/decrement
         * }while(condition)
         * */
        int num = 1;
        do {
            System.out.println("Hello world");
        } while (num != 1);
    }
}
