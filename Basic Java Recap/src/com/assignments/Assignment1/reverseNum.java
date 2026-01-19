package com.assignments.Assignment1;

public class reverseNum {
    public static void main(String[] args) {
        int num = 1534236469;
        int rev = 0;
        System.out.println(num > Integer.MAX_VALUE);
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            rev = 0;
        } else {
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                // Overflow check
                rev = rev * 10 + digit;
            }
        }

        System.out.println(rev);
    }
}
