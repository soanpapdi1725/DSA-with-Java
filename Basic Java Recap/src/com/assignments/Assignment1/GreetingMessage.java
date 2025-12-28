package com.assignments.Assignment1;
import java.util.Scanner;
//2. Take name as input and print a greeting message for that particular name.
public class GreetingMessage {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Good morning! "+name+",\nHow can i help you?");
    }
}
