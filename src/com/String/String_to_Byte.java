package com.String;

public class String_to_Byte {
    public static void main(String[] args) {
        String  str ="Shubham";
        byte[] bytestr = str.getBytes();
        for (byte c: bytestr) {
            System.out.println(c);

        }
    }
}
