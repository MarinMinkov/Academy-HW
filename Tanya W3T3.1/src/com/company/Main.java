package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);
            System.out.printf("%s%n", letter);
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("*");

            }

        }
    }
}
