package com.Collection_FrameWork.Collections;


import java.util.ArrayList;
import java.util.Collection;

public class Collections_Demo {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();
        fruits.add("sitafal");
        fruits.add("narangi");
        fruits.add("chiku");
        fruits.add("kela");
        fruits.add("papita");
        fruits.add("kharbuja");
        fruits.remove("chiku");
        System.out.println(fruits);

        System.out.println(fruits.contains("narangi"));
        fruits.forEach((element)->{
            System.out.println(element);
        });
    }
}
