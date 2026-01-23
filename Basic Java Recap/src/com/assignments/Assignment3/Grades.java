package com.assignments.Assignment3;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Grades out of 100: ");
        float marks = input.nextFloat();
        if (marks < 0 || marks > 100) {
            System.out.println("Marks should be higher than 0 and less than 100");
        } else {
            System.out.println("Your grades are:- " + grades(marks));
        }
    }

    static String grades(float marks) {
        if (marks >= 91) {
            return "AA";
        } else if (marks >= 81) {
            return "AB";
        } else if (marks >= 71) {
            return "BB";
        } else if (marks >= 61) {
            return "BC";
        } else if (marks >= 51) {
            return "CD";
        } else if (marks >= 41) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
