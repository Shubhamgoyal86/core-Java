package com.Collection_FrameWork.List.Linked_List;

import java.util.LinkedList;

public class SearchExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");

        fruits.add("orange");

        boolean result = fruits.contains("Mango");
        System.out.println(result);

        int  sc = fruits.indexOf("orange");
        System.out.println(sc);
        for (int i = 0 ; i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

    }
}
