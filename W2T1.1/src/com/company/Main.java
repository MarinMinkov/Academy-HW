package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 1, Solution 2
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char operation;

        System.out.println("Enter 2 numbers");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("Enter operation: + - * / ");
        operation = scanner.next().charAt(0);
        switch (operation)
        {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
    }
