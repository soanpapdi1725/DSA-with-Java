package com.basic;

import java.util.Scanner;

public class Main {
//    if file name is Main.java then
//    it's public class should be same name as it's file name e.g Main
//    if not public he can put anything as his class Name
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("<----New world---->");
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("So You told your name is: " + name);
    }
}
