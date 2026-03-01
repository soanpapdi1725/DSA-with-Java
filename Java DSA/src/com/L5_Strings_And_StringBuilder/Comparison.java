package com.L5_Strings_And_StringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sonu";
        String b = "Sonu";
//        Both pointing to same object in String pool in heap, a & b pointing to "Sonu"
//        hence == will give true because it checks references
        System.out.println("a == b: " + (a == b));


        String name1 = new String("Sonu"); // in this case String Object will lie in heap outside String pool
        String name2 = new String("Sonu"); // in this case String Object will lie in heap outside String pool
//        by doing this we forcefully saying create the two separate objects of String and point to them
//        hence == won't work in this

        System.out.println("name1 == name2: " + (name1 == name2)); //-> give false because both have different references

        /*
        That's why we don't use == for String and array Comparison, because these only checks the reference of both are at one place or different place

        we use .equals() method of String Class to compare values of strings
         */

        System.out.println("name1.equals(name2): " + name1.equals(name2)); //-> true because checking the value not their references
    }

}
