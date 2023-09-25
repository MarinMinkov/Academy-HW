package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int [] arr1 = new int[100];
        Boolean numExists = false;

        for (int i = 0; i< arr1.length; i++)
        {
            arr1[i] = random.nextInt(101);
        }

        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i]==52)
            {
                numExists = true;
                break;
            }
            else
            {
                numExists = false;
            }
        }

        if (numExists)
        {
            System.out.println("52 found in the array");
        }
        else
        {
            System.out.println("52 not found in the array");
        }
    }
}
