package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.printf(" ");
            }

            System.out.printf("%s%n", text.charAt(i));
        }

    }
}
