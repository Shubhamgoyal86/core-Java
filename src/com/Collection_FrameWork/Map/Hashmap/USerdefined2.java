package com.Collection_FrameWork.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class USerdefined2 {
    public static void main(String[] args) {
        Map<Integer, Student> StudentMap = new HashMap<Integer, Student>();
        StudentMap.put(1,new Student("Shubham","Goyal"));
        StudentMap.put(2,new Student("Sanju ","Goyal"));

        System.out.println(StudentMap);

    }
}
