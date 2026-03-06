package com.L7_Recursion.Question;

/*
How can we get the fibonacci number of Nth term

0th 1th 2nd 3rd 4th 5th 6th 7th 8th ..........N
 0   1   1   2   3   5   8   13  21     (N-1) + (N-2)

fibonacci(N) = fibonacci(N-1) + fibonacci(N-2)
 */
public class Nth_Fibonacci_number_recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
