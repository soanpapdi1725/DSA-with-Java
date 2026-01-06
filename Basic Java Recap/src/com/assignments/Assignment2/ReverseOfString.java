package com.assignments.Assignment2;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String reverse = "";
        for (int i = word.length(); i > 0; i--) {
            reverse += word.charAt(i - 1);
        }
        System.out.println(reverse);
    }
}
