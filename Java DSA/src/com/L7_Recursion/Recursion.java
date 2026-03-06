package com.L7_Recursion;

/*
    Recursion is a function which calls itself again and again in a loop in order to solve the problem

    Why to use Recursion->

    ⭐ It helps us in solving bigger/Complex problems in a simpler way.

    ⭐ You can convert recusrion Solution into Loops(Iteration) and vice versa

    ⭐ Space complexity is not constant because of recursive calls

    Space complexity -> Loops O(1)
    Space Complexity -> recursion O(N)

    ⭐ It helps in breaking down bigger problem into smaller problem
*/
public class Recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
