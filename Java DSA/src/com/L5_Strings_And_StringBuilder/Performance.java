package com.L5_Strings_And_StringBuilder;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += " " + ch;
        }
        // with this new object always getting created every single time due to that it comes a very bad practise in terms of performance
        // because of creation of new object every single time it reduces the performance
        // memory wastage because so much objects created and deleted simultaneously on every loop
        /*
        this is how it is being done
        series = ""
        i = 0
        series = "" + "a" -> old one will be deleted
        series = "a"
        i = 1
        series = "a" + "b"
        series = "ab" -> old "a" will be deleted using garbage collection

        time complexity for this gonna be O(N^2) because of creation of
        ["a", "ab", "abc", "abcd" ,"abcde" ... "abcdefgh...y"] ->
    size  1    2      3       4       5            26......N
         */
        System.out.println(series);
    }
}
