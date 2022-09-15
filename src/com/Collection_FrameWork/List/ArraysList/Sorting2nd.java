package com.Collection_FrameWork.List.ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting2nd {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(10,"Shubham",20,350000));
        employee.add(new Employee(11,"Surya",40,3500));
        employee.add(new Employee(12,"Deepak",45,5000));
        employee.add(new Employee(13,"Chintu",46,15000));

        Collections.sort(employee,new MySort());
        System.out.println(employee);
    }
}
class MySort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2)     {
        return (int) (o1.getSalary()-o2.getSalary());//////////////// o1-o2 to get salary in ascendind order and o2-o1 to get descending order
    }
}