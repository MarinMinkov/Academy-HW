package com.company;
import java.util.Scanner;
public class Main
    {
    public static void main(String[] args)
    {
        //Task 5 Solution 3 (Modified to accept more than one input.
        //Accepts a full sentence like "I want a Pizza and a Juice" and outputs the individual and total prices)
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean error = true;
        int pizzaPrice = 10, burgerPrice = 5, juicePrice = 3; //При промяна в цените ще е по-лесно да се променят тук вместо да се търсят в кода.
        int total = 0;
        choice = scanner.nextLine().toLowerCase(); // Take and normalize the user input.
        if (choice.contains("pizza"))
        {
            System.out.println("Pizza:" + pizzaPrice + "lv");
            total = total + pizzaPrice;
            error = false;
        }
        if (choice.contains("burger"))
        {
            System.out.println("Burger:" + burgerPrice + "lv");
            total = total + burgerPrice;
            error = false;
        }
        if (choice.contains("juice"))
        {
            System.out.println("Juice:" + juicePrice + "lv");
            total = total + juicePrice;
            error = false;
        }
        if (error)
        {
            System.out.println("Error");
        }
        else
        {
            System.out.println("Total:" + total + "lv");
        }
    }
    }
