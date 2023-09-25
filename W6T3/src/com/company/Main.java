package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] products = {"Salmon", "Rice", "Pasta", "Butter", "Milk", "Eggs", "Honey"};
        String userInput;

        while (true)
        {
            userInput = scanner.nextLine();
            if (userInput.equals("end"))
            {
                break;
            }
            else
            {
                for (int i = 0; i < products.length; i++)
                {
                    if (userInput.equals(products[i]))
                    {
                        System.out.println("True");
                        break;
                    }
                    else
                    {
                        if (i == products.length - 1)
                        {
                            System.out.println("False");
                        }
                    }
                }

            }
        }

    }
}