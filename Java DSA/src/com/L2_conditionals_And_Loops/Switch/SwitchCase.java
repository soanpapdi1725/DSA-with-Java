package com.L2_conditionals_And_Loops.Switch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch Syntax
         * switch(variable on which condition will be checked){
         *   case condition1:
         *     // Expression which will performed
         *     // break;
         *   case condition2:
         *     // Expression which will performed
         *     // break;
         * case condition3:
         *     // Expression which will performed
         *     // break;
         * default:
         *     // Expression which will performed
         * }
         * */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Red Colour fruit");
                break;
            case "banana":
                System.out.println("The Yellow colour long fruit");
                break;
            case "Grape":
                System.out.println("Small green fruit");
                break;
            default:
                System.out.println("Invalid Fruit name is provided");
        }
        /*
         Advanced JAVA SWITCH
         * switch(variable on which condition will be checked){
         *   case condition1 ->  // Expression which will performed
         *   case condition2 -> // Expression which will performed
         *   case condition3 -> // Expression which will performed
         *   default -> // Expression which will performed
         * }
         * */
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Red Colour fruit");
            case "banana" -> System.out.println("The Yellow colour long fruit");
            case "Grape" -> System.out.println("Small green fruit");
            default -> System.out.println("Invalid Fruit name is provided");
        }
        /*
        Advanced JAVA SWITCH to Execute Multiline things
         * switch(variable on which condition will be checked){
         *   case condition1 ->  {
         *   // Expression which will performed
         * }
         *   case condition2 -> {
         *   // Expression which will performed
         * }
         *   case condition3 -> {
         *   // Expression which will performed
         * }
         *   default -> {
         *   // Expression which will performed
         * }
         * }
         * */
    }
}
