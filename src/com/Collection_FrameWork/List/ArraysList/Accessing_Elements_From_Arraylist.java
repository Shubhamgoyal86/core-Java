package com.Collection_FrameWork.List.ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Accessing_Elements_From_Arraylist {
    public static void main(String[] args) {

        List<String> language = new ArrayList<>();
        // we can use is isEmpty to check if it is empty or not
        // we can use is size  to check what is the size of the arraylist

        language.add("Java");//0
        language.add("c++");//1

        language.add("html");//2
        language.add("css");//3
        language.add("xml");//4

        String name = language.get(0);
        System.out.println("my favourite language is "+name);

        language.set(1,"Python");
        System.out.println(language);// USing Set Method To

//        language.remove(3); // we   can use remove method to remove the one element
//        System.out.println(language);

        List<String> sublanguage = new ArrayList<>();
        sublanguage.add("html");
        sublanguage.add("css");
        sublanguage.add("xml");

        language.removeAll(sublanguage);
        System.out.println(language);

        //clear method to clear all the elements......


    }

}
