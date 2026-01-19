package com.L3_FunctionAndMethod;

import java.util.Scanner;

public class StringExample {
    /*
     * access_Specifier static return_type name(parameters){
     *     //BODY of function
     *    return statement;
     * }*/
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String greets = greeting(input.nextLine());
        System.out.print("Enter your Name: ");
        String message = mygreets(input.next());
        System.out.println(message);
    }

    static String mygreets(String name) {
        String message = "Hey, " + name;
        return message;
    }

    static String greeting(String greets) {
        System.out.println(greets);
        return greets;
    }
}
