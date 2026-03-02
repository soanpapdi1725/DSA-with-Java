package com.L5_Strings_And_StringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        /// String Methods
        String name = "Sonu Yadav  is Good guy";
        System.out.println(name.toLowerCase()); //-> not modifies the object of name creates a new object
        System.out.println(name.toUpperCase()); // -> not modifies the object of name creates a new object
        System.out.println("       Sonu    ".trim());
        "Sonu".chars().forEach(System.out::println);
        System.out.println(Arrays.toString("Sonu Yadav".toCharArray()));
        System.out.println(name.codePointAt(0));
        System.out.println(Arrays.toString(name.replace(" ", "-").split("-")));
        System.out.println(name.substring(0, 10));
        System.out.println(name.indexOf("u", 0, name.length() - 1));
        System.out.println(name.contains("z"));


        StringBuilder sB = new StringBuilder();
        sB.append("Sonu");
        sB.insert(sB.length(), " Yadav");
        System.out.println(sB);
        System.out.println(sB.capacity());
    }
}
