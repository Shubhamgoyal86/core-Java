package com.RegularExprrssions;

import java.util.regex.Pattern;

public class PatternclassSplitMethod {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\s");
       String[] str           = p.split("Shubham goyal");
       for (String s1:str){

           System.out.println(s1);

       }
    }
}
