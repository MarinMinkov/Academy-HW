package com.company;
import java.util.Scanner;
public class Main
    {
    public static void main(String[] args)
    {   // Task 2
        Scanner scanner = new Scanner(System.in);
        Double grade[] = new Double[5];
        double avg;
        System.out.println("Enter 5 grades");
        grade[0] = scanner.nextDouble();
        grade[1] = scanner.nextDouble();
        grade[2] = scanner.nextDouble();
        grade[3] = scanner.nextDouble();
        grade[4] = scanner.nextDouble();
        avg = (grade[0] + grade[1] + grade[2] + grade[3] + grade[4]) / 5.0;
        if (avg < 3)
        {
            System.out.println("Slab");
        }
        else if (avg >= 3 && avg < 3.5)
        {
            System.out.println("Sreden");
        }
        else if (avg >= 3.5 && avg < 4.5)
        {
            System.out.println("Dobar");
        }
        else if (avg >= 4.5 && avg < 5.5)
        {
            System.out.println("Mn. Dobar");
        }
        else if (avg >= 5.5 && avg <= 6)
        {
            System.out.println("Otlichen");
        }
        else
        {
            System.out.println("Error");
        }
    }
    }
