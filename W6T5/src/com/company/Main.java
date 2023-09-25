package com.company;

public class Main {

    public static void transfer (int [] arrOne, int [] arrTwo)
    {
        int temp;

        for (int i = 0; i < arrOne.length; i++)
        {
            temp = arrOne[i];
            arrOne[i] = arrTwo[i];
            arrTwo[i] = temp;
        }

    }


    public static void main(String[] args) {

        int[] arrA = { 1, 2, 3, 4, 5 };
        int[] arrB = { 5, 10, 20, 30, 4 };

        transfer(arrA, arrB);

        int a =1; // Added just to use for a break point to check the functionality


    }
}
