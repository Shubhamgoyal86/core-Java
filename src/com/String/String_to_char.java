package com.String;

public class String_to_char {
    public static void main(String[] args) {
        String str = new String("My name is Shubham goyal");
        char[] chararray = str.toCharArray();
        for (char c:chararray) {
            System.out.println(c);
        }
    }
}
