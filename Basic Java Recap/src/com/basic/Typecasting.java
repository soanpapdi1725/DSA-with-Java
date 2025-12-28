package com.basic;

import java.util.Scanner;

public class Typecasting {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
//         will input the integer and store in integer
//        int integer = input.nextInt();

//    ⭐  TYPECASTING
//    ->  int is small box you cannot put bigger things in it
//        int floatt1 =  input.nextFloat(); //❌
//        int floatt2 = (int) input.nextFloat(); //✅ explicitly we are putting float value in integer datatype
//        int floatt3 = (int) (51.5236f); //✅ explicitly we are putting float value in integer datatype
//        System.out.println("giving float value but showing it as integer:" + floatt);


//    ->  float is bigger box so small datatypes(int) values can be inside it example int
//        float intt1 = input.nextInt();

//     ⭐ Automatic Type Promotion in Expression
//     -> int a =  input.nextInt();
//        byte num = (byte)(a);
//        if more than that it shows remainder num % 256 = remainder(will print)
//        System.out.println("if more than 256 will give num%256 = " + num);

//        In Expression the datatype which is biggest it gets converted into that
        byte b = (byte) 215;
        char c = 's'; //ascii value = 115
        short s = 125;
        int i = 5933;
        float f = 55.963f;
        double d = 3.899521;
        System.out.println((i*b)+"= \n"+(s/f)+"= \n"+(c/d)+ "= ");
        System.out.println((i*c)+(f/s)-(b/d));


    }
}
