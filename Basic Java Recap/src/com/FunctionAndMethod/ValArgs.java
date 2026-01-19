package com.FunctionAndMethod;

import java.util.Arrays;

public class ValArgs {
    public static void main(String[] args) {
        values(8, 9, 6, 2, 14, 56);
        Strings("Kunal", "Chinaal", "Rahul", "Rishu", "Suryaveer");
        mixedMultiple(1, 2, "Rahul", "Rishu");
    }

    static void values(int... num) {
        System.out.println(Arrays.toString(num));
    }

    static void Strings(String... word) {
        System.out.println(Arrays.toString(word));
    }

    // when you want multiple same type of parameters to pass you can use ...
// and it should be in the last
    static void mixedMultiple(int num1, int num2, String... word) {
        System.out.println(Arrays.toString(word));
    }
}
