package com.String;

public class Sttring_intern {
    public static void main(String[] args) {


        String str = "Hello";

        String str1 = new String("Hello");
        System.out.println(str==str1);
        String str2 = str1.intern();
        System.out.println(str==str2);
    }
}
