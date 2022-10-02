package com.String;

public class Subsequence {
    public static void main(String[] args) {
        String str = "Welcome";
        CharSequence charSequence = str.subSequence(3,6);
        String strchar = (String) charSequence;
        System.out.println("Sub sequence =>"+strchar);
    }
}
