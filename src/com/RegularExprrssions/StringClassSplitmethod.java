package com.RegularExprrssions;

public class StringClassSplitmethod
{
    public static void main(String[] args) {
        String s= "My name is Shubham";
        String[] s1= s.split("\\s");
        for (String s2:s1){
            System.out.println(s2);
        }
    }
}
