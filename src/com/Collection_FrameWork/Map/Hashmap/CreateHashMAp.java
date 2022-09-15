package com.Collection_FrameWork.Map.Hashmap;

import java.security.Key;
import java.util.*;

public class CreateHashMAp {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One",1 );
        numbers.put("Two",2 );
        numbers.put("Three",3);
        numbers.put("Four",4 );
        numbers.put("Five",5 );
        System.out.println(numbers);


        boolean nc = numbers.isEmpty();
        System.out.println(nc);

        int sc = numbers.size();
        System.out.println(sc);

// checking Whether the element is existed or Not
        if (numbers.containsKey("gh")){
            System.out.println("it is existed");
        }
        else {
            System.out.println("it is not Existed");
        }

        // Checking To get value By The Key
        int sp = numbers.get("Four");
        System.out.println(sp);

        //removing The Key from Hashmap
        numbers.remove("One");
        System.out.println(numbers); // One is removed

        // get only keys from Hashmap
        Set<String> cb = numbers.keySet();
        System.out.println(cb);

        // get only values from Hashmap
        Collection<Integer> values = numbers.values();
        System.out.println(values);

    }
}
