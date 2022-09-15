package com.Collection_FrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Constructors {
    public static void main(String[] args) {

      Set<Integer> firstfiveEvenNumbers = new HashSet<>();
      firstfiveEvenNumbers.add(2);
        firstfiveEvenNumbers.add(4);
        firstfiveEvenNumbers.add(6);
        firstfiveEvenNumbers.add(8);
        firstfiveEvenNumbers.add(10);

        Set <Integer> tenEvenNUmbers = new HashSet<>(firstfiveEvenNumbers);

        Set<Integer> nextFiveEven = new HashSet<>();
        nextFiveEven.add(12);
        nextFiveEven.add(14);
        nextFiveEven.add(16);
        nextFiveEven.add(18);
        nextFiveEven.add(20);

        tenEvenNUmbers.addAll(nextFiveEven);
        System.out.println(tenEvenNUmbers);





     }
}
