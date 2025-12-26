package com.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("<----New world---->");
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("So You told your name is: " + name);
    }
}
