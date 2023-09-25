package com.company;

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {
        //Task 5 Solution 2
        Scanner scanner = new Scanner(System.in);
        String choice;
        int pizzaPrice = 10, burgerPrice = 5, juicePrice = 3; //При промяна в цените ще е по-лесно да се променят тук вместо да се търсят в кода.
        choice = scanner.nextLine().toLowerCase(); // Take and normalize the user input.
        switch (choice)
        {
            case "pizza":
                System.out.println(pizzaPrice + "lv");
                break;
            case "burger":
                System.out.println(burgerPrice + "lv");
                break;
            case "juice":
                System.out.println(juicePrice + "lv");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    }
