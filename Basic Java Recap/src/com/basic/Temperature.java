package com.basic;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("<--Celsius to Fahrenheit Temperature convertor-->");
        System.out.print("Enter Your Temperature in Celsius: ");
        float c = input.nextFloat();
        float f = c*9/5 + 32;
        System.out.println("Temperature in fahrenheit: " +f);
    }
}
