package com.L5_Strings_And_StringBuilder;

public class PrettyPriniting {
    public static void main(String[] args) {
        float a = 458.1546f;
        // to print float and round of float or decimal number
        // syntax -> System.out.printf("string.. %.2f", floatVariable)
        // here at the place of %.2f or %.3f the float variable will be printed and will print 2 if %.2f is there or 3 if %.3f is there
        System.out.printf("Formatted float number with round of %.2f", a);

//        example
        System.out.printf("\nPi value rounded off %.2f", Math.PI);
        String name = "Sonu", greeting = "Happy Holi";
        System.out.printf("\nMy name is %s and my wishes for %s", name, greeting);
    }
}
