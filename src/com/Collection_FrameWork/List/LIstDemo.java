package com.Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class LIstDemo {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        // List allows Us to add Duplicate Elemnts
        friends.add("shubham");
        friends.add("shubham");
        friends.add("Surya");
        friends.add("Ankit");
        friends.add(null);
        //list allows us to add null values
        //it maintains the insertion order

        System.out.println(friends);

    }
}
