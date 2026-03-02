package com.L5_Strings_And_StringBuilder;

public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // stringBuilder is different class created for String operations like this where u have to do string Manipulation
        for (int i = 0; i < 26; i++) {
            builder.append((char) ('a' + i));
            builder.append(" ");
        }
        System.out.println(builder);
    }
}
