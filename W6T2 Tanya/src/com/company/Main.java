package com.company;

import java.util.Scanner;

public class Main
    {

    public static int maxElementOfString(String str)
    {

        String[] arr = str.split(",");
        int max = Integer.parseInt(arr[0]);

        for (int i = 0; i < arr.length; i++)
        {

            max = Integer.parseInt(arr[i]);
            if (max < Integer.parseInt(arr[i]))
            {
            }
        }
        return max;
    }

    public static void main(String[] args)
    {

        String str = "";
        int n = 0;
        int j = 0;
        int temp[] = new int[100];

        do
        {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();

            if (str.equals("end"))
            {
                break;
            }
            else
                n = n + 1;
            j = j + 1;
            temp[j] = maxElementOfString(str);
        } while (!str.equals("end"));

        for (j = 1; j < n + 1; j++)
        {
            System.out.println(temp[j]);
        }
    }
    }

