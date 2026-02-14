package com.L4_Arrays_And_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_integer {
    public static void main(String[] args) {
        int[] nums = {0};
        int k = 10000;
        List<Integer> num = addToArrayForm(nums, k);
        System.out.println(Arrays.toString(num.toArray()));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> array = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            array.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
//        in case k is still in 2 or digits it will add it in front and remove last digit
        while (k > 0) {
            array.add(0, k % 10);
            k /= 10;
        }
        return array;
    }

}
