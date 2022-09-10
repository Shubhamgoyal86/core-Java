package com.Collection_FrameWork.Collections;

public class Need_Of_Collections_Framework {
    public static void main(String[] args) {


        Student[] student = new Student[10];
        student[0] = new Student();
        student[1] = new Student();
        // Limitations of Arrays
        // 1. Arrays are fixed size...
        // 2. Arrays can hold  only homogeneous data elemnts
        // 3. Readymade APIs Support is not available in array....
//        student[2] = new Book(); // in this if we make book object than it shows errorr


        Object[] object = new Object[10];
        object[1] = new Student();
        object[2] = new Book();// in this case we can get both Book and Student Method

    }
}
class Book {

}
class  Student{

}
