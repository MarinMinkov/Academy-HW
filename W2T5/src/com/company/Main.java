package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 5 Solution 1
        Scanner scanner = new Scanner(System.in);
        String choice;
        int pizzaPrice = 10, burgerPrice = 5, juicePrice = 3; //При промяна в цените ще е по-лесно да се променят тук вместо да се търсят в кода.
        choice = scanner.nextLine().toLowerCase(); // Take and normalize the user input.
        if (choice.contentEquals("pizza"))
        {
            System.out.println(pizzaPrice + "lv");
        }
        else if (choice.contentEquals("burger"))
        {
            System.out.println(burgerPrice + "lv");
        }
        else if (choice.contentEquals("juice"))
        {
            System.out.println(juicePrice + "lv");
        }
        else
        {
            System.out.println("Error");
        }
    }
    }
