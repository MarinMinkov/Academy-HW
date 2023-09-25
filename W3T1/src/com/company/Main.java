package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chouce;
        boolean menuActive = true;
        while (menuActive)
        {
            System.out.println("1. Insert new car");
            System.out.println("2. Show cars");
            System.out.println("0. Exit");
            chouce = scanner.nextLine();
            switch (chouce)
            {
                case "1":
                    System.out.println("New car added!");
                    break;
                case "2":
                    System.out.println("Mercedes, Bmw, Audi available!");
                    menuActive = false; //в условието не е уточнено да се дава възможност за избиране от менюто както при опция 1.
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    menuActive = false;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }

        }
    }
}
