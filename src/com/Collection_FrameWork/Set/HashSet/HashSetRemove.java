package com.Collection_FrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemove {
    public static void main(String[] args) {
        Set <Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // removing the Numbers
//        numbers.remove(1);
//        System.out.println(numbers);

        //removeall() method
        Set<Integer> even = new HashSet<>();
        even.add(1);
        even.add(3);
        even.add(5);
        even.add(7);
        even.add(9);

        // Now we USe Removeall() method

        numbers.removeAll(even);
        System.out.println(numbers);





    }
}
