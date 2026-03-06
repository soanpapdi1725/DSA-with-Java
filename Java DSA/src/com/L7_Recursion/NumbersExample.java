package com.L7_Recursion;

/*
    Functions have same body & same work
    what if we have to do same for 1,00,000 numbers
 */
public class NumbersExample {
    public static void main(String[] args) {
        /*
            Print Number from 1 To 5
            use function and callbacks

         */
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }

}
