package com.FunctionAndMethod;

public class Overloading {
    // function overloading
    public static void main(String[] args) {
        String combinedWords = sum("Sonu", "Yadav");
        System.out.println(combinedWords);
        int sum2 = sum(7, 3);
        System.out.println(sum2);
        int sum3 = sum(15, 966, 85);
        System.out.println(sum3);
        int sum4 = sum(1, 2, 3, 4);
        System.out.println(sum4);
    }

    //    function with same name but parameters shouldn't be same in terms of types, numbers, datatypes

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static String sum(String word1, String word2) {
        return word1 + " " + word2;
    }
}
