package com.company;
//import java.util.Random;
import java.util.Scanner;
//import.java.util.Arrays;

public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    int br = 1;

    int b = 0;
    int[] row = new int[x];

    if (((1 <= x) && (x <= 20)) && ((1 <= y) && (y <= 20))) {




            for (int i = 0; i < x; i++)
            {
                for (int j = 0; j < y; j++) {
                    row[i] = br;
                    br = br +1;

                    System.out.print(row[i] + " ");

                }

                System.out.println();
            }

            System.out.println(" ");



    }


}}
