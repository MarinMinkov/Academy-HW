package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrOne = new int[3];
        int [] arrTwo = new int[3];
        for (int i = 0; i<arrOne.length; i++)
        {
            System.out.print("Enter a number: ");
            arrOne[i] = scanner.nextInt();
        }

        System.out.println("Doubled numbers: ");

        for (int i = 0; i<arrTwo.length; i++)
        {
            arrTwo[i] = arrOne[i]*2;
            System.out.println(arrTwo[i]);
        }

    }
}
