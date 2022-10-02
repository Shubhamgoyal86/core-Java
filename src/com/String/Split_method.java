package com.String;

public class Split_method {
    public static void main(String[] args) {
        String str = new String("Shubham goyal is the best ");
        String[] arrstr = str.split(" ");
        for (int i =0;i<arrstr.length;i++){
            System.out.println(arrstr[i]);
        }
    }
}
