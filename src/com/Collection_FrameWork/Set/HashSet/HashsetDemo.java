package com.Collection_FrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {


        Set<String> friends = new HashSet<>();
        friends.add("Shubham");
        friends.add("Surya");
        friends.add("Shubham");// cannot have duplicate elements
        friends.add(null);// allows null value
        System.out.println(friends);

        Set <Integer > numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        numbers.add(10);/// does not maintain order of the set
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);




    }


}
