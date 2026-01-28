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

        
    }

}
