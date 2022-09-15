package com.Collection_FrameWork.List.ArraysList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateOverList {
    public static void main(String[] args) {
        List<String>  courses = Arrays.asList("c","c++","Java","Spring","Hibernamte");

        //By using for Loop
        for (int i = 0 ; i<courses.size();i++){

            System.out.println(courses.get(i));

            // By using Enhanced Loop
            for (String sd:courses){
                System.out.println(sd);
            }

            //Basic Loop with Iterator


        }
    }
}
