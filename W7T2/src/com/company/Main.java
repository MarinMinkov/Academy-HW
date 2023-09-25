package com.company;

import java.util.Scanner;

public class Main {

    public static int totalPrice (String input)
    {
        String [] splitInput = input.split(" ");
        int total = 0;
        total = Integer.parseInt(splitInput[1]) * Integer.parseInt(splitInput[2]);
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String [] splitInput;
        int total = 0;

        while (true)
        {
            input = scanner.nextLine();
            if (input.equals("end"))
            {
                System.out.println();
                break;
            }
            else
            {
                total=totalPrice(input);
            }
            splitInput = input.split(" ");
            System.out.printf("%n%s Total: %d",splitInput[0],total);
        }

    }
}
