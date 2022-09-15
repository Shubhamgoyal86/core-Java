package com.Collection_FrameWork.List.ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Create_Arraylist_From_Constructors {
    public static void main(String[] args) {
        // creating another arrayloist using the constructors
        List<Integer> firstfiveprimenumbers = new ArrayList<>();
        firstfiveprimenumbers.add(2);
        firstfiveprimenumbers.add(3);
        firstfiveprimenumbers.add(5);
        firstfiveprimenumbers.add(7);
        firstfiveprimenumbers.add(11);

        // now it is the turn to make new Arraylist

        List<Integer> firsttenprimenumbers = new ArrayList<>(firstfiveprimenumbers);


        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firsttenprimenumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firsttenprimenumbers);




    }
}
