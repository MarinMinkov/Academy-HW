package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 100; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
    }
