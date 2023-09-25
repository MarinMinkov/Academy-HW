package com.company;

import java.util.Scanner;

public class Main {

    public static void collectNumbers (int count)
    {
        Scanner scanner = new Scanner(System.in);
        int [] arr;
        if (count==1)
        {
            System.out.println("Enter " + count + " number.");
            arr = new int[count];
        }
        else if (count>1)
        {
            System.out.println("Enter " + count + " numbers.");
            arr = new int[count];
        }
        else
        {
            System.out.println("Error. Negative numbers not allowed!");
            arr = new int[0];
        }
        for (int i = 0; i < count; i++)
        {
            arr[i]= scanner.nextInt();
        }

        for (int i = 0; i < count; i++)
        {
            if (i<count-1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int count = scanner.nextInt();
        collectNumbers(count);

    }
}
