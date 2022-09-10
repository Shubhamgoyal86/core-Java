package com.Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class insertionOrder {
    public static void main(String[] args) {
        List<String > numbers = new ArrayList<>();
        //it maintains the insertion order
        numbers.add("1");        //it maintains the insertion order
        numbers.add("5");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        System.out.println(numbers);
        //Get Methods
        System.out.println(numbers.get(0)); // get Methods \
    }
}
