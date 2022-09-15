package com.Collection_FrameWork.List.Linked_List;

import java.util.LinkedList;

public class RetrieveElementsExamples {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");


        fruits.add("orange");

        String Firstelemnt = fruits.getFirst();
        System.out.println(Firstelemnt);

    }
}
