package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrOne = new int[5];
        int [] arrTwo = new int[5];
        int [] arrSum = new int[5];

        for (int i = 0; i < arrOne.length; i++)
        {
            System.out.print("Enter array One number at index " + i + " ");
            arrOne[i] = scanner.nextInt();
            System.out.print("Enter array Two number at index " + i + " ");
            arrTwo[i] = scanner.nextInt();

            arrSum[i] = arrOne[i] + arrTwo[i];
        }

        for (int i = 0; i < arrSum.length; i++)
        {
            System.out.print(arrSum[i]+" ");
        }

    }
}
