package com.assignments.Assignment1;

import java.util.Scanner;
//8. To calculate Fibonacci Series up to n numbers.
public class StringPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word to check palindrome: ");
        String word = input.next();
        int i = 0, j = word.length() - 1;
        boolean isPalindrome =  true;
        while (i < j){
            if(word.charAt(i) != word.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome){
            System.out.println("Word is palindrome");
        }else {
            System.out.println("Word is not palindrome");
        }
    }
}
