package com.L4_Arrays_And_ArraysList.Binary_Search.Questions;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }


    static int mySqrt(int x) {
        if (x < 2) return x;
        int s = 1;
        int e = x / 2;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }
}
