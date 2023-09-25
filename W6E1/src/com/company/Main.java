package com.company;

import java.util.Scanner;

public class Main {

    public static double getAverage(int... nums)
    {
        double sum=0;

        for (int i = 0; i < nums.length; i++)
        {
            sum+=nums[i];
        }

        return sum/ nums.length;
    }
    public static void getAverageNew(int... nums)
    {
        Scanner scanner = new Scanner(System.in);
        int arr[];

        System.out.println("Filling " + nums.length + " arrays.");
        for (int i = 0; i < nums.length; i++)
        {
            arr=new int[nums[i]];
            System.out.println("Array " + i);
            System.out.println("Enter " + nums[i] + " numbers:");
            double sum=0;
            for (int j = 0; j < arr.length; j++)
            {
                arr[j]=scanner.nextInt();
                sum+=arr[j];
            }
            System.out.print("The array contains:");
            for (int n = 0; n < arr.length; n++)
            {
                System.out.print(arr[n] + ", ");
            }
            System.out.println(" Average: " + (sum / arr.length));


        }

    }
    public static void main(String[] args)
    {

        System.out.println(getAverage(1,2,3,4));

        getAverageNew(3,5,4,6);
    }
}
