package com.assignments.Assignment1;

import java.util.Scanner;
//7. To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number till you want fibonacci series: ");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + " " + n2+ " ");
       while(n1+n2 <= n){
           sum = n1+n2;
           System.out.print(sum + " ");
           n1 = n2;
           n2 = sum;
       }
    }
}
