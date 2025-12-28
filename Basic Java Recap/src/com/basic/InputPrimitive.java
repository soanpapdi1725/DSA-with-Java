package com.basic;

import java.util.Scanner;

public class InputPrimitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
    }
}
