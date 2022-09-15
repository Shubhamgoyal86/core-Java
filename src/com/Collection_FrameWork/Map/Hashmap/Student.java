package com.Collection_FrameWork.Map.Hashmap;

public class Student {


        private String Firstname;
        private  String Lastname;

        public Student(String firstname, String lastname) {
            super();
            Firstname = firstname;
            Lastname = lastname;
            //Goto USerdefined 2 ...................................
        }

        @Override
        public String toString() {
            return "Student{" +
                    "Firstname='" + Firstname + '\'' +
                    ", Lastname='" + Lastname + '\'' +
                    '}';
        }
    }

