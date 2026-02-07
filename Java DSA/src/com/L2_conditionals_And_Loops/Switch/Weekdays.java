package com.L2_conditionals_And_Loops.Switch;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int dayNo = input.nextInt();
//        switch (dayNo) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day number");
//        }
        switch (dayNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
        switch (dayNo) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Weekday");
            }
            case 6, 7 -> {
                System.out.println("Weekend");
            }
            default -> System.out.println("Invalid day number");
        }
    }
}
