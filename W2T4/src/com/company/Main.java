package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 4
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a == b && b == c)
        {
            System.out.println("Triagalnika e ravnostranen");
        }
        else
        {
            System.out.println("Triagalnika ne e ravnostranen");
        }
    }
    }
