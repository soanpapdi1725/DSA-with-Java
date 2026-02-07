package com.L4_Arrays_And_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Syntax
        ArrayList<ArrayList<DataType>> list2D =  new ArrayList<>();
        and you have to intialize array's inside it
         */

        List<List<Integer>> list2D = new ArrayList<>();

//      Initialized according to the need
//        inside them array should be there
//        if you don't initialize each array inside it then it will be null
        for (int i = 0; i < 5; i++) {
            list2D.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the " + (j + 1) + "th element for " + (i + 1) + "th row : ");
                list2D.get(i).add(input.nextInt());
            }
        }
        System.out.println(list2D);
        list2D.set(4, new ArrayList<>(List.of(10, 11, 12)));
        System.out.println(list2D);


    }
}
