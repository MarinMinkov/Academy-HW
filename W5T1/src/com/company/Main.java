package com.company;

public class Main {

    public static void printArray (String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        String[] arrOne = { "Continue Game", "New Game", "Exit" };
        String[] arrTwo = { "Home", "About", "Contact Us" };


        printArray(arrOne);
        printArray(arrTwo);


    }
}
