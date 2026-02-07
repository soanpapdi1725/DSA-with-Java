package com.L4_Arrays_And_ArraysList;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {5, 9, 78, 29, 3};
        arrayChange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrayChange(int[] arr) {
//        In arrays which are objects when we pass it to function
//        it directly work on them rather than working on it's copy
        arr[4] = 49;
    }
}
