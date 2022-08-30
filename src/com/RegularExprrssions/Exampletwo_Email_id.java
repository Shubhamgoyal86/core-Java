package com.RegularExprrssions;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exampletwo_Email_id {
    // shubhamgoyal402 @ gmail.com
    //a-z A-Z 0 to 9 _ and . only these symbols allowed for before the @

    // for gmail:- their are a-z and A-z and number also allowed
    // for com-> their are only a-z and A-Z characters
    // Rewpresentation:- [a-z A-Z 0-9][a-z A-Z 0-9 _.]* @[a-z A-Z 0-9]+ ([.][a-z A-Z])+
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        Pattern p = Pattern.compile("[a-z A-Z 0-9][a-z A-Z 0-9 _.]*@[a-z A-Z 0-9]+([.][a-z A-Z]+)+");
        Matcher m = p.matcher(email);
        if(m.find() && m.group().equals(email)){
            System.out.println("valid email id ");
        }
        else {
            System.out.println("not valid");
        }
    }
}
