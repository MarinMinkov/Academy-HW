package com.company;

import java.util.Scanner;

public class Main {

    public static int total (String [] prices, String input)
    {
        int total = 0;
        String [] splitInput = input.split(",");

        for (int i = 0; i < splitInput.length; i+=2)
        {
            total += Integer.parseInt( prices[ Integer.parseInt( splitInput[i] ) ]) * Integer.parseInt( splitInput[i+1] );
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] products = {"Salmon", "Rice", "Pasta", "Butter", "Milk", "Eggs", "Honey"};
        String [] prices = {"10", "1", "1", "5", "3", "2", "10"};
        String input;

        for (int i = 0; i < products.length; i++)
        {
            System.out.println( (i) + " - " + products[i] + " - " + prices[i]);
        }

        input = scanner.nextLine();
        System.out.println( total( prices, input ) );
    }
}
