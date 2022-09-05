package com.oops.Encapsulation;
class Student1 {
    private int rollNo;
    private String Name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

public class EncapuslationExample {
    public static void main(String[] args) {

        Student1 sd = new Student1();
        sd.setRollNo(45);
        System.out.println(sd.getRollNo() );
    }
}
