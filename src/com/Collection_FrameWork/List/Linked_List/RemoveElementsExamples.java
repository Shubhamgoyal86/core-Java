package com.Collection_FrameWork.List.Linked_List;

import java.util.LinkedList;

public class RemoveElementsExamples {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");

        fruits.add("orange");
        String  remove  = fruits.removeFirst();
        System.out.println(fruits);
        fruits.remove("Mango");
        System.out.println(fruits);


    }
}
