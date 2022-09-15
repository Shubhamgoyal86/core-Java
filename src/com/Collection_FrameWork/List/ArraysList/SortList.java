package com.Collection_FrameWork.List.ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(40);

        Collections.sort(numbers);
        System.out.println(numbers);// ascending order

        Collections.reverse(numbers);
        System.out.println(numbers); // descending order

    }
}
