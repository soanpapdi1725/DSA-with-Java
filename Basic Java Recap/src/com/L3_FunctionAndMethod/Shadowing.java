package com.L3_FunctionAndMethod;

public class Shadowing {
    static int x = 70;

    public static void main(String[] args) {
        System.out.println(x);
//      if you declare x outside and inside declare it then
//      it only wants value of x inside this scope
//        int x = 90;
        int x;
//        System.out.println(x); -> saying it is not initialized matlab value ni daali
        x = 90;
        System.out.println(x);
        xValue();
    }

    static void xValue() {
        System.out.println(x);
    }
}
