package com.RegularExprrssions;
import java.util.Scanner;
import java.util.regex.*;

public class regexfind_method {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int count =0;
            Pattern p = Pattern.compile(str);
            Matcher m = p.matcher("a665575vkmdkmdkv&&&^%435445#$dsfsdfr$%%^$%rfdsfs");
            while (m.find()){
                count++;
                System.out.println(m.start());
                System.out.println(m.start()+".."+m.end()+"..."+m.group()+"..");

            }
            System.out.println(count);

    }
}
