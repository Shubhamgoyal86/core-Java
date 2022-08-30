package com.RegularExprrssions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifriers {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*");
        Matcher m = p.matcher("abbaabaaab");
        while (m.find()){
            System.out.println(m.start()+"..."+m.group());
        }
    }
}
