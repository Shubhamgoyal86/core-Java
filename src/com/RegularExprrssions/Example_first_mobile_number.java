package com.RegularExprrssions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_first_mobile_number {
    //each number should contain 10 digit numbers
    //first digit should be 6,7,8,9
    // (0/+91)?[7-9][0-9]{9}
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String df = sc.nextLine();
        Pattern p = Pattern.compile("(0|[+]91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(df);
        if (m.find() && m.group().equals(df) ){
            System.out.println("valid Mobile");

        }
        else {
            System.out.println("not valid");
        }
    }
}
