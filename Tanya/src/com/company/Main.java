package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int total = 1;

        int[] row = new int[x];

        if (((1 <= x) && (x <= 20)) && ((1 <= y) && (y <= 20))) {

            for (int count = 1; count <= y; count++) {

                for (int j = 0; j < row.length; j++) {
                    row[j] = total;
                    total++;
                }


                for (int j : row)
                    System.out.print(j + " ");
                System.out.println(" ");
                x = x + x;
            }

        }
    }
}


