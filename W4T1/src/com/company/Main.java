package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int [] arr;
        int max = 0;
        Random rand = new Random();

        while (true)
        {
            System.out.println("Enter a number from 1 to 20.");
            size = scanner.nextInt();
            if (size > 0 && size <= 20)
            {
                arr = new int[size];
                break;
            }
            else
            {
                System.out.println("Wrong input!");
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100) + 1;
            System.out.println(arr[i]);
            max = Integer.max(max , arr[i]);
        }

        System.out.println("The biggest number is: " + max);
    }
}
