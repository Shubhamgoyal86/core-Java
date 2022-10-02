package com.String;

import java.util.StringTokenizer;

public class String__tokenizer {

    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("My name is Shubham Goyal");
        while (str.hasMoreTokens()){
            System.out.println(str.nextToken(" "));
        }

    }
}
