package com.FunctionAndMethod;

public class NameSwap {
    public static void main(String[] args) {
        String name = "Sonu Yadav";
        changeName(name);
        System.out.println("Sonu Yadav");
    }

    static void changeName(String naam) { // copy of name is passed name = "Sonu Yadav"
        naam = "Sahil Yadav"; // now it is pointing to different object or value in the heap which is "Sahil yadav"
    }
}
