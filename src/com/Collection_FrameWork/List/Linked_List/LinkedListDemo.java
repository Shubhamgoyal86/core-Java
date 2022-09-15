package com.Collection_FrameWork.List.Linked_List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");

        fruits.add("orange");

        System.out.println(fruits);

        fruits.add(2,"Watermelon"); // we can addd by numbers
        System.out.println(fruits);
        fruits.addFirst("Strwberry");
        System.out.println(fruits);


    }
}
