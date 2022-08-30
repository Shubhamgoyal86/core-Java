package com.RegularExprrssions;
import  java.util.*;

public class Stringtokenization {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Shubham goyal is best");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken())
            ;
        }
        System.out.println("_____________________________________________________________________________");
        StringTokenizer mt = new StringTokenizer("28-08-24","-");
        while (mt.hasMoreTokens()){
            System.out.println(mt.nextToken());
        }

    }
}
