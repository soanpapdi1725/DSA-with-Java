package com.L5_Strings_And_StringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // output -> 195
        System.out.println("a" + "b"); // output -> "ab"
        System.out.println((char) ('a' + 3)); // output -> d
        System.out.println("a" + 1); // output -> "a1"
        //int which 1 here will be converted into Integer class's object and then it gonna call toString()
        // this is same as after few steps: "a" + "1"
        System.out.println("Sonu" + new ArrayList<>()); // output -> Sonu[]
        // new ArrayList<>() -> empty object directly converted to empty array
        System.out.println("Sonu" + new Integer(56)); // output -> Sonu56


        //   System.out.println(new Integer(56) + new ArrayList<>()); // error
        /*
        In java + operator will be used
        1. with primitives for example 5 + 6 or 'a' + 4
        2. with objects too but with one condition that one of them
        should be String itself
        for example
        "Sonu" + new Integer(56)
         new Integer(56) + "" + new ArrayList<>() -> work
         */

        System.out.println(new Integer(56) + "" + new ArrayList<>());
        // now work because string is mandatory be there if used for objects
        // in any order
        System.out.println("" + new Integer(56) + new ArrayList<>());
        System.out.println("a" + 'b'); // output-> ab char converts into string
    }
}
