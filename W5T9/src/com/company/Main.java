package com.company;

import java.util.Scanner;

public class Main {

    public static double GetAverage (int[] nums)
    {
        double sum=0;

        for (int i = 0; i<nums.length; i++)
        {
            sum+=nums[i];
        }

        return sum/nums.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if (size>0)
        {
            int [] arr = new int[size];
            for (int i = 0; i < size; i++)
            {
                arr[i] = scanner.nextInt();
            }

            System.out.println(GetAverage(arr));
        }
        else
        {
            System.out.println("Error. Array size can't be 0 or negative");
        }
    }
}
