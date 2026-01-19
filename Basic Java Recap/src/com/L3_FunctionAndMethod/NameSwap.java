package com.L3_FunctionAndMethod;

public class NameSwap {
    public static void main(String[] args) {
        String name = "Sonu Yadav";
        changeName(name);
        System.out.println("Sonu Yadav");
    }

    static void changeName(String naam) { // copy of name is passed name = "Sonu Yadav"
        naam = "Sahil Yadav"; // now it is pointing to different object or value in the heap which is "Sahil yadav"
    }

//    this is not working because we cannot directly modify the string
//    Strings and arrays are objects in this the copy of the entire array or strings is passed in function
}
