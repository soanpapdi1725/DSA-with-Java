package com.L4_Arrays_And_ArraysList.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String word = "moti buddhi wale";
        char ch = 'b';
        System.out.println("Index of the target Character in following String is: "
                + searchStringIndex(word, ch)
                + " and character was: " + (char) searchStringChar(word, ch));
        System.out.println(searchCharInRange("moti buddhi wale bhaiya", 'b', 12, 17));
    }

    // Searched for index of target element in String
    static int searchStringIndex(String word, char ch) {
        if (word.isEmpty()) {
            return -1;
        }
        for (int index = 0; index < word.length(); index++) {
            if (word.toLowerCase().charAt(index) == ch) {
                return index;
            }
        }
        return -1;
    }

    //    Searched for element in String
    static int searchStringChar(String word, char ch) {
        if (word.isEmpty()) {
            return -1;
        }
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == ch) {
                return word.charAt(index);
            }
        }
        return -1;
    }

    //    Searched in a range
    static int searchCharInRange(String word, char ch, int start, int end) {
        if (word.isEmpty()) {
            return -1;
        }
        if (start == end) {
            return start;
        }
        for (int index = start; index <= end; index++) {
            if (word.charAt(index) == ch) {
                return index;
            }
        }
        return -1;
    }
}
