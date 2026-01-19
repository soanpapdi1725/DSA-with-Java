package com.L2_conditionalsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        char firstLetter = input.next().trim().charAt(0);
        if (!(firstLetter > 'a' && firstLetter < 'z')) {
            System.out.println("first letter was Capital");
        } else {
            System.out.println("first letter was small");
        }
    }
}
