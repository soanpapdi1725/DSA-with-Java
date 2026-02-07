package com.L4_Arrays_And_ArraysList.Linear_Search;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts) {
            int sum = 0;
            for (int col : row) {
                sum += col;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
