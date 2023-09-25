package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 1, Solution 1
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char operation;

        System.out.println("Enter 2 numbers");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("Enter operation: + - * / ");
        operation = scanner.next().charAt(0);
        if (operation == '+')
        {
            System.out.println(a + "+" + b + "=" + (a + b));
        }
        else if (operation == '-')
        {
            System.out.println(a + "-" + b + "=" + (a - b));
        }
        else if (operation == '*')
        {
            System.out.println(a + "*" + b + "=" + (a * b));
        }
        else if (operation == '/')
        {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
        else
        {
            System.out.println("Wrong input");
        }

    }
    }
