package com.FunctionAndMethod;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 88};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Change(int[] num) {
        num[0] = 99;
//        [1, 2, 3, 4, 88] is directly passed and whatever changes in the array happens it reflects the same
//        different from primitives
    }

}
