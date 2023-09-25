package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] arrA = new int[5];
        int [] arrB = new int[5];

        for (int i = 0; i < arrA.length; i++)
        {
            arrA[i]=random.nextInt(10);
        }

        for (int i = 0; i < arrB.length; i++)
        {
            arrB[i]=random.nextInt(10);
        }

        for (int i = 0; i < arrA.length; i++)
        {
            if (arrA[i] == arrB[i])
            {
                System.out.println("Number: "+arrA[i]+" at index: "+i);
            }
        }


    }
}
