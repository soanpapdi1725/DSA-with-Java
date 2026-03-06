package com.L7_Recursion;

public class Basic_Recursion {
    public static void main(String[] args) {
        message();
        /*
            Hello world
            Hello world
            Hello world
            Hello world
            Hello world
         */
    }

    static void message() {
        System.out.println("Hello world");
        message1();
        /*
            Hello world
            Hello world
            Hello world
            Hello world
         */
    }

    static void message1() {
        System.out.println("Hello world");
        message2();
        /*
            Hello world
            Hello world
            Hello world
         */
    }

    static void message2() {
        System.out.println("Hello world");
        message3();
        /*
            Hello world
            Hello world
         */
    }

    static void message3() {
        System.out.println("Hello world");
        message4();
        // "Hello World"
    }

    static void message4() {
        System.out.println("Hello world");
    }

}
