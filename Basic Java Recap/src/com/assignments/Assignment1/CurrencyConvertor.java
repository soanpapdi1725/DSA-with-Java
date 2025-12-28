package com.assignments.Assignment1;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Currency in rupees: ");
        float rupees = input.nextFloat();
        float dollar = rupees/89.81f;
        System.out.println("Currency in $"+ dollar);
    }
}
