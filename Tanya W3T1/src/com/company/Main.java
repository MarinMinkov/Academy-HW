package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String num;
        do
        {
            System.out.println("Choice from menu:");
            System.out.println("1.Insert new car");
            System.out.println("2.Show cars");
            System.out.println("0.Exit");
            num = scanner.nextLine();
            if (num.equals("1"))
            {
                System.out.println("add a car");
            }
            else if (num.equals("2"))
            {
                System.out.println("Mercedes, BMW, Audi available");
            }
            else if (num.equals("0"))
            {
                System.out.println("Goodbye");
            }
            else
            {
                System.out.println("Wrong choice!");
            }
        } while (!(num.equals("0")));
    }
    }


