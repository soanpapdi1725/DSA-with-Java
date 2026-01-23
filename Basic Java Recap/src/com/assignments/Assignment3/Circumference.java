package com.assignments.Assignment3;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        float radius = input.nextFloat();
        System.out.println("Circumference of circle: " + circumference(radius));
    }

    static double circumference(float radius) {
        return (float) 2 * 3.14 * radius;
    }

}
