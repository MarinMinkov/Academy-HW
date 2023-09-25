package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 3
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Input your income:");
        x = scanner.nextInt();
        System.out.println("Input your expenses:");
        y = scanner.nextInt();
        if (x < y)
        {
            System.out.println("Loss $" + (x - y));
        }
        else if (x > y)
        {
            System.out.println("Won $" + (x + y));
        }
        else
        {
            System.out.println("Breakeven");
        }
    }
    }
