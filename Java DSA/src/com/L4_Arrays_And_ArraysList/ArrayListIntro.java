package com.L4_Arrays_And_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        /*
        Syntax:-
        ArrayList-> It is a dynamic array in Java similar to vector of C++
        Arraylist is a type of array which continously makes new array(double of size of Old array)
        if old Array is half filled
        it has no fixed size you can fill any number of element as you require
        ArrayList<Datatype> variable_Name = new ArrayList<>();
        */
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(5);
        /*
        OPERATIONS IN ARRAYLIST
          to add element -> use add method and provide element to insert on instance of ArrayList
          to get element -> use get method and provide index on instance of ArrayList
          to replace or modify or update element -> use set method and provide index and new element on instance of ArrayList
          to delete any element in array -> use Remove method and provide index on instance of ArrayList


          ArrayList is different from simple Fixed Array
          if in any function both can be return type
          static int[] functionName-> returning simple fixed array
          static ArrayList<Integer> functionName-> returning ArrayList


          if u want your arrayList to be converted into simple array while returning just use toArray function
         */

        list.add(45);
        list.add(26);
        list.add(963);
        list.add(455);
        list.add(89);
        list.add(105);
        list.add(96);
        list.add(42);
        list.add(93);
        list.add(45);
        list.add(99);
        list.add(75);
        list.add(63);
        list.add(75);
        list.add(85);
        list.add(36);
        list.add(75);
        list.add(41);
        list.add(10);
        list.add(7);
        list.add(9);
        System.out.println(list); // automatically calls Arrays.toString method in it's implementation

        List<Integer> list2 = new ArrayList<>(3);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + "th element: ");
            list2.add(input.nextInt());
        }
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + ", ");
        }

        List<Integer> listOperations = new ArrayList<>();

        listOperations.add(55);
        listOperations.add(10);
        listOperations.add(41);
        listOperations.add(10);
        listOperations.add(102);
        System.out.println("\n\n" + "list operations\n" + listOperations);// [55,10,41,10,102]
        listOperations.set(4, 50); //index 4's element will be replaced with 50
        System.out.println("\nafter replacing index 4 with 50 \n" + listOperations);
        listOperations.remove(4);
        System.out.println("\nafter Removing index 4's element\n" + listOperations);

    }

}
