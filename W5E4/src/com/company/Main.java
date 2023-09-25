package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] arrOne = new int[5];
        int [] arrTwo = new int[5];
        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < arrOne.length; i++)
        {
            arrOne[i] = random.nextInt(10);
            arrTwo[i] = random.nextInt(10);
            sumOne += arrOne[i];
            sumTwo += arrTwo[i];
        }

        System.out.println("Sum One: " + sumOne);
        System.out.println("Sum Two: " + sumTwo);

        if (sumOne>sumTwo)
        {
            System.out.println("Array one has bigger sum.");
            for (int i = 0; i < arrOne.length; i++)
            {
                System.out.print(arrOne[i]+" ");
            }
        }
        else
        {
            System.out.println("Array two has bigger sum.");
            for (int i = 0; i < arrTwo.length; i++)
            {
                System.out.print(arrTwo[i]+" ");
            }
        }

    }
}
