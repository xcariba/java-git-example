package com.example.lesson6.primitives;

import java.util.ArrayList;
import java.util.List;

public class PrimitivesMain
{
    public static void main(String[] args)
    {
        // List<int> primitiveList = new ArrayList<>();

        List<Integer> myList = new ArrayList<>();

        myList.add(null);
        myList.add(new Integer(12));
        myList.add(Integer.valueOf(12));
        myList.add(12);

        Integer firstNumber = myList.get(0);
        System.out.println("FirstNumber: " + firstNumber);

        int secondNumber = myList.get(1);
        System.out.println("SecondNumber: " + secondNumber);

        int thirdNumber = myList.get(2);
        System.out.println("ThirdNumber: " + thirdNumber);

        int fourthNumber = myList.get(2);
        System.out.println("FourthNumber: " + fourthNumber);

        int primitiveNumber = myList.get(0);
        System.out.println("PrimitiveNumber: " + primitiveNumber);
    }
}
