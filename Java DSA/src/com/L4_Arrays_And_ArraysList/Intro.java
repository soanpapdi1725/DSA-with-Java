package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        /*
          Syntax:-
          dataType[] variable_Name = new dataType[size];
          dataType[] variable_Name; -> declaration
          variable_Name = new dataType[size]; initialization
          or
          dataType[] variable_Name2 = {value1, value2, value3, ...};
          -> new helps in allocating the memory in the heap
          -> in Java, the continuity of data allocation of array is depends on JVM
          -> for arrays of primitives default values are
          int, long -> 0
          float, double -> 0.00
          boolean -> false

          -> for arrays of non primitives default values are
          String -> null
          object -> null

          Example:-
          int[] Array = new int[5]; default value -> 0
          String[] Str = new String[5]; default value -> null

         */
        int[] arrInt = new int[5];
        System.out.println(Arrays.toString(arrInt));
        String[] arrStr = new String[5];
        System.out.println(Arrays.toString(arrStr));
        arrInt[0] = 5;
        arrInt[1] = 16;
        arrInt[2] = 1;
        arrInt[3] = 6;
        arrInt[4] = 7;
        System.out.println(Arrays.toString(arrInt));
        arrStr[0] = "Raj";
        arrStr[1] = "Rajesh";
        System.out.println(Arrays.toString(arrStr));

    }
}
